package com.ex.frplayer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstPlayer} factory method to
 * create an instance of this fragment.
 */
public class FirstPlayer extends Fragment {
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first_player, container, false);
        textView=view.findViewById(R.id.text);
        textView.setText("First fragment message");
        return view;

    }

}