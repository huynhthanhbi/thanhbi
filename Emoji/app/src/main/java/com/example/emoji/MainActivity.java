package com.example.emoji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    String[] names = {"image_1","image_2","image_3","image_6"};
    int[] images = {R.drawable.image_1, R.drawable.image_2,R.drawable.image_3,R.drawable.image_6};
    int[] numbers = {1,2,3,6};
    String[] description = {"Smiling Emoji make you happy","Smiling Until Crying Emoji","Sad Emoji", "Thinking Emoji"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridview);

        imageAdapter imageadapter = new imageAdapter(names,images,numbers,description,this);
        gridView.setAdapter(imageadapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedname = names[i];
                int selectedimage = images[i];
                int selectednumber = numbers[i];
                String selecteddecription = description[i];

                Intent intent = new Intent(MainActivity.this,EmojiActivity.class);
                intent.putExtra("name",selectedname);
                intent.putExtra("image",selectedimage);
                intent.putExtra("number",selectednumber);
                intent.putExtra("description", selecteddecription);
                startActivity(intent);
            }
        });

    }
}