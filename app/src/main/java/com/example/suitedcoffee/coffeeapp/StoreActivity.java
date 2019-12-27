package com.example.suitedcoffee.coffeeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class StoreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        ArrayList<Product> store_products=new ArrayList<>();
        store_products.add(new Product("Black Coffee",10.45,1,0));
        store_products.add(new Product("Espresso",15.5,1,0));
        StoreAdapter sAdapter=
                new StoreAdapter(this,store_products);
        ListView listView=(ListView)findViewById(R.id.store_list);
        listView.setAdapter(sAdapter);
    }
}
