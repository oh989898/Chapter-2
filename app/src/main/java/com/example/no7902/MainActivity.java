package com.example.no7902;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Icon> iconList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyc);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        IconAdapter adapter = new IconAdapter(iconList);
        recyclerView.setAdapter(adapter);
    }

    private void init(){
        Icon a = new Icon("What is Activity", R.drawable.white);
        Icon b = new Icon("Start an Activity", R.drawable.red);
        Icon c = new Icon("🐾", R.drawable.redround);
        Icon d = new Icon("Activity Lifecycle", R.drawable.white);
        Icon e = new Icon("Manifest", R.drawable.red);
        Icon f = new Icon("Intent and Intent-Filter", R.drawable.white);
        Icon g = new Icon("UI knowledge", R.drawable.red);
        Icon h = new Icon("Widely used View", R.drawable.white);
        Icon ii = new Icon("Attribute", R.drawable.red);
        Icon j = new Icon("RecyclerView", R.drawable.white);
        Icon k = new Icon("LayoutManager", R.drawable.red);
        Icon l = new Icon("Adapter", R.drawable.white);
        Icon m = new Icon("ViewHolder", R.drawable.red);
        for (int i=0;i<2;i++) {
            if(i==0){iconList.add(c);}
            iconList.add(a);
            iconList.add(b);
            iconList.add(d);
            iconList.add(e);
            iconList.add(f);
            iconList.add(g);
            iconList.add(h);
            iconList.add(ii);
            iconList.add(j);
            iconList.add(k);
            iconList.add(l);
            iconList.add(m);
        }
    }
}

