package com.example.androproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class barber extends AppCompatActivity {
    SearchView searchView;
    ListView listView;
    ArrayList<String> list ;
    ArrayAdapter<String> adapter;
    String Items[] = new String[] {"Angel neha babycare" , "Precious neha care" , "Second माँ ", "Tiny tots babysits"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barber);
        searchView = (SearchView)findViewById(R.id.searchview1);
        listView = (ListView)findViewById(R.id.listview1);

        /*list.add("Second माँ ");
        list.add("Tiny tots babysits");
        list.add("Babycare");
        list.add("Blue and Pink");
        list.add("Precious baby care");
        list.add("Puduu baby care");
        list.add("Angel priya baby care");*/
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 , Items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(babysitter.this , Items[position], Toast.LENGTH_LONG).show();
                Intent intent = new Intent(barber.this,provider.class );
                String a= (String) listView.getItemAtPosition(position);

                intent.putExtra("MyValue",a);
                startActivity(intent);

            }
        });


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

            adapter.getFilter().filter(newText);
            return false;

            }
        });
    }

}
