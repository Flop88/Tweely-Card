package ru.tweely.tweelyapp.di

import org.kodein.di.*
import ru.tweely.tweelyapp.di.engine.engineModule
import kotlin.native.concurrent.ThreadLocal

//KMM SDK FOR TWEELY APPs

@ThreadLocal
object TweelySDK {

    internal val di: DirectDI
        get() = requireNotNull(_di)
    private var _di: DirectDI? = null


    fun init(configuration: Configuration) {
        val configurationModule = DI.Module(
            name = "configurationModule",
            init = {
                bind<Configuration>() with singleton { configuration }
            }
        )

        if (_di != null) {
            _di = null
        }

        val direct = DI {
            importAll(
                configurationModule,
                engineModule
            )
        }.direct

        _di = direct
    }
}