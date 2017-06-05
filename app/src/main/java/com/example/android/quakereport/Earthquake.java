package com.example.android.quakereport;

/**
 * Created by mbeev on 04/06/2017.
 */

public class Earthquake {

    private int Mag;
    private int Location;
    private int Date;

    public Earthquake(int mag, int location, int date) {
        Mag = mag;
        Location = location;
        Date = date;
    }

    public int getMag() {
        return Mag;
    }

    public int getLocation() {
        return Location;
    }

    public int getDate() {
        return Date;
    }

}
