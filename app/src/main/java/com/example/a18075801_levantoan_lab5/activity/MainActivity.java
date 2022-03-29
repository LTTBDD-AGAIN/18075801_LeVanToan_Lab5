package com.example.a18075801_levantoan_lab5.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.a18075801_levantoan_lab5.R;
import com.example.a18075801_levantoan_lab5.adapter.DonutAdapter;
import com.example.a18075801_levantoan_lab5.model.Donut;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Donut> mListDonut;
    private ListView mLvDonut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLvDonut = (ListView) findViewById(R.id.lvDonut);
        mListDonut = new ArrayList<>();
        mListDonut.add(new Donut(1, "Tasty Donut", "Spicy tasty donut falmilly", 10));
        mListDonut.add(new Donut(2, "Pink Donut", "Spicy tasty donut falmilly", 20));
        mListDonut.add(new Donut(3, "Floating Donut", "Spicy tasty donut falmilly", 30));
        mListDonut.add(new Donut(4, "Tasty Donut", "Spicy tasty donut falmilly", 40));

        DonutAdapter adapter = new DonutAdapter(this,R.layout.item_donut_activity,mListDonut);
        mLvDonut.setAdapter(adapter);

    }
}