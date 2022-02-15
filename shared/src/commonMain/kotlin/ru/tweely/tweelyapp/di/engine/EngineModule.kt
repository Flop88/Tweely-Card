package ru.tweely.tweelyapp.di.engine

import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.instance
import org.kodein.di.singleton
import ru.tweely.tweelyapp.di.TweelySDK

internal val engineModule = DI.Module(
    name = "EngineModule",
    init = {
        bind<PageGenerator>() with singleton { PageGenerator() }
    }
)

val TweelySDK.engine: PageGenerator
    get() = TweelySDK.di.instance()