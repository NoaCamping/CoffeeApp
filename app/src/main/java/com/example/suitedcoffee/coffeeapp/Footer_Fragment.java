package com.example.suitedcoffee.coffeeapp;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Footer_Fragment extends Fragment implements View.OnClickListener {

    /*FragmentManager fm=getFragmentManager();
    FragmentTransaction ft=fm.beginTransaction();*/
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.footer_fragment,container,false);
        Button the_cs_list=(Button)v.findViewById(R.id.coffee_shops_button);
        the_cs_list.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view) {

    }
}
