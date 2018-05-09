package com.syriandev.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Bounce extends Activity implements Animation.AnimationListener {
    ImageView image;
    Animation animBounce;
    Button btnBounce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bounce);
        image = (ImageView) findViewById(R.id.image_andrody);
        animBounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);
        btnBounce = (Button) findViewById(R.id.bounce);
        animBounce.setAnimationListener(this);
        btnBounce.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                image.setVisibility(View.VISIBLE);

                // start the animation
                image.startAnimation(animBounce);
            }
        });

    }
    @Override
    public void onAnimationEnd(Animation animation) {
        // Take any action after completing the animation
        if (animation == animBounce) {
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
