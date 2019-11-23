package vn.edu.usth.weather;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class HomeFragmentPagerAdapter extends  FragmentPagerAdapter{
    private final int Page_count =3;
    private String[] title = new String[]{"Praha","Paris","Berlin"};

    protected HomeFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }
    // Returns total number of pages
    @Override
    public int getCount(){
        return Page_count;
    }
    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int page){
        switch (page){
            case 0: //Fragment # 0 - This will show FirstFragment
                return WeatherAndForecastFragment.newInstance(0, "Page #0");
             case 1: return WeatherAndForecastFragment.newInstance(1, "Page #1");
             case 2:   return WeatherAndForecastFragment.newInstance(2, "Page #2");
                default: return  null;
        }
    }
    // Returns the page title for the top indicator
    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return title[position];
    }
}
