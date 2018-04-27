package com.example.nahabwe.groupie;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by nahabwe on 4/25/18.
 */

public class ActivityList extends AppCompatActivity {
    String[]groups={"SampleTitle"};
    String[]descripions={""The more elements these two arrays have, the longer the list};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ListView listView=findViewById(R.id.listView);
        ListViewAdapter listViewAdapter=new ListViewAdapter(R.layout.activity_row,R.id.titl,R.id.idDescriptionGroup,this,groups,descripions);
        listView.setAdapter(listViewAdapter);
    }
}
