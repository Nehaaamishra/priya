package com.example.androproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;



public class provider extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_provider);
        tv = (TextView)findViewById(R.id.textView);

        Intent i=getIntent();
        String s = i.getStringExtra("MyValue");
        tv.setText(s);
        //Toast.makeText(this, "i", Toast.LENGTH_SHORT).show();


    }
}
