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

public class Move extends Activity implements Animation.AnimationListener{
    ImageView image;
    Animation animMove;
    Button btnMove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
        image = (ImageView) findViewById(R.id.image_andrody);
        animMove = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move);
        btnMove = (Button) findViewById(R.id.move);
        animMove.setAnimationListener(this);
        btnMove.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                image.setVisibility(View.VISIBLE);

                // start the animation
                image.startAnimation(animMove);
            }
        });

    }
    @Override
    public void onAnimationEnd(Animation animation) {
        // Take any action after completing the animation
        if (animation == animMove) {
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
