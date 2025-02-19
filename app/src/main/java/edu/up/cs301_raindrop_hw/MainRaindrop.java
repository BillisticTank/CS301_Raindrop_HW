/**
 * @author Alexander Leah - 2/18/2025
 * This class acts to construct the main rain drop that can move when directive is given
 * by the seekbars. it also comes with all of the individual attributes
 * a raindrop has, such as the coordinates and the random color
 */

package edu.up.cs301_raindrop_hw;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.Random;
public class MainRaindrop
{
    // new object of the random class. Used to make random values
    Random randomness = new Random();

    // x position variable
    protected static int xPos;

    // y position varaible
    protected static int yPos;

    //sets the size of raindrop sas a variable
    protected int rainDropSize = 30;

    //new paint object for making each circle have a unique color
    protected Paint uniquePaint;

    protected int redMain = randomness.nextInt(256);

    public int greenMain = randomness.nextInt(256);

    public int blueMain = randomness.nextInt(256);
    public MainRaindrop()
    {
        randomPos(xPos, yPos);
        randomPaint();
    }

    public void randomPaint()
    {
        int _randomPaint = Color.rgb(redMain,greenMain,blueMain);

        uniquePaint = new Paint();
        uniquePaint.setColor(_randomPaint);
    }

    public void randomPos(int _xPos, int _yPos)
    {
        _xPos = randomness.nextInt(800);
        _yPos = randomness.nextInt(800);

        xPos = _xPos;
        yPos = _yPos;
    }

    public void placement(Canvas canvas)
    {
        canvas.drawCircle(xPos, yPos, rainDropSize, uniquePaint);
    }

    public static int getxPos()
    {
        return xPos;
    }

    public static int getyPos()
    {
        return yPos;
    }

    //getter method for the main raindrops red color instance variable.
    public int getredMain()
    {
        return redMain;
    }

    //getter method for the main raindrops green color instance variable.
    public int getgreenMain()
    {
        return greenMain;
    }

    //getter method for the main raindrops blue color instance variable.
    public int getblueMain()
    {
        return blueMain;
    }
}
