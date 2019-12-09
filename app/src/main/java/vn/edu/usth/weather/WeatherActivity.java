package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableLayout;
import android.content.Context;
import android.media.MediaPlayer;
import android.widget.Toast;

import java.io.FileInputStream;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


public class WeatherActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Info", "onCreate() method here!!!");
        //create new fragment to be place in activity
//        ForecastFragment firstFragment = new ForecastFragment();
        //Add fragment to the  'container'
//        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
        HomeFragmentPagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(adapter);
        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

        MediaPlayer mediaPlayer = MediaPlayer.create(WeatherActivity.this, R.raw.audio);
        mediaPlayer.start();

        Toolbar my_toolbar;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_weather, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.refresh:
                Toast.makeText(getApplicationContext(), "refresh successfully", Toast.LENGTH_LONG).show();
                return true;
            case R.id.setting:
                Intent intent = new Intent(this.PrefActivity.class);
                startActivities(intent);
                return true;
                default: return super.onOptionsItemSelected(item);
        }

    }

}

