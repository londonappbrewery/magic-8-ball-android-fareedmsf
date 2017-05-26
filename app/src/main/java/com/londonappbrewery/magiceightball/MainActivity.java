package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressmebtn;

        pressmebtn =(Button)findViewById(R.id.pressme);

        final ImageView letterimg = (ImageView)findViewById(R.id.f);

        final int [] letters = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5

        };

        pressmebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomletter =new Random();
                 int rendom=randomletter.nextInt(4);
                letterimg.setImageResource(letters[rendom]);
            }
        });

    }
}
