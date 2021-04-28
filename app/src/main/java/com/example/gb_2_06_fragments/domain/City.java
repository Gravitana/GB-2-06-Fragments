package com.example.gb_2_06_fragments.domain;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class City {

    @DrawableRes
    private final int drawableRes;

    @StringRes
    private final int titleRes;

    public City(int drawableRes, int titleRes) {
        this.drawableRes = drawableRes;
        this.titleRes = titleRes;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public int getTitleRes() {
        return titleRes;
    }

}
