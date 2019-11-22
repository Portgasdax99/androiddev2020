package vn.edu.usth.weather;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class WeatherAndForecastFragment extends Fragment {
    //Store instance Variable
    private String title;
    private int page;

    public WeatherAndForecastFragment(){
        //required empty public construction
    }
    //create fragment with arguments
    protected static WeatherAndForecastFragment newInstance(int page, String title) {
        WeatherAndForecastFragment weatherAndForecastFragment = new WeatherAndForecastFragment();
        Bundle args = new Bundle();
        args.putInt("page", page);
        args.putString("title", title);
        weatherAndForecastFragment.setArguments(args);
        return weatherAndForecastFragment;
    }

// Store instance variables based on arguments passed
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            page = getArguments().getInt("page", 0);
            title = getArguments().getString("title");
        }
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);
        RelativeLayout weather_container = (RelativeLayout) view.findViewById(R.id.weather_container);
        ((TextView) weather_container.findViewById(R.id.tab_location)).setText(title);
        return view;
    }
}