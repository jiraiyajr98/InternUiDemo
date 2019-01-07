package com.intern.ankan.internui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;

    List<GetterSetter> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        adapter = new Adapter(MainActivity.this,list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2));

        addData();

    }

    void addData(){

        list.add(new GetterSetter("Business Management",30));
        list.add(new GetterSetter("IT & Cloud Computing",80));
        list.add(new GetterSetter("Learn How To Play Guitar",50));
        list.add(new GetterSetter("Basics of Baking Cakes",20));
        list.add(new GetterSetter("Modern Meditation",50));
        list.add(new GetterSetter("Project Management",90));
        list.add(new GetterSetter("Business Management",30));
        list.add(new GetterSetter("IT & Cloud Computing",80));
        list.add(new GetterSetter("Learn How To Play Guitar",50));
        list.add(new GetterSetter("Basics of Baking Cakes",20));
        list.add(new GetterSetter("Modern Meditation",50));
        list.add(new GetterSetter("Project Management",90));

        adapter.notifyItemRangeInserted(0,list.size());
    }
}
