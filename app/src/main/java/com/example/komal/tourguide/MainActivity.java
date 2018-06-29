package com.example.komal.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager mainView = findViewById(R.id.viewpager);
        mainView.setAdapter(new MyFragmentAdapter(getSupportFragmentManager()));
    }

    private class MyFragmentAdapter extends FragmentPagerAdapter {


        public MyFragmentAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int pos) {
            if (pos == 0) {
                return new SightsSeeing();
            } else if (pos == 1) {
                return new Historical_places();
            } else if (pos == 2) {
                return new Malls_Activity();
            }
            return new DineAndRest();
        }

        @Override
        public int getCount() {
            return 4;
        }
    }
}
