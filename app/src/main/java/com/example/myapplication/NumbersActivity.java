package com.example.myapplication;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
     ArrayList<Words> words= new ArrayList<Words>();
     words.add(new Words("one","lutti"));
     words.add(new Words("two","ottiko"));
     words.add(new Words("three","tolookosu"));
        words.add(new Words("four","oyyisa"));
        words.add(new Words("five","massokka"));
        words.add(new Words("six","temokka"));
        words.add(new Words("seven","kenekaku"));
        words.add(new Words("eight","kawinta"));
        words.add(new Words("nine","wo'e"));
        words.add(new Words("ten","na'aacha"));
//        LinearLayout Rootview =(LinearLayout)findViewById(R.id.rootview);
//        int i=0;
//        while(i<10) {
//        TextView wordview = new TextView(this);
//            wordview.setText(words.get(i));
//            Rootview.addView(wordview);
//            i++;
        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        }
    }
