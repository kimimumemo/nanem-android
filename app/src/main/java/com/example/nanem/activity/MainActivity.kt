package com.example.nanem.activity

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.nanem.R
import com.example.nanem.reminder.SettingAlarmActivity

class MainActivity : AppCompatActivity() , View.OnClickListener {

    private var title: String = "Nanem"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)
        val actionbar = supportActionBar
        actionbar!!.title= "Nanem"
        val btnJenisTanah : Button = findViewById(R.id.jenistanah)
        val btnScan : Button = findViewById(R.id.scan)
        val btnAbout : Button = findViewById(R.id.about)
        val btnAlarm : Button = findViewById(R.id.alarm)
        val btnWeather : Button = findViewById(R.id.weather)
        btnJenisTanah.setOnClickListener(this)
        btnScan.setOnClickListener(this)
        btnAbout.setOnClickListener(this)
        btnAlarm.setOnClickListener(this)
        btnWeather.setOnClickListener(this)

        btnWeather.setOnClickListener {
            val i = Intent()
            i.action = Intent.ACTION_VIEW
            i.addCategory(Intent.CATEGORY_BROWSABLE)
            i.data = Uri.parse("https://weather.com/")
            startActivity(i)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.jenistanah ->{
                title="Jenis Tanah"
                val iJenis = Intent(this, JenisTanahActivity::class.java)
                startActivity(iJenis)
            }

            R.id.scan ->{
                title="Scan Tanah"
                val iScan = Intent(this, UploadFoto::class.java)
                startActivity(iScan)
            }

            R.id.about ->{
                title="About Us"
                val iAbout = Intent(this, AboutUs::class.java)
                startActivity(iAbout)
            }
            R.id.alarm ->{
                title="Reminder"
                val iAlarm = Intent(this, SettingAlarmActivity::class.java)
                startActivity(iAlarm)
            }
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                title = "About Us"
                val iAbout = Intent(this, AboutUs::class.java)
                startActivity(iAbout)
            }
            R.id.action_JenisTanah ->{
                val iJenis = Intent(this, JenisTanahActivity::class.java)
                startActivity(iJenis)
            }
        }
        setActionBarTitle(title)
    }
}