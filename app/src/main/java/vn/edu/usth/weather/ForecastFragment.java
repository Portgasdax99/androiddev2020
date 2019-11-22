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
import android.widget.TextView;
import android.text.InputType;

import java.util.Random;


public class ForecastFragment extends Fragment {
    public ForecastFragment() {
    }


    private static final String days[] = {"Mon", "Tue", "Thus", "Wed", "Fri", "Sat", "Sun"};

    private static int[] imageArray = {
            R.drawable.bitcloudy,
            R.drawable.bitsnow,
            R.drawable.cloudy,
            R.drawable.cloudysunny,
            R.drawable.drizzle,
            R.drawable.heavyrain,
            R.drawable.partialsnow,
            R.drawable.rainy,
            R.drawable.snowy,
            R.drawable.storm,
            R.drawable.rainbow,
            R.drawable.sunny,
            R.drawable.thunder};

    private final String weather[] = {
            "A bit cloudy",
            "A bit snow",
            "Cloudy",
            "Sunny and cloudy",
            "Drizzle",
            "Heavy rain",
            "Partial snow",
            "Rainy",
            "Shower snow",
            "Storm",
            "Sunny and a bit cloudy",
            "Sunny",
            "Thunder and lightning"
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_forecast, container, false);
//        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.fragment_forecast, container, false);
//        LinearLayout rowContainer = v.findViewById(R.id.row_container);
//
//        Random r = new Random();
//
//        for (int i = 0; i < 14; i++) {
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
//        return v;
    }
}