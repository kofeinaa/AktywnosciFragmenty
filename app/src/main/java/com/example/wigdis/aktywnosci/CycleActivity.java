package com.example.wigdis.aktywnosci;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CycleActivity extends AppCompatActivity {

    private static final String WELCOME_MESSAGE = "Hello my friend";

    /**
     * Basic application startup logic.
     * @param savedInstanceState activity's previously saved state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle);

        // find item, set welcome text, set state

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    }

    /**
     * Activity visible to the user. App initialize the code that maintains the UI.
     */
    @Override
    protected void onStart() {
        super.onStart();
    }

    /**
     * This is the state in which the app interacts with the user.
     */
    @Override
    protected void onResume() {
        super.onResume();
    }

    /**
     * Called at first signal that user is leaving.
     * Music and animations should be stopped.
     */
    @Override
    protected void onPause() {
        super.onPause();
    }

    /**
     * When user returns to the activity.
     */
    @Override
    protected void onRestart() {
        super.onRestart();

        // Call invalidate() method on textView object to force repainting.
    }

    /**
     * When activity is no longer visible for the user.
     */
    @Override
    protected void onStop() {
        super.onStop();
    }

    /**
     * Final call that activity receives.
     * Should release all of the resources that haven't been released yet.
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
