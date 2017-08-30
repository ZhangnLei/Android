package com.example.mrzhang.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private String[] data = {"apple","Banana","Orange","watermalon","Pear","Grape","PIneapple","String","apple","Banana","Orange","watermalon","Pear","Grape","PIneapple","String"};


    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){ //设置 listVIew 的监听器 ,点击某一个list组件时 用 Toast 的方式 返回 组件名称
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();

            }
        });
//        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Fruit fruit = fruitList.get(position);
//                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
//            }
//        });


//        ArrayAdapter<String> adaper = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adaper);

    }

    public void initFruits(){ //初始化组件队列
        for(int i = 0;i < 10 ; i++)
        {
            Fruit apple = new Fruit("Appel",R.drawable.appel);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana",R.drawable.orange);
            fruitList.add(banana);
            Fruit watermelon = new Fruit("Watermalon",R.drawable.watermelon);
            fruitList.add(watermelon);
        }
    }
}
