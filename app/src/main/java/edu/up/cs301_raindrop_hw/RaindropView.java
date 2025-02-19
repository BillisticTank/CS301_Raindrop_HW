/**
 * @author Alexander Leah - 2/11/2025
 * This class acts as the actual surface that the raindrops are drawn on, as well as acting as the
 * controller for removing the raindrops when they come into contact with the main raindrop. it also is
 * acting as
 * the "canvas" so to speak.
 */

package edu.up.cs301_raindrop_hw;

import android.content.Context;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.util.ArrayList;
import java.util.Random;


public class RaindropView extends SurfaceView
{
    /**
     * this is a new object of random class to generate random numbers
     */
    Random amount = new Random();

    Paint colorAvg = new Paint();

    /**
     * random number between 6 and 12
     */
    public int rainDropAmount = amount.nextInt(7) + 6;

    public ArrayList<Raindrop> standardRain = new ArrayList<Raindrop>();
    //adds raindrops into an array to save the raindrops data

    public ArrayList<MainRaindrop> maindrop = new ArrayList<MainRaindrop>();


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

        for(int j = 0; j < rainDropAmount; j++)
        {
            standardRain.add(new Raindrop());

        }

        //adds the main raindrop to be controlled by seekbars
        maindrop.add(new MainRaindrop());
    }



    /**
     * This method actually draws each raindrop using a for loop that makes between 6 and 12 raindrops
     * to satify assignment requirments
     * @param _canvas the canvas on which the background will be drawn
     */
    @Override
    public void onDraw(Canvas _canvas)
    {
        //find the overlapping drop if it exists
        Raindrop overlaps = null;

        for(int i = 0; i < standardRain.size(); i++)
        {
            if(standardRain.get(i).bounds(maindrop.get(0)) == true)
            {
                overlaps = standardRain.get(i);
                break;
            }
        }

        //get rid of overlaps
        standardRain.remove(overlaps);

        // this would have changes the color of the raindrops but its insisting the methods need to be static
        //colorAvg.setColor(Color.rgb(MainRaindrop.getredMain(), MainRaindrop.getgreenMain(), MainRaindrop.getblueMain()));


        //loop through the rainmodel array list to draw the raindrops on the surface view.
        for(int i = 0; i < standardRain.size(); i++)
        {
            standardRain.get(i).placement(_canvas);
        }
        maindrop.get(0).placement(_canvas);

    }
}



/**
 External Citation
 Date: 28 January 2025
 Problem: Couldnt figure out how to start drawing raindrops
 Resource:
 Prof. Nuxoll - Tuesday Office Hours
 **/

/**
 External Citation
 Date: 18 Febuary 2025
 Problem: I didnt know what formula to use for bounds detection and
 didn't know how to use bounds detection in corrasponaance to an array list of raindrops
 to make sure the rain drops "merged".
 Resource:
 Prof. Nuxoll - Tuesday Office Hours
 **/

