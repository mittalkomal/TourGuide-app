package com.example.komal.tourguide;

import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ListView;


import java.util.ArrayList;

public class SightsSeeing extends Fragment {
    public SightsSeeing() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_sights_seeing, container, false);

        ArrayList<LocationDetail> infoList = new ArrayList<LocationDetail>();
        infoList.add(new LocationDetail(getString(R.string.sightName1), R.drawable.rockgarden, getString(R.string.sightInfo1)));
        infoList.add(new LocationDetail(getString(R.string.sightName2), R.drawable.rosegarden, getString(R.string.sightInfo2)));
        infoList.add(new LocationDetail(getString(R.string.sightName3), R.drawable.sukhna, getString(R.string.sightInfo3)));


        ListView list = v.findViewById(R.id.sight);
        Fragment_Adapter adapter = new Fragment_Adapter(v.getContext(), infoList);
        list.setAdapter(adapter);

        return v;
    }
}
