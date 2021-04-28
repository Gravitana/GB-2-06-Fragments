package com.example.gb_2_06_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.gb_2_06_fragments.domain.City;

public class DetailsFragment extends Fragment {

    private static final String ARG_CITY = "ARG_CITY";

    public static DetailsFragment newInstance(City city) {
        DetailsFragment fragment = new DetailsFragment();

        Bundle bundle = new Bundle();
        bundle.putParcelable(ARG_CITY, city);

        fragment.setArguments(bundle);
        return fragment;
    }

    public DetailsFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView = view.findViewById(R.id.image);
        TextView title = view.findViewById(R.id.title);

        City city = getArguments().getParcelable(ARG_CITY);

        imageView.setImageResource(city.getDrawableRes());
        title.setText(city.getTitleRes());
    }
}
