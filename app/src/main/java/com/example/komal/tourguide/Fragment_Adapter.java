package com.example.komal.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Komal on 09-03-2018.
 */

import java.util.List;

public class Fragment_Adapter extends ArrayAdapter<LocationDetail> {
    public Fragment_Adapter(Context context, List<LocationDetail> locationInfo) {
        super(context, 0, locationInfo);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LocationDetail posItem = getItem(position);
        View view = convertView;

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);
        }
        TextView heading = view.findViewById(R.id.heading);
        ImageView image = view.findViewById(R.id.imageId);
        TextView info = view.findViewById(R.id.info);
        if (posItem.hasImage()) {

            image.setImageResource(posItem.getImageResId());
            image.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            image.setVisibility(View.GONE);
        }

        heading.setText(posItem.getHeading());
        info.setText(posItem.getInfo());

        return view;
    }
}
