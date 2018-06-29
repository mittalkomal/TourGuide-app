package com.example.komal.tourguide;

/**
 * Created by Komal on 11-03-2018.
 */

public class LocationDetail {
    private String heading;
    private int imageResId = NO_IMAGE_PROVIDED;
    ;
    private String info;
    private static final int NO_IMAGE_PROVIDED = -1;

    public LocationDetail(String h, String i) {
        heading = h;
        info = i;
    }

    public LocationDetail(String h, int resId, String i) {
        heading = h;
        imageResId = resId;
        info = i;
    }

    public String getHeading() {
        return heading;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getInfo() {
        return info;
    }

    public boolean hasImage() {
        return imageResId != NO_IMAGE_PROVIDED;
    }
}
