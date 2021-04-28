package com.example.gb_2_06_fragments.domain;

import com.example.gb_2_06_fragments.R;

import java.util.ArrayList;
import java.util.List;

public class CitiesRepository {

    public List<City> getCities() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City(R.drawable.izh, R.string.izh));
        cities.add(new City(R.drawable.msc, R.string.msc));
        cities.add(new City(R.drawable.nsk, R.string.nsk));
        cities.add(new City(R.drawable.sam, R.string.sam));
        cities.add(new City(R.drawable.ebrg, R.string.ebrg));
        cities.add(new City(R.drawable.spb, R.string.spb));
        cities.add(new City(R.drawable.chel, R.string.chel));
        return cities;
    }
}
