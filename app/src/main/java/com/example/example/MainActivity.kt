package com.example.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.example.databinding.ActivityMainBinding
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AppCenter.start(application, "3e262042-852f-41bc-8b2f-6abc688717ea", Analytics::class.java, Crashes::class.java)

        binding.btnCrash.setOnClickListener {
//            throw Exception("Something went wrong")
//            Crashes.generateTestCrash()
            Analytics.trackEvent("wrong button")
        }
    }
}