package io.bluetrace.xexcovid.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.main_activity_howitworks.*
import io.bluetrace.xexcovid.R
import io.bluetrace.xexcovid.onboarding.OnboardingActivity

class HowItWorksActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_howitworks)
        btn_onboardingStart.setOnClickListener {
            val intent = Intent(this, OnboardingActivity::class.java)
            startActivity(intent)
        }
    }
}
