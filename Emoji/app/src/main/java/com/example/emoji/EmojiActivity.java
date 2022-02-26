package com.example.emoji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EmojiActivity extends AppCompatActivity {
    private ImageView photo;
    private TextView ten,so,description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emoji);

        photo = findViewById(R.id.photo);
        ten = findViewById(R.id.ten);
        so = findViewById(R.id.so);
        description = findViewById(R.id.description);

        Intent intent = getIntent();
        String imagename = intent.getStringExtra("name");
        int imagephoto = intent.getIntExtra("image",0);
        int imagenumber = intent.getIntExtra("number",0);
        String imagedescription = intent.getStringExtra("description");


        description.setText(imagedescription);
        so.setText(String.valueOf(imagenumber));
        photo.setImageResource(imagephoto);
        ten.setText(imagename);

    }
}