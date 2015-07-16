package com.nfhackathon.botb.rpt.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.nfhackathon.botb.rpt.R;
import com.nfhackathon.botb.rpt.operations.RPTOps;
import com.nfhackathon.botb.rpt.operations.Tiffany;
import com.nfhackathon.botb.rpt.utils.GenericActivity;
import com.nfhackathon.botb.rpt.utils.LifecycleLoggingActivity;

/**
 * Created by pthakkar9 on 7/11/2015.
 * <p/>
 * This Activity prompts the user for age and target income.
 * Extends LifecycleLoggingActivity so its
 * lifecycle hook methods are logged automatically.
 * <p/>
 * This is the View Interface in MVP pattern.
 */

public class RPTActivity extends GenericActivity<RPTOps> {

    private EditText currentAgeEditText;

    private SeekBar targetRetAmountSeekBar;

    private TextView targetRetAmountTextView;

    private Button nextButton;

    private long targetRetAmount;

    private int currentAge;

    // TODO can be moved to RPTOps
    public Tiffany mTiffany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.input_screen_layout);

        // Initialize the view fields in the activity instance.
        // TODO can be moved to RPTOps
        initializeDisplayViewFields();

        // Always call super class for necessary
        // initialization/implementation.
        super.onCreate(savedInstanceState,
                RPTOps.class);
    }


    /**
     * Helper method that initializes the views
     */
    public void initializeDisplayViewFields() {
        // Done Store the Views.

        currentAgeEditText = (EditText) findViewById(R.id.currentAge);
        targetRetAmountSeekBar = (SeekBar) findViewById(R.id.targetRetAmount);
        targetRetAmountTextView = (TextView) findViewById(R.id.traNum);
        nextButton = (Button) findViewById(R.id.goBtn);

        // Get Target amount and age
        currentAge = getAge();

        targetRetAmountSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int progressValue;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                targetRetAmountTextView.setText("Progress is " + progressValue);
                targetRetAmount = progressValue;
            }
        });

        // Initialize Tiffany Class
        mTiffany = new Tiffany(currentAge, targetRetAmount);
    }


    /**
     * Helper method that gets age from view
     */

    public int getAge() {

        //Done get retirement amount from Slider
        String ageString = "0";
        int age = -1;
        ageString = currentAgeEditText.getText().toString();
        try {
            age = Integer.parseInt(ageString);
        } catch (NumberFormatException e) {
            Log.d(TAG, "NumberFormatException");
        }
        return age;
//        return 0;

    }

    /**
     * Get called when the user presses the
     * "Go" button.
     */
    public void goToDecisionActivity(View v) {

        //Done Explicit intent to go to the Decision Activity

        Intent decisionIntent = new Intent(this, DecisionActivity.class);
        // pass target amount? - No need as we Tiffany class now
        startActivity(decisionIntent);

    }

}
