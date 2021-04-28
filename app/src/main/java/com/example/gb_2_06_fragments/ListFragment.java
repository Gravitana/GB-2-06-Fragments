package com.example.gb_2_06_fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.gb_2_06_fragments.domain.CitiesRepository;
import com.example.gb_2_06_fragments.domain.City;

import java.util.List;

public class ListFragment extends Fragment {

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<City> cities = new CitiesRepository().getCities();

        LinearLayout citiesList = view.findViewById(R.id.cities_list);

        for (City city : cities) {
            View cityView = LayoutInflater.from(requireContext())
                    .inflate(R.layout.item_city, citiesList, false);

            ImageView image = cityView.findViewById(R.id.image);
            image.setImageResource(city.getDrawableRes());

            TextView title = cityView.findViewById(R.id.city_name);
            title.setText(city.getTitleRes());

            citiesList.addView(cityView);
        }
    }
}