package com.nourhan.fragmentstest;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class BodyFragment extends Fragment {
    private ArrayList<Integer> parts =new ArrayList<Integer>();
    private  int Counter=0;

    public BodyFragment(ArrayList<Integer> parts) {
        this.parts.addAll(parts);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_body_fragment, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView imageView = view.findViewById(R.id.img);
        imageView.setImageResource(parts.get(0));

        imageView.setOnClickListener (new View.OnClickListener() {
    @Override
    public void onClick(View v){
        if (Counter < parts.size() - 1) Counter++;
        else Counter = 0;
         imageView.setImageResource(parts.get(Counter));

    }
        });

    }
}