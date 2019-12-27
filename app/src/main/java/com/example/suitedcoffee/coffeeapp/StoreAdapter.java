package com.example.suitedcoffee.coffeeapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class StoreAdapter extends ArrayAdapter<Product> {
    public StoreAdapter(Context context, List<Product> products)
    {
        super(context,0,products);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_product_big, parent, false);
        //Name
        Product currentProduct = getItem(position);
        TextView nameView = (TextView) listItemView.findViewById(R.id.list_product_name_big);
        nameView.setText(currentProduct.getName());
        //Price
        TextView priceView = (TextView) listItemView.findViewById(R.id.list_product_price_big);
        priceView.setText(String.valueOf(currentProduct.getPrice()));
        //Quantity
        TextView quantityView = (TextView) listItemView.findViewById(R.id.list_product_quantity_big);
        quantityView.setText(String.valueOf(currentProduct.getQuantity()));
        //Total
        TextView weightView = (TextView) listItemView.findViewById(R.id.list_product_weight_big);
        weightView.setText(String.valueOf(currentProduct.getWeight()));


        return listItemView;
    }
    }
