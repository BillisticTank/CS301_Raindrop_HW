/**
 * @author Alexander Leah - 2/18/2025
 * This class acts to connect the seekbars to the main raindrop by using seekbar listener methods
 * this perticular controller class handles the left and right seekbar
 */

package edu.up.cs301_raindrop_hw;

import android.widget.SeekBar;

public class RainController implements SeekBar.OnSeekBarChangeListener
{
    //referance to the view
    private RaindropView viewRef;

    //view constructer
    public RainController(RaindropView _viewRef)
    {
        viewRef = _viewRef;
    }

    //this method handles the progress changes whenever a seekbar is moved
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
    {
        MainRaindrop.xPos = progress;
        viewRef.invalidate();
        seekBar.setProgress(MainRaindrop.getxPos());


    }


    @Override
    public void onStartTrackingTouch(SeekBar seekBar)
    {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar)
    {

    }
}
