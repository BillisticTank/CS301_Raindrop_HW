package edu.up.cs301_raindrop_hw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;


public class RaindropView extends SurfaceView
{
    public RaindropView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setWillNotDraw(false);
    }

    @Override
    public void onDraw(Canvas _canvas)
    {
        Raindrop rain = new Raindrop();
        rain.placement(_canvas);

    }
}

/**
 External Citation
 Date: 28 January 2025
 Problem: Couldnt figure out how to start drawing raindrops
 Resource:
 Prof. Nuxoll - Tuesday Office Hours
 **/