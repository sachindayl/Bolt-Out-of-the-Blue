package com.nfhackathon.botb.rpt.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.nfhackathon.botb.rpt.R;
import com.nfhackathon.botb.rpt.operations.RPTOps;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);

        // Always call super class for necessary
        // initialization/implementation.
        super.onCreate(savedInstanceState,
                RPTOps.class);
    }


}
