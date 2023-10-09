package com.example.ricotacsdale;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PlayScreen extends AppCompatActivity implements View.OnClickListener{

    Button r0c0 =findViewById(R.id.r0c0);
    Button r0c1 =findViewById(R.id.r0c1);
    Button r0c2 =findViewById(R.id.r0c2);

    Button r1c0 =findViewById(R.id.r1c0);
    Button r1c1 =findViewById(R.id.r1c1);
    Button r1c2 =findViewById(R.id.r1c2);

    Button r2c0 =findViewById(R.id.r2c0);
    Button r2c1 =findViewById(R.id.r2c1);
    Button r2c2 =findViewById(R.id.r2c2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);



        /* Brainstorm of how to change image of tiles
            Need two different conditions, Dale's turn, and Rico's turn
                have variable called turn?
            Need to check src/image of the tile being pressed
                If its the "empty" image then change
         */

        //9 tiles in total
        //tiles are counted left to right, top to bottom
        /*
          e.g   0   1   2
                3   4   5
                6   7   8
         */

        //Each tile has its own ImageView so that they can all share the same onClick function while still having different values
        ImageView tile0 =findViewById(R.id.r0c0);
        ImageView tile1 =findViewById(R.id.r0c1);
        ImageView tile2 =findViewById(R.id.r0c2);

        ImageView tile3 =findViewById(R.id.r1c0);
        ImageView tile4 =findViewById(R.id.r1c1);
        ImageView tile5 =findViewById(R.id.r1c2);

        ImageView tile6 =findViewById(R.id.r2c0);
        ImageView tile7 =findViewById(R.id.r2c1);
        ImageView tile8 =findViewById(R.id.r2c2);

        //Giving each tile access to the onClick function
        tile0.setOnClickListener(this);
        tile1.setOnClickListener(this);
        tile2.setOnClickListener(this);
        tile3.setOnClickListener(this);
        tile4.setOnClickListener(this);
        tile5.setOnClickListener(this);
        tile6.setOnClickListener(this);
        tile7.setOnClickListener(this);
        tile8.setOnClickListener(this);

//        imageView.setOnClickListener(this {
//            public void onClick(View view)
//            {
//                imageView.setImageResource(R.drawable.dale);
//            }
//        });
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.r0c0:
                r0c0.setImageResource(R.drawable.dale);
                break;
        }
    }
}