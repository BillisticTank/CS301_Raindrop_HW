/**
 * @author Alexander Leah - 2/11/2025
 * This class acts as the actual surface that the raindrops are drawn on, acting as
 * the "canvas" so to speak.
 */

package edu.up.cs301_raindrop_hw;

import android.content.Context;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import java.util.Random;


public class RaindropView extends SurfaceView
{
    /**
     * this is a new object of random class to generate random numbers
     */
    Random amount = new Random();

    /**
     * random number between 6 and 12
     */
    int rainDropAmount = amount.nextInt(7) + 6;
    /**
     * This contructer allows drawing to happen
     */
    public RaindropView(Context context, AttributeSet attrs)
    {
        super(context, attrs);

        /**
         * This is absolutley NECASSARY for anything to be drawn
         */
        this.setWillNotDraw(false);
    }

    /**
     * This method actually draws each raindrop using a for loop that makes between 6 and 12 raindrops
     * to satify assignment requirments
     * @param _canvas the canvas on which the background will be drawn
     */
    @Override
    public void onDraw(Canvas _canvas)
    {
        for(int i = 0; i < rainDropAmount; i++)
        {
            Raindrop rain = new Raindrop();
            rain.placement(_canvas);
        }
    }
}

/**
 External Citation
 Date: 28 January 2025
 Problem: Couldnt figure out how to start drawing raindrops
 Resource:
 Prof. Nuxoll - Tuesday Office Hours
 **/