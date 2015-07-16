package com.nfhackathon.botb.rpt.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
 *
 * This Activity prompts the user for age and target income.
 * Extends LifecycleLoggingActivity so its
 * lifecycle hook methods are logged automatically.
 *
 * This is the View Interface in MVP pattern.
 */

public class RPTActivity extends GenericActivity<RPTOps> {

    private EditText currentAgeEditText;

    private SeekBar targetRetAmountSeekBar;

    private Button nextButton;

    private long targetRetAmount;

    private int currentAge;

    // TODO can be moved to RPTOps
    public Tiffany mTiffany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);

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
        // TODO Store the Views.

        // Get Target amount and age
        currentAge = getAge();
        targetRetAmount = getTargetRetAmount();

        // Initialize Tiffany Class
        mTiffany = new Tiffany(currentAge, targetRetAmount);
    }

    /**
     * Helper method that gets retirement amount from view
     */

    public long getTargetRetAmount() {

        //TODO get retirement amount from Slider

        return 0;
    }

    /**
     * Helper method that gets age from view
     */

    public int getAge() {

        //TODO get retirement amount from Slider

        return 0;
    }

    /**
     * Get called when the user presses the
     * "Go" button.
     */
    private void goToDecisionActivity(View v){

        //TODO Explicit intent to go to the Decision Activity

        Intent decisionIntent = new Intent(this, DecisionActivity.class);
        // pass target amount? - No need as we Tiffany class now
        startService(decisionIntent);

    }

}
