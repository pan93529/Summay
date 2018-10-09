package com.example.asch_pan.tab_fragment_viewpager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecordMulitChainFragment extends Fragment {

    String title;

    public static RecordMulitChainFragment getInstance(String title) {
        RecordMulitChainFragment fragment = new RecordMulitChainFragment();
        fragment.title = title;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment, null);
        TextView textView = v.findViewById(R.id.text1);
        textView.setText(title);

        return v;
    }

}