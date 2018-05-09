package com.syriandev.test;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    ImageView image;
    Button btnFadein, btnBlink, btnFadeout , btnCrossfading , btnZoom , btnRotate , btnMove,
            btnSlideup, btnSlidedown, btnBounce, btnSequential, btnTogether;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView) findViewById(R.id.image_andrody);
        btnFadein = (Button) findViewById(R.id.fade_in);
        btnFadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Fadein.class));
            }
        });
        btnBlink = (Button) findViewById(R.id.blink);
        btnBlink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Blink.class));
            }
        });
        btnFadeout = (Button) findViewById(R.id.fade_out);
        btnFadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Fadeout.class));
            }
        });
        btnCrossfading = (Button) findViewById(R.id.crossfading);
        btnCrossfading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Cross_fading.class));
            }
        });
        btnZoom = (Button) findViewById(R.id.zoom);
        btnZoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Zoom.class));
            }
        });
        btnRotate = (Button) findViewById(R.id.rotate);
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Rotate.class));
            }
        });
        btnMove = (Button) findViewById(R.id.move);
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Move.class));
            }
        });
        btnSlideup = (Button) findViewById(R.id.slide_up);
        btnSlideup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Slide_up.class));
            }
        });
        btnSlidedown = (Button) findViewById(R.id.slide_down);
        btnSlidedown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Slide_down.class));
            }
        });
        btnBounce = (Button) findViewById(R.id.bounce);
        btnBounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Bounce.class));
            }
        });
        btnSequential = (Button) findViewById(R.id.sequential);
        btnSequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Sequential.class));
            }
        });
        btnTogether = (Button) findViewById(R.id.together);
        btnTogether.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Together.class));
            }
        });

    }

}

