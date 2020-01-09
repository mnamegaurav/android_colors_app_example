package com.example.colors;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Fragment3 extends Fragment {

    Button backButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmen
        View view = inflater.inflate(R.layout.fragment3, container, false);

        backButton = (Button) view.findViewById(R.id.backButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (Fragment fragment: getFragmentManager().getFragments()){
                    getFragmentManager().beginTransaction().remove(fragment).commit();
                }
                Toast.makeText(getActivity(),"Color back to normal",Toast.LENGTH_LONG).show();

            }
        });



        return view;    }
}
