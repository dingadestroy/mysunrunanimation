package com.example.ronald.mysunanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the sun View
        ImageView sun = (ImageView) findViewById(R.id.sun);

        //get the sunrise animation
        Animation sunRise = AnimationUtils.loadAnimation(this, R.anim.sun_rise);

        //apply the animation to the View
        sun.startAnimation(sunRise);

        ImageView clock = (ImageView) findViewById(R.id.clock);

        //get the clock turn animation
        Animation clockTurn = AnimationUtils.loadAnimation(this, R.anim.clock_turn);

        //apply the animation to the View
        clock.startAnimation(clockTurn);

        //get the hour hand View
        ImageView hour = (ImageView) findViewById(R.id.hour);
//get the hour turn animation
        Animation hourTurn = AnimationUtils.loadAnimation(this, R.anim.hour_turn);
//apply the animation to the View
        hour.startAnimation(hourTurn);


        final ImageView running = (ImageView) findViewById(R.id.imageview_running);
        ((AnimationDrawable) running.getBackground()).start();


    }
}
