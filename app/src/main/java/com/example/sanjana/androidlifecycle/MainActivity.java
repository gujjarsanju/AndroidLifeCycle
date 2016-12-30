package com.example.sanjana.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String msg = "Android";

    /** Called when Activity is first created .
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"this onCreate() method");
    }


    /**
     * Called when Activity is starts.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg,"this onStart() method");
    }

    /**
     * Called when Activity is resumed.
     */

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(msg,"this onPostResume() method");
    }

    /**
     * Called when Activity is Restarted.
     */

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(msg,"this onRestart() method");
    }

    /**
     * Called when Activity is paused.
     */

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg,"this onPause() method");
    }

    /**
     * Called when Activity is destroyed.
     */

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg,"this onDestroy() method");
    }

    /**
     * Called when Activity is stops.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg,"this onStop method");
    }
}
