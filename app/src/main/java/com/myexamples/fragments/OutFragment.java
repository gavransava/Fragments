package com.myexamples.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Sava on 7/21/2016.
 */

public class OutFragment extends Fragment {

    private View mOutFragment;

    public OutFragment() {
        // Required empty public constructor
    }

    public static OutFragment newInstance() {
        OutFragment fragment = new OutFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mOutFragment = inflater.inflate(R.layout.fragment_out, container, false);
        return mOutFragment;
    }

    public void displayText(String text){
        TextView textView = (TextView) mOutFragment.findViewById(R.id.textView);
        textView.setText(text);
    }
}
