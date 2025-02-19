/**
 * @author Alexander Leah - 2/18/2025
 * This class acts to connect the seekbars to the main raindrop by using seekbar listener methods
 * this perticular controller class handles the Up and Down seekbar
 */

package edu.up.cs301_raindrop_hw;

import android.widget.SeekBar;

public class RainContollerVertical implements SeekBar.OnSeekBarChangeListener
{

    //referance to the vertical view
    private RaindropView VerticalViewRef;

    public RainContollerVertical(RaindropView _viewRef)
    {
        VerticalViewRef = _viewRef;
    }
    //this method handles the progress changes whenever a seekbar is moved
    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
    {
        MainRaindrop.yPos = progress;
        VerticalViewRef.invalidate();
        seekBar.setProgress(MainRaindrop.getyPos());
    }
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
