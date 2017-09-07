package com.example.domingl.animatedvectordrawabletest;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimatedVectorDrawable remote;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        remote = (AnimatedVectorDrawable) getDrawable(R.drawable.remote);
        image = (ImageView) findViewById(R.id.imageView);

        image.setImageDrawable(remote);

        remote.start();

        remote.registerAnimationCallback (new Animatable2.AnimationCallback(){
            public void onAnimationEnd(Drawable drawable){
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        remote.start();
                    }
                }, 0);
            }
        });
    }
}
