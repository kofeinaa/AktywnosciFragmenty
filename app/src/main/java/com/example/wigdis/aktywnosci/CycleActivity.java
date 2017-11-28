package com.example.wigdis.aktywnosci;

import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CycleActivity extends AppCompatActivity
        implements PlusOneFragment.OnFragmentInteractionListener {

    private static final String WELCOME_MESSAGE = "Hello my friend";

    /**
     * Basic application startup logic.
     * @param savedInstanceState activity's previously saved state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_fragment_layout);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PlusOneFragment fragment = new PlusOneFragment();

        fragmentTransaction.add(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
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

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
