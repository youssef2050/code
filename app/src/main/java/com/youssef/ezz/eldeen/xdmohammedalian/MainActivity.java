package com.youssef.ezz.eldeen.xdmohammedalian;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView image;
    private ImageView text;
    private Animation animationImage, animationText;
    private AnimationDrawable rocketAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.image);
        text = findViewById(R.id.text);
        animationImage = AnimationUtils.loadAnimation(this, R.anim.image_anim);
        animationText = AnimationUtils.loadAnimation(this, R.anim.text_anim);
        text.setBackgroundResource(R.drawable.text);
        rocketAnimation = (AnimationDrawable) text.getBackground();

    }

    @Override
    protected void onStart() {

        super.onStart();
        image.setAnimation(animationImage);
//        text.setAnimation(animationText);
        rocketAnimation.start();

        animationImage.startNow();
    }

}