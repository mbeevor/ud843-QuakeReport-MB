package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mbeev on 04/06/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        }

        Earthquake earthquake = getItem(position);

        TextView mag = (TextView) listItemView.findViewById(R.id.mag);
        mag.setText(earthquake.getMag());

        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(earthquake.getLocation());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(earthquake.getDate());

        return listItemView;
    }
}
