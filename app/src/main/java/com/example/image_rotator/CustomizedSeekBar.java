package com.example.image_rotator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;



public class CustomizedSeekBar extends AppCompatSeekBar {


    private ImageButton buttonR;
    private ImageButton buttonL;
    private TextView  textView;
    private OnSeekBarChangeListener seekBarChangeListener;

    public CustomizedSeekBar(Context context) {
        super(context);
    }

    public CustomizedSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomizedSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public void setButtonR(ImageButton buttonR) {
        this.buttonR = buttonR;
        this.buttonR.setOnClickListener(clickListenerR);
    }

    public void setButtonL(ImageButton buttonL) {
        this.buttonL = buttonL;
        this.buttonL.setOnClickListener(clickListenerL);
    }
    private ImageButton.OnClickListener clickListenerL = new ImageButton.OnClickListener(){

        @Override
        public void onClick(View v) {
            setProgress(getProgress() - 1);
        }
    };

    private ImageButton.OnClickListener clickListenerR = new ImageButton.OnClickListener(){

        @Override
        public void onClick(View v) {
            setProgress(getProgress() + 1);
        }
    };

    public void setTextView(TextView textView) {
        this.textView = textView;
    }
}
