package com.example.yatt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCenter.start(
            application, "991e68d2-101e-4136-bd1c-1c9f9a904773",
            Analytics::class.java, Crashes::class.java
        )
        setContentView(R.layout.activity_main)
    }
}