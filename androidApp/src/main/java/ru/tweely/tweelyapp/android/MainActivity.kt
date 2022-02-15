package ru.tweely.tweelyapp.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import ru.tweely.tweelyapp.di.Configuration
import ru.tweely.tweelyapp.di.PlatformType
import ru.tweely.tweelyapp.di.TweelySDK
import ru.tweely.tweelyapp.di.engine.engine

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TweelySDK.init(
            configuration = Configuration(
                platformType = PlatformType.Android(version = "1.0", "1")
            )
        )
        val tv: TextView = findViewById(R.id.text_view)
        tv.text = TweelySDK.engine.greeting()
    }
}
