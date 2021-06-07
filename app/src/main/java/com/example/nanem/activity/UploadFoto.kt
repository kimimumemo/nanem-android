package com.example.nanem.activity

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.nanem.databinding.ActivityUploadFotoBinding
import com.example.nanem.tflite.Classifier
import java.io.InputStream

class UploadFoto : AppCompatActivity() {
    private val SELECT_IMAGE = 100
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
            val i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(i, SELECT_IMAGE)
        }

        binding.openGallery.setOnClickListener {
            val i = Intent(
                Intent.ACTION_PICK,
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            )
            startActivityForResult(i, SELECT_IMAGE)
        }

        // Init classifier
        classifier = Classifier(assets, modelName, labelName, inputSize)
    }

    fun openCamera(view: View?) {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, SELECT_IMAGE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == SELECT_IMAGE) {
            if (resultCode == RESULT_OK) {
                val selectedImage = data!!.data
                val inputStream: InputStream? = null
                val bitmap: Bitmap?
                bitmap = data.extras!!["data"] as Bitmap?
                binding.displayImage.setImageBitmap(bitmap)
                BitmapFactory.decodeStream(inputStream)
                binding.displayImage.setImageURI(selectedImage)

                //Predicting image
                var resized: Bitmap? = bitmap?.let { Bitmap.createScaledBitmap(it, 224,224,true) }
                //val model = Model32.newInstance(this)

                // Creates inputs for reference.
                //val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 224, 224, 3), DataType.FLOAT32)
                //tbuffer = TensorImage.fromBitmap(resized)
                //var byteBuffer = tbuffer.buffer
                //inputFeature0.loadBuffer(byteBuffer)

                // Runs model inference and gets result.
                //val outputs = model.process(inputFeature0)
                //val outputFeature0 = outputs.outputFeature0AsTensorBuffer
                // binding.textpred.setText(outputFeature0.floatArray[4].toString())
                if (resized != null) {
                    val result = classifier.recognizeImage(resized)
                    Log.d("LOGGER", result.get(0).title)
                    binding.textpred.text = result.get(0).title
                    //Toast.makeText(this, result.get(0).title, Toast.LENGTH_SHORT).show()
                }
                // Releases model resources if no longer used.
                //model.close()
            }
        }
    }

}