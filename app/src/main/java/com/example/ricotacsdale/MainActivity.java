package com.example.ricotacsdale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titleText;
    Button playButton;
    Button instructionsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instructionsButton = (Button) findViewById(R.id.InstructionsButton);
        playButton = (Button) findViewById(R.id.PlayButton);
        titleText = (TextView) findViewById(R.id.title_text);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(), "fonts/Monday Donuts.ttf");
        titleText.setTypeface(myCustomFont);
        playButton.setTypeface(myCustomFont);
        instructionsButton.setTypeface(myCustomFont);
    }

    public void toInstructions(View v)
    {
        startActivity(new Intent(MainActivity.this, Instructions.class));
    }

    public void toPlay(View v)
    {
        startActivity(new Intent(MainActivity.this, PlayScreen.class));
    }
}