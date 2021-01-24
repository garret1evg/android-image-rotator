package com.example.image_rotator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;

@SuppressLint("AppCompatCustomView")
public class CustomizedSeekBar extends SeekBar {
    public CustomizedSeekBar(Context context) {
        super(context);
    }

    public CustomizedSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomizedSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
