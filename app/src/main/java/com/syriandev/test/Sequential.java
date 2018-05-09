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
public class Sequential extends Activity implements Animation.AnimationListener {
    ImageView image;
    Animation animSequential;
    Button btnSequential;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequential);
        image = (ImageView) findViewById(R.id.image_andrody);
        animSequential = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.sequential);
        btnSequential = (Button) findViewById(R.id.sequential);
        animSequential.setAnimationListener(this);
        btnSequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setVisibility(View.VISIBLE);
                // start the animation
                image.startAnimation(animSequential);
            }
        });
    }
    @Override
    public void onAnimationEnd(Animation animation) {
        // Take any action after completing the animation
        if (animation == animSequential) {
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
