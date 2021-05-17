package com.nourhan.fragmentstest;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager FragmentManager = getSupportFragmentManager();

        BodyFragment head= new BodyFragment(Assets.getHeads());
        FragmentManager.beginTransaction().add(R.id.head,head).commit();

        BodyFragment body= new BodyFragment(Assets.getBodies());
        FragmentManager.beginTransaction().add(R.id.body,body).commit();

        BodyFragment legs= new BodyFragment(Assets.getLegs());
        FragmentManager.beginTransaction().add(R.id.leg,legs).commit();

    }
}