//package com.example.nanem.activity;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.database.Cursor;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.net.Uri;
//import android.os.Bundle;
//import android.provider.MediaStore;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//
//import com.example.nanem.R;
//
//import org.tensorflow.lite.Interpreter;
//
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//
//
//public class UploadFotoJava extends AppCompatActivity {
//    private static final int SELECT_IMAGE = 100;
//    ImageView imageView;
//    Bitmap bitmap;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_upload_foto);
//
//        imageView = findViewById(R.id.displayImage);
//
////      button open gallery
//        //Button button = findViewById(R.id.button);
////      button open camera
//        //Button button1 = findViewById(R.id.button2);
//
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(
//                        Intent.ACTION_PICK,
//                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//                startActivityForResult(i, SELECT_IMAGE);
//            }
//        });
//
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i =  new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivityForResult(i, SELECT_IMAGE);
//            }
//        });
//
//    }
//
//    public void openCamera(View view) {
//        Intent intent = new Intent(Intent.ACTION_PICK);
//        intent.setType("image/*");
//        startActivityForResult(intent, SELECT_IMAGE);
//    }
//
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if (requestCode == SELECT_IMAGE) {
//            if (resultCode == RESULT_OK) {
//                Uri selectedImage = data.getData();
//                InputStream inputStream = null;
//
//                Bitmap bitmap;
//                bitmap = (Bitmap) data.getExtras().get("data");
//                imageView.setImageBitmap(bitmap);
//                BitmapFactory.decodeStream(inputStream);
//                imageView.setImageURI(selectedImage);
//            }
//        }
//    }
//
//}
