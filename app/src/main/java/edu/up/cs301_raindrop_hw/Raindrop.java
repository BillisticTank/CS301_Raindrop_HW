package edu.up.cs301_raindrop_hw;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.Random;

public class Raindrop
{
    // new object of the random class. Used to make random values
    Random randomness = new Random();

    // x position variable
    protected int xPos;

    // y position varaible
    protected int yPos;

    //sets the size of raindrop sas a variable
    protected int rainDropSize = 30;

    //new paint object for making each circle have a unique color
    protected Paint uniquePaint;

    /** defualt constructer for the Raindrop(each individual circle drawn)
     * this contructer calls the random position and color methods to meet random position
     * and unique color requirments
     */
    public Raindrop()
    {
        randomPos(xPos, yPos);
        randomPaint();

    }

    /**
     * This method makes every circle have a unique color by using the randomness object
     * to generate values in between 256 and zero, making it so each circle has a random color
     */
    public void randomPaint()
    {
        int _randomPaint = Color.rgb(randomness.nextInt(256),randomness.nextInt(256),randomness.nextInt(256));

        uniquePaint = new Paint();
        uniquePaint.setColor(_randomPaint);
    }

    /**
     * This method makes every circle have a unique, random position on the surface view in between
     * 800 pixles and 0 pixels
     */
    public void randomPos(int _xPos, int _yPos)
    {
        _xPos = randomness.nextInt(800);
        _yPos = randomness.nextInt(800);

        xPos = _xPos;
        yPos = _yPos;
    }

    /**
     *  this method acts to actually draw the individual raindrops (circles) using all the data
     *  generated from the previous variables
     * @param canvas
     */
    public void placement(Canvas canvas)
    {
        canvas.drawCircle(xPos, yPos, rainDropSize, uniquePaint);
    }

}

/**
 External Citation
 Date: 8 Febuary 2025
 Problem: Couldnt figure out how to draw raindrops with random x and y positions
 Resource:
 Prof. Nuxoll - thursday 2/6/2025 lecture where the class learned how to draw spots with random
 x and y positions
 **/

/**
 External Citation
 Date: 10 Febuary 2025
 Problem: Android app wouldnt run on the tablet due to fatal exception(this was due to a object call
 to an object that didnt exist)
 Resource:
 Prof. Libby - Monday office hours
 **/