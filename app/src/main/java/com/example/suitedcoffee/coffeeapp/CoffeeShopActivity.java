package com.example.suitedcoffee.coffeeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CoffeeShopActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_shop_list);

        ArrayList<CoffeeShop> cs_list=new ArrayList<>();
        cs_list.add(new CoffeeShop("Coffee4u","John","0528123456"));
        cs_list.add(new CoffeeShop("Fresh_n_up","Mary","0528123457"));

        CoffeeShopListAdapter itemsAdapter=
                new CoffeeShopListAdapter(this,cs_list);
        ListView listView=(ListView)findViewById(R.id.the_cs_list);
        listView.setAdapter(itemsAdapter);



    }
}
