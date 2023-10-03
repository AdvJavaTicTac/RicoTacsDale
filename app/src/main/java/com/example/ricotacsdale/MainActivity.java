package com.example.ricotacsdale;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleText;
    Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (Button) findViewById(R.id.PlayButton);
        titleText = (TextView) findViewById(R.id.title_text);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/Monday Donuts.ttf");
        titleText.setTypeface(myCustomFont);
        playButton.setTypeface(myCustomFont);

    }
}