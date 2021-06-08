package com.example.nanem.activity

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.ImageDecoder
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.nanem.databinding.ActivityUploadFotoBinding
import com.example.nanem.tflite.Classifier
import java.io.InputStream

class UploadFoto : AppCompatActivity() {
    private val SELECT_IMAGE = 10
    private val OPEN_CAM = 20
    private lateinit var binding:ActivityUploadFotoBinding
    private lateinit var classifier: Classifier
    private val modelName = "model_3-2.tflite"
    private val labelName = "labels.txt"
    private val inputSize = 224
    //var imageView: ImageView? = null
    //var bitmap: Bitmap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUploadFotoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //imageView = findViewById(R.id.displayImage)

        binding.openCam.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, OPEN_CAM)
        }

        binding.openGallery.setOnClickListener {
            val intent = Intent()
            intent.type = "image/*"
            intent.setAction(Intent.ACTION_GET_CONTENT)
            startActivityForResult(Intent.createChooser(intent, "Select Picture"), SELECT_IMAGE)
        }

        // Init classifier
        classifier = Classifier(assets, modelName, labelName, inputSize)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == RESULT_OK) {
            if (requestCode == OPEN_CAM) {
                Log.d("LOGGER", "opencam ok")
                val selectedImage = data!!.data
                val inputStream: InputStream? = null
                val bitmap: Bitmap?
                bitmap = data.extras!!["data"] as Bitmap?
                binding.displayImage.setImageBitmap(bitmap)
                BitmapFactory.decodeStream(inputStream)
                binding.displayImage.setImageURI(selectedImage)

                //Predicting image
                var resized: Bitmap? = bitmap?.let { Bitmap.createScaledBitmap(it, 224,224,true) }

                if (resized != null) {
                    val result = classifier.recognizeImage(resized)
                    Log.d("LOGGER", result.get(0).title)
                    binding.textpred.text = result.get(0).title
                    //Toast.makeText(this, result.get(0).title, Toast.LENGTH_SHORT).show()
                }
            }
            else if (requestCode == SELECT_IMAGE) {
                val bitmap = MediaStore.Images.Media.getBitmap(
                    this.contentResolver,
                    data?.data
                )
                binding.displayImage.setImageBitmap(bitmap)

                //Predicting image
                var resized: Bitmap? = bitmap?.let { Bitmap.createScaledBitmap(it, 224,224,true) }

                if (resized != null) {
                    val result = classifier.recognizeImage(resized)
                    Log.d("LOGGER", result.get(0).title)
                    binding.textpred.text = result.get(0).title
                    //Toast.makeText(this, result.get(0).title, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}