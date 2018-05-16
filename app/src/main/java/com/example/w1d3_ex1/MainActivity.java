package com.example.w1d3_ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TEST";

    @Override
    /*
        onCreate fires off when the system first creates the activity, putting it into the Created
        state from the Initialized state. This callback happens exactly once in the lifecycle, and
        should be used for initialization, such as instantiating data or creating views.
         After this method is finished executing, the activity proceeds to the Started state.
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: app is in Created state");
    }

    /*
        onStart fires off after the system finishes executing onCreate and advances to the Started
        state. The onStart() call makes the activity visible to the user, but the activity is not
        in the foreground or interactive. Because of this, this method is a good place to start
        setting up the code that will maintain the UI. After onStart() finishes executing, the
        activity advances to the Resumed state.
     */
    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "onStart: app is in Started state");
    }

    /*
        onResume fires off when the system finishes executing onStart() and advances to the Resumed
        state or when the activity returns from the Paused state. The activity moves to the foreground
        and becomes interactive by the user. Any kind of behavior the user will be able to see or interact
        with will happen here. The activity will stay in this state until something takes focus away
        from the app, at which point it will move onto the Paused state. Because the activity can go
        in and out of this state, it's important to set onResume() up so it reinitializes anything
        released by onPause().
     */
    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "onResume: app is in the Resumed state");
    }

    /*
        onPause() fires off when there is any indication that the user is leaving the activity. It
        should be used to stop/adjust things that aren't in active use (such as the camera). It is important
        to do so because battery life or mobile device performance can be affected if resources aren't properly freed up.
        The application remains in the Paused state until the activity is resumed (Paused -> Resumed state)
        or becomes completely invisible to the user. (Paused -> Stopped state)
     */
    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG, "onPause: app is in the Paused state");
    }

    /*
        onStop() fires off when the activity is no longer visible to the user or when the activity
        is finished and needs to be terminated. This method should be used to release or adjust resources
        that won't be used while the activity isn't visible to the user (eg. stop animations). This
        method should also be used to perform shutdown operations, such as saving information to a
        database. The system stays in this state until the activity is restarted or destroyed.

     */
    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "onStop: app is in the Stopped state");
    }

    /*
        onDestroy() fires off when it the activity is finished or needs to be terminated for any
        other reason (such as the system freeing up memory). This callback should be used to free up
        any resources that were not freed up by onPause() or onStop().
     */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: rip");
    }

}
