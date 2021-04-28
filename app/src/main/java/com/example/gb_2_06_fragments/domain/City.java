package com.example.gb_2_06_fragments.domain;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class City implements Parcelable {

    @DrawableRes
    private final int drawableRes;

    @StringRes
    private final int titleRes;

    public City(int drawableRes, int titleRes) {
        this.drawableRes = drawableRes;
        this.titleRes = titleRes;
    }

    protected City(Parcel in) {
        drawableRes = in.readInt();
        titleRes = in.readInt();
    }

    public static final Creator<City> CREATOR = new Creator<City>() {
        @Override
        public City createFromParcel(Parcel in) {
            return new City(in);
        }

        @Override
        public City[] newArray(int size) {
            return new City[size];
        }
    };

    public int getDrawableRes() {
        return drawableRes;
    }

    public int getTitleRes() {
        return titleRes;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(drawableRes);
        dest.writeInt(titleRes);
    }
}
