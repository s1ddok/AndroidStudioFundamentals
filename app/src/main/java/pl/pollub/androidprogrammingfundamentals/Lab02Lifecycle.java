package pl.pollub.androidprogrammingfundamentals;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Lab02Lifecycle extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab02_lifecycle);
        Log.d("Application message", "onCreate()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Application message", "onPause()"); }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Application message", "onResume()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Application message", "onStop()"); }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Application message", "onDestroy()");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) { super.onRestoreInstanceState(savedInstanceState); Log.d("Application message", "onRestoreInstanceState()");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) { super.onSaveInstanceState(outState); Log.d("Application message", "onSaveInstanceState()");
    }
    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class); startActivity(intent);
    }
}
