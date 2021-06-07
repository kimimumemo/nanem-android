package com.example.nanem.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nanem.R

class AboutUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about__us)
        val actionbar = supportActionBar
        actionbar!!.title = "About Us"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}