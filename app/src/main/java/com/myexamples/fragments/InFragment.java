package com.myexamples.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Sava on 7/21/2016.
 */
public class InFragment extends Fragment {

    OnInFragmentSelectedListener mCallback;

    public interface OnInFragmentSelectedListener {
        public void onTextSend(String text);
    }

    public InFragment (){
        // Required empty public constructor
    }

    public static InFragment newInstance() {
        InFragment fragment = new InFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_in, container, false);

        Button mButton = (Button) view.findViewById(R.id.button);
        final EditText editText = (EditText) view.findViewById(R.id.editText);
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                mCallback.onTextSend(editText.getText().toString());
            }
        });
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            mCallback = (OnInFragmentSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }
}
