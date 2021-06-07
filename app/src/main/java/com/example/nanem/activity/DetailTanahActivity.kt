package com.example.nanem.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.nanem.R

class DetailTanahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tanah)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Tanah"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val dogImages: ImageView = findViewById(R.id.imgDog)
        val dogNames: TextView = findViewById(R.id.Dogname)
        val dogDetails: TextView = findViewById(R.id.Dogdetail)

        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)

        dogNames.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(dogImages)
        dogDetails.text = tDetail
    }
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}