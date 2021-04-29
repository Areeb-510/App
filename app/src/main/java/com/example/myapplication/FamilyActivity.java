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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Words> words= new ArrayList<Words>();
        words.add(new Words("one","lutti",R.drawable.family_father));
        words.add(new Words("two","ottiko",R.drawable.family_mother));
        words.add(new Words("three","tolookosu",R.drawable.family_grandfather));
        words.add(new Words("four","oyyisa",R.drawable.family_grandmother));
        words.add(new Words("five","massokka",R.drawable.family_daughter));
        words.add(new Words("six","temokka",R.drawable.family_son));
        words.add(new Words("seven","kenekaku",R.drawable.family_older_brother));
        words.add(new Words("eight","kawinta",R.drawable.family_older_sister));
        words.add(new Words("nine","wo'e",R.drawable.family_younger_brother));
        words.add(new Words("ten","na'aacha",R.drawable.family_younger_sister));
//        LinearLayout Rootview =(LinearLayout)findViewById(R.id.rootview);
//        int i=0;
//        while(i<10) {
//        TextView wordview = new TextView(this);
//            wordview.setText(words.get(i));
//            Rootview.addView(wordview);
//            i++;
        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list2);

        listView.setAdapter(adapter);
    }
}
