package com.example.asch_pan.tab_fragment_viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.flyco.tablayout.SegmentTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    SegmentTabLayout tabLayout;
    private ArrayList<RecordMulitChainFragment> recordsFragments = new ArrayList<>();
    String[] pagerTitle = {"测试一","测试二","测试三","测试四"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = (ViewPager)findViewById(R.id.record_pager);
        tabLayout = (SegmentTabLayout)findViewById(R.id.tablayout_record);
        initMultiTab();
    }


    private void initMultiTab() {
        for (String title : pagerTitle) {

            recordsFragments.add(RecordMulitChainFragment.getInstance(title));
        }

        tabLayout.setTabData(pagerTitle);
        tabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int i) {
                pager.setCurrentItem(i);
            }

            @Override
            public void onTabReselect(int i) {

            }
        });

        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tabLayout.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        tabLayout.setCurrentTab(0);
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return recordsFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return pagerTitle[position];
        }

        @Override
        public Fragment getItem(int position) {
            return recordsFragments.get(position);
        }
    }
}
