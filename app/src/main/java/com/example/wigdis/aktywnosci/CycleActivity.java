package com.example.wigdis.aktywnosci;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CycleActivity extends AppCompatActivity {

    private static final String WELCOME_MESSAGE = "Hello my friend";
    private static int state;

    /**
     * Basic application startup logic.
     * @param savedInstanceState activity's previously saved state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle);
        state = 0;

        TextView tv1 = (TextView)findViewById(R.id.textView);
        tv1.setText(WELCOME_MESSAGE);

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
        ++state;

        TextView tv1 = (TextView)findViewById(R.id.textView);
        tv1.setText(String.valueOf(state));
        tv1.invalidate();
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
        state = 0;
    }
}
