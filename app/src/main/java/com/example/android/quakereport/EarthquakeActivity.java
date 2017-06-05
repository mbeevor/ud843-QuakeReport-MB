/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        final ArrayList<Earthquake> earthquakes = new ArrayList<Earthquake>();

        earthquakes.add(new Earthquake(R.string.mag_one, R.string.location_one, R.string.date_one));
        earthquakes.add(new Earthquake(R.string.mag_two, R.string.location_two, R.string.date_two));
        earthquakes.add(new Earthquake(R.string.mag_three, R.string.location_three, R.string.date_three));
        earthquakes.add(new Earthquake(R.string.mag_four, R.string.location_four, R.string.date_four));
        earthquakes.add(new Earthquake(R.string.mag_five, R.string.location_five, R.string.date_five));
        earthquakes.add(new Earthquake(R.string.mag_six, R.string.location_six, R.string.date_six));
        earthquakes.add(new Earthquake(R.string.mag_seven, R.string.location_seven, R.string.date_seven));


        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
