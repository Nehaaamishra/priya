package com.example.androproject;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
    Button register;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ActionBar acbr=getSupportActionBar();
        acbr.hide();
        register = (Button) findViewById(R.id.sign_up_activ_btn);
        login = (Button) findViewById(R.id.sign_in_activ_btn);
    }


    public void onlogin(View view) {
        //do compress code jitna possible ho skata hain
        //and use onclicks else using id may shows null pointers pro tip from android developers
        //and always keep your code clean
        //give activities name same as xml file names
        startActivity(new Intent(Welcome.this, LoginActivity.class));
    }

    public void onregister(View view) {
        //do compress code jitna possible ho skata hain
        //and use onclicks else using id may shows null pointers pro tip from android developers
        //and always keep your code clean
        //give activities name same as xml file names
        startActivity(new Intent(Welcome.this, RegisterActivity.class));
    }

}