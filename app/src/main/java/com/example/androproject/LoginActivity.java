package com.example.androproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Sign In");

    }

    public void onSignin(View view) {
        startActivity(new Intent(LoginActivity.this,FrontpageActivity.class));
        this.finish();
    }

    public void goBack(View view) {
        //handling back press
        super.getClass();
        this.finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
