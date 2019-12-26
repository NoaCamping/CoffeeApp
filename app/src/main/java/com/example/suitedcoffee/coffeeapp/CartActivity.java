package com.example.suitedcoffee.coffeeapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        ArrayList<Product> p_list=new ArrayList<>();
        p_list.add(new Product("black coffee",4.5,1));
        p_list.add(new Product("espresso",4.5,2));

        ListView items_in_cart=(ListView)findViewById(R.id.activity_cart);
        CartAdapter adapter=new CartAdapter(this,p_list);
        items_in_cart.setAdapter(adapter);

        //Adding header to items in cart list
        TextView header=new TextView(this);
        header.setText("Product Name\t\t\t\t\t\t\t\t\t Price\t\t\t\t Quantity\t\t\t\t Sum");
        items_in_cart.addHeaderView(header);
    }
}
