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

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Words> words= new ArrayList<Words>();
        words.add(new Words("one","lutti",R.drawable.color_black));
        words.add(new Words("two","ottiko",R.drawable.color_brown));
        words.add(new Words("three","tolookosu",R.drawable.color_dusty_yellow));
        words.add(new Words("four","oyyisa",R.drawable.color_gray));
        words.add(new Words("five","massokka",R.drawable.color_green));
        words.add(new Words("six","temokka",R.drawable.color_mustard_yellow));
        words.add(new Words("seven","kenekaku",R.drawable.color_red));
        words.add(new Words("eight","kawinta",R.drawable.color_white));
//        words.add(new Words("nine","wo'e",R.drawable.c));
//        words.add(new Words("ten","na'aacha",R.drawable.family_younger_sister));
//        LinearLayout Rootview =(LinearLayout)findViewById(R.id.rootview);
//        int i=0;
//        while(i<10) {
//        TextView wordview = new TextView(this);
//            wordview.setText(words.get(i));
//            Rootview.addView(wordview);
//            i++;
        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list3);

        listView.setAdapter(adapter);
    }
}
