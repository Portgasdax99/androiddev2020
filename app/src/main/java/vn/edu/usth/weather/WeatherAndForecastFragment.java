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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


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


//    private static final String days[] = {"Mon", "Tue", "Thus", "Wed", "Fri", "Sat", "Sun"};
//
//    private static final String Country[] = {"Praha","Paris","Berlin"};
//
//    private static int[] imageArray = {
//            R.drawable.bitcloudy,
//            R.drawable.bitsnow,
//            R.drawable.cloudy,
//            R.drawable.cloudysunny,
//            R.drawable.drizzle,
//            R.drawable.heavyrain,
//            R.drawable.partialsnow,
//            R.drawable.rainy,
//            R.drawable.snowy,
//            R.drawable.storm,
//            R.drawable.rainbow,
//            R.drawable.sunny,
//            R.drawable.thunder};
//
//    private final String weather[] = {
//            "A bit cloudy",
//            "A bit snow",
//            "Cloudy",
//            "Sunny and cloudy",
//            "Drizzle",
//            "Heavy rain",
//            "Partial snow",
//            "Rainy",
//            "Shower snow",
//            "Storm",
//            "Sunny and a bit cloudy",
//            "Sunny",
//            "Thunder and lightning"
//    };
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);

//        RelativeLayout weather_container = (RelativeLayout) view.findViewById(R.id.weather_container);
//        ((TextView) weather_container.findViewById(R.id.tab_location)).setText(title);

        View v = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);
        LinearLayout rowContainer = v.findViewById(R.id.row_container);

//        Random r = new Random();
//
//       for (int i = 0; i < 14; i++) {
//            View row = inflater.inflate(R.layout.weather_row, null);
//            ((TextView) row.findViewById(R.id.weater_row_id)).setText(days[i % 7]);
//
//            String tempRange = (10 + r.nextInt() %10) +"-"+ (20 + r.nextInt() %10);
//            ((TextView) row.findViewById(R.id.temp)).setText(tempRange);
//
//            int input = r.nextInt(imageArray.length);
//            ((ImageView) row.findViewById(R.id.image_id)).setImageResource(imageArray[input]);
//
//            ((TextView) row.findViewById(R.id.weather_mood)).setText(weather[input]);
//
//            rowContainer.addView(row);
//
//        }

        return v;
    }
}