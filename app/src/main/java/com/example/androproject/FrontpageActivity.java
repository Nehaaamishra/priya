package com.example.androproject;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class FrontpageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage);

        CardView cv = (CardView) findViewById(R.id.babysitter);
        GridLayout gridView = (GridLayout)findViewById(R.id.grid_view);



    }
   /* public void
    onClick(CardView Cv , View V){

        Intent i = new Intent(FrontpageActivity.this , babysitter.class);
        startActivity(i);}*/


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

        finish();
    }

    public void onBabysitter(View view) {
        Intent i = new Intent(FrontpageActivity.this , babysitter.class);
        startActivity(i);
    }

    public void onBarber(View view) {
        Intent j = new Intent(FrontpageActivity.this , barber.class);
        startActivity(j);
    }
    public void onCarpenter(View view) {
        Intent k = new Intent(FrontpageActivity.this , carpenter.class);
        startActivity(k);
    }

    public void onElectrician(View view) {
        Intent l = new Intent(FrontpageActivity.this , electrician.class);
        startActivity(l);
    }
    public void onMaid(View view) {
       // Intent m = new Intent(FrontpageActivity.this , maid.class);
      ///  startActivity(m);
        Toast.makeText(FrontpageActivity.this,"HELLOOOO",Toast.LENGTH_SHORT).show();
        }
    public void onPhotographer(View view) {
        Intent n = new Intent(FrontpageActivity.this , photographer.class);
        startActivity(n);
    }
    public void onPlumber(View view) {
        Intent o = new Intent(FrontpageActivity.this , plumber.class);
        startActivity(o);
    }
    public void onBeautician(View view) {
        Intent p = new Intent(FrontpageActivity.this , babysitter.class);
        startActivity(p);
    }

}



