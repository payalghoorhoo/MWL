package com.example.mauritiuswildlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

 //All Declaration below
    Button button;
    ExpandableListView expandableListView;
    List<String> listGroup;
    HashMap<String,List<String>> listItem;
    MainAdapter adapter;


 //All Buttons below
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whoarewe);


        //Expandable List View
        expandableListView = findViewById(R.id.expand1);
        listGroup = new ArrayList<>();
        listItem = new HashMap<>();
        adapter = new MainAdapter(this, listGroup,listItem);
        expandableListView.setAdapter(adapter);
        initListData();

    }


    private void initListData() {
        listGroup.add(getString(R.string.what_we_do));
        //listGroup.add(getString(R.string.what_we_do));
        //listGroup.add(getString(R.string.what_we_do));

        String[] array;

        List<String> list = new ArrayList<>();
        array = getResources().getStringArray(R.array.what_we_do);

        for (String item: array){
            list.add(item);
        }

        listItem.put(listGroup.get(0),list);
        //listItem.put(listGroup.get(1),list2);
        //listItem.put(listGroup.get(2),list3);


        adapter.notifyDataSetChanged();
    }


    public void boxOne(View view) {



        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Simple Button 1", Toast.LENGTH_LONG).show();
                //Intent i = new Intent(MainActivity.this, Whoarewe.class);
                //startActivity(i);
            }
        });
    }
}
