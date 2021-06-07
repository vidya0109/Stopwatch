package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class Stopwatch extends AppCompatActivity {
Button button,button2;
ImageView imageView;
Animation animation;
Chronometer chronometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);

        button = findViewById(R.id.btnstart);
        button2 = findViewById(R.id.btnstop);
        button2.setAlpha(0);
        imageView = findViewById(R.id.anchor);
        animation = AnimationUtils.loadAnimation(this,R.anim.rotate);
        chronometer = findViewById(R.id.time);
        Typeface MM = Typeface.createFromAsset(getAssets(),"MMedium.tff");

        button.setTypeface(MM);
        button2.setTypeface(MM);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageView.startAnimation(animation);
                button2.animate().alpha(1).translationY(-80).setDuration(300).start();
                button2.animate().alpha(1).setDuration(300).start();
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
            }
        });
    }
}