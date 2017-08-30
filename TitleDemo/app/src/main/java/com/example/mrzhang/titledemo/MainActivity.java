package com.example.mrzhang.titledemo;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private String[] data = {"apple","Banana","Orange","watermalon","Pear","Grape","PIneapple","String","apple","Banana","Orange","watermalon","Pear","Grape","PIneapple","String"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        ActionBar actionBar = getSupportActionBar();
//        if(actionBar != null){
//            actionBar.hide();
//        }

        ArrayAdapter<String> adaper = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adaper);
    }
}
