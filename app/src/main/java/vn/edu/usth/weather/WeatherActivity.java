package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Info", "onCreate() method here!!!");

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Info", "onStart() method here!!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Info", "onResume() method here!!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Info", "onPause() method here!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Info", "onStop() method here!!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Info", "onDestroy() method here!!!");
    }
}