package com.example.komal.tourguide;

import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Historical_places extends Fragment {

    public Historical_places() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_historical_places, container, false);

        ArrayList<LocationDetail> infoList = new ArrayList<LocationDetail>();
        infoList.add(new LocationDetail(getString(R.string.historicalName1), getString(R.string.historicalInfo1)));
        infoList.add(new LocationDetail(getString(R.string.historicalName2), getString(R.string.historicalInfo2)));
        infoList.add(new LocationDetail(getString(R.string.historicalName3), getString(R.string.historicalInfo3)));


        ListView list = v.findViewById(R.id.Historical);
        Fragment_Adapter adapter = new Fragment_Adapter(v.getContext(), infoList);
        list.setAdapter(adapter);

        return v;
    }
}
