package com.example.komal.tourguide;

import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Malls_Activity extends Fragment {

    public Malls_Activity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_malls_, container, false);

        ArrayList<LocationDetail> infoList = new ArrayList<LocationDetail>();
        infoList.add(new LocationDetail(getString(R.string.mallsName1), getString(R.string.mallsInfo1)));
        infoList.add(new LocationDetail(getString(R.string.mallsName2), getString(R.string.mallsInfo2)));
        infoList.add(new LocationDetail(getString(R.string.mallsName3), getString(R.string.mallsInfo3)));


        ListView list = v.findViewById(R.id.malls);
        Fragment_Adapter adapter = new Fragment_Adapter(v.getContext(), infoList);
        list.setAdapter(adapter);

        return v;
    }
}