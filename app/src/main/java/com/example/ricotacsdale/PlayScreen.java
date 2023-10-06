package com.example.ricotacsdale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PlayScreen extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);

        imageView =findViewById(R.id.r0c0);

        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                imageView.setImageResource(R.drawable.dale);
            }
        });
    }
}