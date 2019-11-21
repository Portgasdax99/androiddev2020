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

        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Info", "onStart() ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Info", "onResume()!!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Info", "onPause() !!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Info", "onStop()!!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Info", "onDestroy()!!");
    }
}

