package com.example.ricotacsdale;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PlayScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);

        Button tile1 = findViewById(R.id.tile1);
        tile1.setOnClickListener(this);

        /* Brainstorm of how to change image of tiles
            Need two different conditions, Dale's turn, and Rico's turn
                have variable called turn?
            Need to check src/image of the tile being pressed
                If its the "empty" image then change
         */

        //9 tiles in total
        //tiles are counted left to right, top to bottom
        /*
          e.g   1   2   3
                4   5   6
                7   8   9
         */

    }


    public void changeSymbol(View v)
    {
        Button outBtn = (Button)findViewById(v.getId());
        outBtn.setText("X");
    }

    @Override
    public void onClick(View v) {
        changeSymbol(v);
    }
}