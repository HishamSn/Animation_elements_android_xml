package com.syriandev.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Rotate extends Activity implements Animation.AnimationListener {
    ImageView image;
    Animation animRotate;
    Button btnRotate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate);
        image = (ImageView) findViewById(R.id.image_andrody);
        animRotate = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);
        btnRotate = (Button) findViewById(R.id.rotate);
        animRotate.setAnimationListener(this);
        btnRotate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                image.setVisibility(View.VISIBLE);
                image.startAnimation(animRotate);
            }
        });
    }
    @Override
    public void onAnimationEnd(Animation animation) {
        // Take any action after completing the animation
        if (animation == animRotate) {
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
