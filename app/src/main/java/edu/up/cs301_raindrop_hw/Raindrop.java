package edu.up.cs301_raindrop_hw;

import android.graphics.Canvas;
import android.graphics.Paint;

import java.util.Random;

public class Raindrop
{

    Random randomness = new Random();
    protected int xPos;
    protected int yPos;
    protected int rainDropSize = 30;
    protected Paint blueness;

    public Raindrop()
    {
        randomPos(xPos, yPos);
        this.blueness.setColor(0xFF0000FF);
        this.blueness.setStyle(Paint.Style.FILL);
    }
    /**
    public Raindrop(int _x, int _y)
    {
        xPos = _x;
        yPos = _y;
        this.blueness.setColor(0xFF0000FF);
        this.blueness.setStyle(Paint.Style.FILL);
    }
     **/
    public void randomPos(int _xPos, int _yPos)
    {
        _xPos = randomness.nextInt(500) + 5;
        _yPos = randomness.nextInt(500) + 5;

        xPos = _xPos;
        yPos = _yPos;
    }

    public void placement(Canvas canvas)
    {
        canvas.drawCircle(xPos, yPos, rainDropSize, this.blueness);
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