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

public class CartAdapter extends ArrayAdapter<Product> {

    public CartAdapter(Context context, List<Product> products)
    {
        super(context,0,products);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItemView=convertView;
        if(listItemView==null)
            listItemView= LayoutInflater.from(getContext()).inflate(
                    R.layout.list_product,parent,false);
        //Name
       Product currentProduct=getItem(position);
       TextView nameView=(TextView)listItemView.findViewById(R.id.list_product_name);
        nameView.setText(currentProduct.getName());
        //Price
        TextView priceView=(TextView)listItemView.findViewById(R.id.list_product_price);
        priceView.setText(String.valueOf(currentProduct.getPrice()));
        //Quantity
        TextView quantityView=(TextView)listItemView.findViewById(R.id.list_product_quantity);
        quantityView.setText(String.valueOf(currentProduct.getQuantity()));
        //Total
        TextView totalView=(TextView)listItemView.findViewById(R.id.list_product_total);
        totalView.setText(String.valueOf(currentProduct.getTotal()));


        return listItemView;


    }
}
