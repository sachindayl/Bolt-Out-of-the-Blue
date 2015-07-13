package com.nfhackathon.botb.rpt.operations;

/**
 * Created by pthakkar9 on 7/11/2015.
 *
 */

import android.app.Activity;
import android.util.Log;

import com.nfhackathon.botb.rpt.activities.RPTActivity;
import com.nfhackathon.botb.rpt.utils.ConfigurableOps;
import com.nfhackathon.botb.rpt.utils.GenericAsyncTaskOps;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * This class implements all the RPT operations. This is where
 * business logic will go in.
 */
public class RPTOps implements ConfigurableOps,
        GenericAsyncTaskOps<String, Void, Void> {

    /**
     * Debugging tag used by the Android logger.
     */
    private final String TAG = getClass().getSimpleName();

    /**
     * Used to enable garbage collection.
     */
    private WeakReference<RPTActivity> mActivity;


    /**
     * Default constructor that's needed by the GenericActivity
     * framework.
     */
    public RPTOps() {
    }


    @Override
    public void onConfiguration(Activity activity, boolean firstTimeIn) {
        final String time = firstTimeIn ? "first time" : "second+ time";
        Log.d(TAG,
                "onConfiguration() called the "
                        + time
                        + " with activity = "
                        + activity);

        // (Re)set the mActivity WeakReference.
        mActivity = new WeakReference<>((RPTActivity) activity);

        if (firstTimeIn) {

            // TODO set up view
        } else {
            // TODO reclaim view
        }
    }

    @Override
    public Void doInBackground(String param) {
        // TODO this is where we are going to try to fetch data
        // anything goes here will be executed in a thread
        // this is part of the AsyncTask framework
        return null;
    }

    @Override
    public void onPostExecute(Void aVoid, String param) {

        // TODO this is where we will post results back to UI
        // this is part of the AsyncTask framework

    }
}
