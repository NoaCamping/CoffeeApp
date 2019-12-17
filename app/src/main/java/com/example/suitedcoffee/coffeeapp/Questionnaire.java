package com.example.suitedcoffee.coffeeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class Questionnaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        //Initializing array of questions and array of answers
        String[] questions=new String[6];
        String[][] answers=new String[6][4];

        //adding  questions
        questions[0]="What coffee did you drink today?";
        questions[1]="What do you usually buy? beans or powder?";
        questions[2]="What coffee did you drink today?";
        questions[3]="What coffee did you drink today?";
        questions[4]="What coffee did you drink today?";
        questions[5]="What coffee did you drink today?";
        answers[0][0]="black coffee";
        //displaying data on screen

        ArrayAdapter<String> itemsAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,questions);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
}
