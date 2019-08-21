package com.example.androproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;



/*
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

*/
public class SplashActivity extends AppCompatActivity {

    //    FirebaseAuth mAuth;
//    FirebaseUser mUser;
    //    ImageView imageView;
//    ImageView tandoori;
    Intent launchIntent = null;

    @RequiresApi(api = Build.VERSION_CODES.ECLAIR)
    @Override
    protected void onStart() {
        super.onStart();
        ActionBar acbr=getSupportActionBar();
        acbr.hide();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        changeStatusBarColor();
    }

    private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
      /*  mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();

        final Thread timer = new Thread() {
            public void run() {
                try {
                    if (mUser == null) {
                        launchIntent = new Intent(SplashScreenActivity.this, WelcomeActivity.class);
                    } else {
                        launchIntent = new Intent(SplashScreenActivity.this, MainActivity.class);
                    }
                    sleep(500);
                    startActivity(launchIntent);
                    SplashScreenActivity.this.finish();

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        };
*/

        final Thread timer = new Thread() {
            @RequiresApi(api = Build.VERSION_CODES.ECLAIR)
            public void run() {
                try {
                    launchIntent = new Intent(SplashActivity.this, Welcome.class);
                    sleep(2000);
                    startActivity(launchIntent);
                    SplashActivity.this.finish();
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        };

        timer.start();

       /* if (ConnectivityManagerHelper.isConnected(5000)) {
            PackageInfo pinfo = null;
        } else {
            final AlertDialog alertDialog = new AlertDialog.Builder(SplashScreenActivity.this).create();
            alertDialog.setTitle("No Internet Connection");
            alertDialog.setMessage("Please check your internet connection and try again");
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Retry", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (!ConnectivityManagerHelper.isConnected(3000)) {
                    } else {
                        alertDialog.dismiss();
                        timer.start();
                    }
                }
            });
            alertDialog.show();
        }*/
    }
}