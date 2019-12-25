package com.example.suitedcoffee.coffeeapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding the view that shows the questionnaire
        TextView coffee_search=(TextView)findViewById(R.id.search_coffee_btn);

        //setting a click listener on that view
        coffee_search.setOnClickListener(new OnClickListener(){
            //code in this method will be executed when quiz_button is pressed
            @Override
            public void onClick(View view){
                Intent coffeeSearchIntent=new Intent(MainActivity.this,SearchActivity.class);
                //start the new activity
                startActivity(coffeeSearchIntent);
            }
        });

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

        //finding the view that shows the list of coffee shops
        TextView coffee_shops_v=(TextView)findViewById(R.id.coffee_shops_button);

        //setting a click listener on that view
        coffee_shops_v.setOnClickListener(new OnClickListener(){
            //code in this method will be executed when quiz_button is pressed
            @Override
            public void onClick(View view){
                Intent csvIntent=new Intent(MainActivity.this,CoffeeShopActivity.class);
                //start the new activity
                startActivity(csvIntent);
            }
        });

        Button getEmail=(Button)findViewById(R.id.email_join_club);
        final TextView new_join=(TextView)findViewById(R.id.join_club_txt_box);

        getEmail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, new_join.getText(), Toast.LENGTH_SHORT).show();
                //updating email address to database

                //deleting text in textbox
                new_join.setText("");
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.navigation_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //handle item selection
        switch(item.getItemId()) {
            case R.id.home:
                Toast.makeText(this, "clicked home", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.about:
                Intent about_intent=new Intent(this,AboutUs.class);
                startActivity(about_intent);
                //Toast.makeText(this, "clicked about", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.coffee_shop:
                Toast.makeText(this, "clicked coffee shop", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.contact_us:
                Intent contact_us_intent=new Intent(this,ContactUs.class);
                startActivity(contact_us_intent);
                //Toast.makeText(this, "clicked contact us", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
