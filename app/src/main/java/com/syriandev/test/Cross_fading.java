package com.syriandev.test;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Cross_fading extends Activity implements Animation.AnimationListener {
    ImageView image , image2;
    Animation animFadein, animFadeout;
    Button btnCrossfading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_fading);
        image = (ImageView) findViewById(R.id.image_andrody);
        image2 = (ImageView) findViewById(R.id.image_andrody2);
        animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        animFadeout = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out);
        btnCrossfading = (Button) findViewById(R.id.crossfading);
        btnCrossfading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image2.setVisibility(View.VISIBLE);
                image.startAnimation(animFadeout);
                image2.startAnimation(animFadein);
            }
        });
    }
    @Override
    public void onAnimationEnd(Animation animation) {

    }
    @Override
    public void onAnimationRepeat(Animation animation) {
        // TODO Auto-generated method stub
    }
    @Override
    public void onAnimationStart(Animation animation) {
        // TODO Auto-generated method stub
    }
}
