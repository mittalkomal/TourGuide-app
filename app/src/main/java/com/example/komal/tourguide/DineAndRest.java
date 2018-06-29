package com.example.komal.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DineAndRest extends Fragment {

    public DineAndRest() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_dine_and_rest, container, false);

        ArrayList<LocationDetail> infoList = new ArrayList<LocationDetail>();
        infoList.add(new LocationDetail(getString(R.string.dineName1), getString(R.string.dineInfo2)));
        infoList.add(new LocationDetail(getString(R.string.dineName2), getString(R.string.dineInfo2)));
        infoList.add(new LocationDetail(getString(R.string.dineName3), getString(R.string.dineInfo3)));

        ListView list = v.findViewById(R.id.dine_and_rest);
        Fragment_Adapter adapter = new Fragment_Adapter(v.getContext(), infoList);
        list.setAdapter(adapter);

        return v;
    }
}
