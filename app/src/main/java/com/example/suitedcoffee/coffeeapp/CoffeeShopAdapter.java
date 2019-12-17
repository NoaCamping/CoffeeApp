package com.example.suitedcoffee.coffeeapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CoffeeShopAdapter extends ArrayAdapter<CoffeeShop> {

    /**
     * Create a new {@link CoffeeShopAdapter} object
     *
     * @param context is the current context that the adapter is being created in
     * @param cs is the list  of coffee shops to be displayed
     *
     */
    public CoffeeShopAdapter(Context context, ArrayList<CoffeeShop> cs)
    {
        super(context,0,cs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
       //Check if an existing view is being reused, otherwise inflate the view
       View listItemView=convertView;
       if(listItemView==null)
       {
           listItemView= LayoutInflater.from(getContext()).inflate(
                   R.layout.list_item,parent,false);
       }
        //Get the CoffeeShop object located at this position in the list
        CoffeeShop currentCoffeeShop=getItem(position);

        //Find the TextView in the list_item.xml layout with the Id business name
        TextView b_nameTextView=(TextView)listItemView.findViewById(R.id.business_name_text_view);
        //Get manager name from the current CoffeeShop object and set this text on the
        //b_name TextView
        b_nameTextView.setText(currentCoffeeShop.getBusiness_name());

       //Find the TextView in the list_item.xml layout with the Id manager name
        TextView nameTextView=(TextView)listItemView.findViewById(R.id.manager_text_view);
        //Get manager name from the current CoffeeShop object and set this text on the
        //name TextView
        nameTextView.setText("Manager: "+currentCoffeeShop.getManager());

        //Find the TextView in the list_item.xml with the id of phone number
        TextView numberTextView=(TextView)listItemView.findViewById(R.id.phone_text_view);
        //Get the phone number from current CoffeeShop object and set this text on the number textView
        numberTextView.setText("Phone number: "+currentCoffeeShop.getPhone_number());

      return listItemView;
    }
}
