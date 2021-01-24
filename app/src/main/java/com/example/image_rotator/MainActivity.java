package com.example.image_rotator;

import android.graphics.Matrix;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ImageView rotatedImg;
    CustomizedSeekBar slider;
    TextView textView;
    ImageButton buttonR;
    ImageButton buttonL;
    int angle = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rotatedImg = findViewById(R.id.img_rotate);
        slider = findViewById(R.id.slider);
        textView = findViewById(R.id.textView);
        buttonL = findViewById(R.id.imageButtonL);
        buttonR = findViewById(R.id.imageButtonR);
        slider.setButtonL(buttonL);
        slider.setButtonR(buttonR);
        //slider.setTextView(textView);
        slider.setOnSeekBarChangeListener(seekBarChangeListener);
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
