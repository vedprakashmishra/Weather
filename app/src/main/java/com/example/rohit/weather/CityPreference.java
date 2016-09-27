package com.example.rohit.weather;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by Rohit on 19-Jul-16.
 */
public class CityPreference {
    SharedPreferences prefs;

    public CityPreference(Activity activity) {
        prefs=activity.getPreferences(Activity.MODE_PRIVATE);
    }

    String getCity() {
        return prefs.getString("city","Delhi");
    }
    void setCity(String city) {
        prefs.edit().putString("city",city).commit();
    }
}
