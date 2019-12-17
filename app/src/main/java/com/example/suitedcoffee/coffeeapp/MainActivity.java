package com.example.suitedcoffee.coffeeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //finding the view that shows the questionnaire
        TextView coffee=(TextView)findViewById(R.id.quiz_button);

        //setting a click listener on that view
        coffee.setOnClickListener(new OnClickListener(){
            //code in this method will be executed when quiz_button is pressed
            @Override
            public void onClick(View view){
                Intent questingIntent=new Intent(MainActivity.this,Questionnaire.class);
                //start the new activity
                startActivity(questingIntent);
            }
        });

        //finding the view that shows the coffee shops location
        TextView csLocation=(TextView)findViewById(R.id.cs_button);
        csLocation.setOnClickListener(new OnClickListener(){
            //code in this method will be executed when cs_button is pressed
            @Override
            public void onClick(View view){
                Intent cs_searchIntent=new Intent(MainActivity.this,CoffeeShopActivity.class);
                //start the new activity
                startActivity(cs_searchIntent);
            }
        });
    }



}
