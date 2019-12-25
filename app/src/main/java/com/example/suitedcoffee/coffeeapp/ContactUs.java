package com.example.suitedcoffee.coffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ContactUs extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        //register with the listener interface
        Button contact_info_btn=(Button)findViewById(R.id.contact_us_btn);
        final TextView name=(TextView)findViewById(R.id.contact_us_intro_1);
        final TextView email=(TextView)findViewById(R.id.contact_us_intro_2);
        final TextView phone=(TextView)findViewById(R.id.contact_us_intro_3);
        final TextView message=(TextView)findViewById(R.id.contact_us_intro_5);

        //setting a click listener on that view
        contact_info_btn.setOnClickListener(new View.OnClickListener(){
            //code in this method will be executed when contact_us button is pressed
            @Override
            public void onClick(View view){
                //Toast.makeText(ContactUs.this, email.getText()+" ,"+phone.getText(), Toast.LENGTH_SHORT).show();
                //Inserting messages data into database

                //deleting text from text boxes
                name.setText("");
                email.setText("");
                phone.setText("");
                message.setText("");
            }
        });
    }
}
