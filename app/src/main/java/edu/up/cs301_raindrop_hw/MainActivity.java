/**
 * @author Alexander Leah - 2/11/2025
 * this class is the main activity that runs everything on the android device
 */
package edu.up.cs301_raindrop_hw;

import android.os.Bundle;
import android.widget.SeekBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        RaindropView rainDropID = findViewById(R.id.surfaceView);
        RainController rainCtrl = new RainController(rainDropID);
        RainContollerVertical vertRainCtrl = new RainContollerVertical(rainDropID);

        SeekBar slide = findViewById(R.id.LeftandRightBar);
        slide.setOnSeekBarChangeListener(rainCtrl);

        SeekBar slideVertical = findViewById(R.id.UpandDownBar);
        slideVertical.setOnSeekBarChangeListener(vertRainCtrl);

    }
}