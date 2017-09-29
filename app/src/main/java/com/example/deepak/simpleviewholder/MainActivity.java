package com.example.deepak.simpleviewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<Object> dataList = new ArrayList<>();
        dataList.add("Apple");
        dataList.add("Orange");
        dataList.add("Cherry");
        dataList.add("Papaya");
        dataList.add("Grapes");
        dataList.add(100);
        dataList.add(200);
        dataList.add(300);
        dataList.add(400);
        ViewAdapter viewAdapter = new ViewAdapter(dataList);
        recyclerView.setAdapter(viewAdapter);

    }
}
