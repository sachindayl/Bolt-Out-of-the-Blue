package com.nfhackathon.botb.rpt.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.nfhackathon.botb.rpt.R;

public class DecisionActivity extends Activity {

    private TextView kidsLabel;
    private TextView kidsLabelAlt;
    private ImageView kidsImageView;

    private TextView houseLabel;
    private TextView houseLabelAlt;
    private ImageView houseImageView;

    private TextView marriageLabel;
    private TextView marriageLabelAlt;
    private ImageView marriageImageView;

    private TextView relocLabel;
    private TextView relocLabelAlt;
    private ImageView relocImageView;

    private ToggleButton kidsToggle;
    private SeekBar kidsSeekBar;

    private ToggleButton houseToggle;
    private SeekBar houseSeekBar;

    private ToggleButton marriageToggle;
    private SeekBar marriageSeekBar;

    private ToggleButton relocToggle;
    private SeekBar relocSeekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life_decisions_page_layout_s);

        initializeDisplayViewFields();

        kidsToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                kidsLabel.setVisibility(View.INVISIBLE);
                kidsToggle.setVisibility(View.INVISIBLE);

                kidsLabelAlt.setVisibility(View.VISIBLE);
                kidsSeekBar.setVisibility(View.VISIBLE);
                kidsImageView.setVisibility(View.VISIBLE);
            }
        });

        houseToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                houseLabel.setVisibility(View.INVISIBLE);
                houseToggle.setVisibility(View.INVISIBLE);

                houseLabelAlt.setVisibility(View.VISIBLE);
                houseSeekBar.setVisibility(View.VISIBLE);
                houseImageView.setVisibility(View.VISIBLE);
            }
        });

        marriageToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                marriageLabel.setVisibility(View.INVISIBLE);
                marriageToggle.setVisibility(View.INVISIBLE);

                marriageLabelAlt.setVisibility(View.VISIBLE);
                marriageSeekBar.setVisibility(View.VISIBLE);
                marriageImageView.setVisibility(View.VISIBLE);
            }
        });

        relocToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                relocLabel.setVisibility(View.INVISIBLE);
                relocToggle.setVisibility(View.INVISIBLE);

                relocLabelAlt.setVisibility(View.VISIBLE);
                relocSeekBar.setVisibility(View.VISIBLE);
                relocImageView.setVisibility(View.VISIBLE);
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_decision, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    /**
     * Get called when the user presses the
     * "Go" button.
     */
    public void goToResultActivity(View v) {

        //Done Explicit intent to go to the Decision Activity

        Intent decisionIntent = new Intent(this, ResultsActivity.class);
        // pass target amount? - No need as we Tiffany class now
        startActivity(decisionIntent);

    }

    public void initializeDisplayViewFields() {

        kidsLabel = (TextView) findViewById(R.id.kidsLabel);
        kidsLabelAlt = (TextView) findViewById(R.id.kidsLabelAlt);
        kidsImageView = (ImageView) findViewById(R.id.kidsImg);

        houseLabel = (TextView) findViewById(R.id.houseLabel);
        houseLabelAlt = (TextView) findViewById(R.id.houseLabelAlt);
        houseImageView = (ImageView) findViewById(R.id.houseImg);

        marriageLabel = (TextView) findViewById(R.id.marriageLabel);
        marriageLabelAlt = (TextView) findViewById(R.id.marriageLabelAlt);
        marriageImageView  = (ImageView) findViewById(R.id.marriageImg);

        relocLabel = (TextView) findViewById(R.id.relocLabel);
        relocLabelAlt = (TextView) findViewById(R.id.relocLabelAlt);
        relocImageView = (ImageView) findViewById(R.id.relocImg);

        kidsToggle = (ToggleButton) findViewById(R.id.kidsToggle) ;
        kidsSeekBar = (SeekBar) findViewById(R.id.kidsSeekBar) ;

        houseToggle = (ToggleButton) findViewById(R.id.houseToggle) ;
        houseSeekBar = (SeekBar) findViewById(R.id.houseSeekBar) ;

        marriageToggle  = (ToggleButton) findViewById(R.id.marriageToggle) ;
        marriageSeekBar = (SeekBar) findViewById(R.id.marriageSeekBar) ;

        relocToggle = (ToggleButton) findViewById(R.id.relocToggle) ;
        relocSeekBar = (SeekBar) findViewById(R.id.relocSeekBar) ;
    }


}
