package com.example.suitedcoffee.coffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactUs extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        //register with the listener interface
        Button contact_info_btn=(Button)findViewById(R.id.contact_us_btn);

        //setting a click listener on that view
        contact_info_btn.setOnClickListener(new View.OnClickListener(){
            //code in this method will be executed when contact_us button is pressed
            @Override
            public void onClick(View view){

            }
        });
    }
}
