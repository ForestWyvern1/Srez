package com.example.srez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        toReg.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }
        sign_in.setOnClickListener {
            startActivity(Intent(this, SigninActivity::class.java))
        }
    }
}