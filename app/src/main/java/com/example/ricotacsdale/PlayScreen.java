package com.example.ricotacsdale;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PlayScreen extends AppCompatActivity
{

    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_screen);

        //1 will be x, 2 will be circle

        //cases 1-3 are horizontal, cases 4-6 are vertical, and cases 7-8 are diagonal.

        //case #1
        if (box1 == box2 && box2 == box3)
        {
            if (box1xorc == 1 && box2xorc == 1 && box3xorc == 1)
            {
                result = "Dale won!";
            }
            if (box1xorc == 2 && box2xorc == 2 && box3xorc == 2)
            {
                result = "Rico won!";
            }
        }

        //case #2
        if (box4 == box5 && box5 == box6)
        {
            if (box4xorc == 1 && box5xorc == 1 && box6xorc == 1)
            {
                result = "Dale won!";
            }
            if (box4xorc == 2 && box5xorc == 2 && box6xorc == 2)
            {
                result = "Rico won!";
            }
        }

        //case #3
        if (box7 == box8 && box8 == box9)
        {
            if (box7xorc == 1 && box8xorc == 1 && box9xorc == 1)
            {
                result = "Dale won!";
            }
            if (box7xorc == 2 && box8xorc == 2 && box9xorc == 2)
            {
                result = "Rico won!";
            }
        }

        //case #4
        if (box1 == box4 && box4 == box7)
        {
            if (box1xorc == 1 && box4xorc == 1 && box7xorc == 1)
            {
                result = "Dale won!";
            }
            if (box1xorc == 2 && box4xorc == 2 && box7xorc == 2)
            {
                result = "Rico won!";
            }
        }

        //case #5
        if (box2 == box5 && box5 == box8)
        {
            if (box2xorc == 1 && box5xorc == 1 && box8xorc == 1)
            {
                result = "Dale won!";
            }
            if (box2xorc == 2 && box5xorc == 2 && box8xorc == 2)
            {
                result = "Rico won!";
            }
        }

        //case #6
        if (box3 == box6 && box6 == box9)
        {
            if (box3xorc == 1 && box6xorc == 1 && box9xorc == 1)
            {
                result = "Dale won!";
            }
            if (box3xorc == 2 && box6xorc == 2 && box9xorc == 2)
            {
                result = "Rico won!";
            }
        }

        //case #7
        if (box1 == box5 && box5 == box9)
        {
            if (box1xorc == 1 && box5xorc == 1 && box9xorc == 1)
            {
                result = "Dale won!";
            }
            if (box1xorc == 2 && box5xorc == 2 && box9xorc == 2)
            {
                result = "Rico won!";
            }
        }

        //case #8
        if (box3 == box5 && box5 == box7)
        {
            if (box3xorc == 1 && box5xorc == 1 && box7xorc == 1)
            {
                result = "Dale won!";
            }
            if (box3xorc == 2 && box5xorc == 2 && box7xorc == 2)
            {
                result = "Rico won!";
            }
        }
    }

    //winning toast text

    public void whenWinning(View v)
    {
        Toast.makeText(this, "Winner: " + result, Toast.LENGTH_LONG).show();
    }
}