package edu.elon.cs.dotpainter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;

public class SetColorDialogActivity extends Activity {

    private SeekBar alphaBar;
    private SeekBar redBar;
    private SeekBar greenBar;
    private SeekBar blueBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_color_dialog);

        Intent data = getIntent();
        int alpha = data.getIntExtra("alpha", DoodleView.ALPHA);
        alphaBar = (SeekBar) findViewById(R.id.seekBar);
        alphaBar.setProgress(alpha);
        alphaBar.setOnSeekBarChangeListener(seekBarListener);

        int red = data.getIntExtra("red", DoodleView.RED);
        redBar = (SeekBar) findViewById(R.id.seekBar2);
        redBar.setProgress(red);
        redBar.setOnSeekBarChangeListener(seekBarListener);

        int green = data.getIntExtra("green", DoodleView.GREEN);
        greenBar = (SeekBar) findViewById(R.id.seekBar3);
        greenBar.setProgress(green);
        greenBar.setOnSeekBarChangeListener(seekBarListener);

        int blue = data.getIntExtra("blue", DoodleView.BLUE);
        blueBar = (SeekBar) findViewById(R.id.seekBar4);
        blueBar.setProgress(blue);
        greenBar.setOnSeekBarChangeListener(seekBarListener);

    }

    SeekBar.OnSeekBarChangeListener seekBarListener =
            new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            };

    public void onSetColorClick(){
        Intent data = new Intent();
        data.putExtra("alpha", alphaBar.getProgress());
        data.putExtra("red", redBar.getProgress());
        data.putExtra("green", greenBar.getProgress());
        data.putExtra("blue", blueBar.getProgress());
        finish();
    }
}
