package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView , textView2;
Button btn;
Animation animation;
ImageView imageView;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tvSplash);
        textView2 = findViewById(R.id.subSplash);
        btn = findViewById(R.id.btnget);
        imageView = findViewById(R.id.splash);
        animation = AnimationUtils.loadAnimation(this,R.anim.atg);

        imageView.startAnimation(animation);
        Typeface Ml = Typeface.createFromAsset(getAssets(),"MLight.tff");
        Typeface Md = Typeface.createFromAsset(getAssets(),"MRegular.tff");
        Typeface MM = Typeface.createFromAsset(getAssets(),"MMedium.tff");

        textView.setTypeface(Md);
        textView2.setTypeface(Ml);
        btn.setTypeface(MM);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Stopwatch.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(i);

            }
        });



    }
}