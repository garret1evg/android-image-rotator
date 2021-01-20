package com.example.image_rotator;

import android.graphics.Matrix;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ImageView rotatedImg;
    SeekBar slider;
    TextView textView;
    int angle = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rotatedImg = findViewById(R.id.img_rotate);
        slider = findViewById(R.id.slider);
        textView = findViewById(R.id.textView);

        slider.setOnSeekBarChangeListener(seekBarChangeListener);

//        rotatedImg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                RotateAnimation rotateAnimation = new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF, 0.5f,
//                        RotateAnimation.RELATIVE_TO_SELF,0.5f);
//                rotateAnimation.setDuration(1000);
//                rotatedImg.startAnimation(rotateAnimation);
//            }
//        });
    }

    private SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            angle = seekBar.getProgress() - 180;
            final String text = angle + "\u00b0";
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    textView.setText(text);
                    rotatedImg.setRotation(angle);
                }
            });
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };
}
