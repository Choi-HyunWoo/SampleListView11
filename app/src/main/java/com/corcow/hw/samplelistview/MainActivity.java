package com.corcow.hw.samplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
        myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);

        for (int i=0; i<10; i++) {
            myAdapter.add("한수", "123");
            myAdapter.add("한수", "123");
            myAdapter.add("한수", "123");
        }
    }
}
