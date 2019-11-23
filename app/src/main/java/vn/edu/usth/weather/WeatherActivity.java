package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TableLayout;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


public class WeatherActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Info", "onCreate() method here!!!");
        //create new fragment to be place in activity
        ForecastFragment firstFragment = new ForecastFragment();
        //Add fragment to the  'container'
//        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
        HomeFragmentPagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(adapter);
        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

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

