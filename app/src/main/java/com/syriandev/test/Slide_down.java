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

public class Slide_down extends Activity implements Animation.AnimationListener {
    ImageView image;
    Animation animSlidedown;
    Button btnSlidedown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_down);
        image = (ImageView) findViewById(R.id.image_andrody);
        animSlidedown = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_down);
        btnSlidedown = (Button) findViewById(R.id.slide_down);
        animSlidedown.setAnimationListener(this);
        btnSlidedown.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                image.setVisibility(View.VISIBLE);
                image.startAnimation(animSlidedown);
            }
        });
    }
    @Override
    public void onAnimationEnd(Animation animation) {
        // Take any action after completing the animation
        if (animation == animSlidedown) {
            Toast.makeText(getApplicationContext(), "Animation Stopped",
                    Toast.LENGTH_SHORT).show();
        }
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
