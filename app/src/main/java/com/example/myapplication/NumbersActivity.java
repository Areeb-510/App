package com.example.myapplication;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.widget.AdapterView;
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
import android.widget.Toast;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

     final ArrayList<Words> words= new ArrayList<Words>();
     words.add(new Words("one","lutti",R.drawable.number_one,R.raw.number_one));
     words.add(new Words("two","ottiko",R.drawable.number_two,R.raw.number_two));
     words.add(new Words("three","tolookosu",R.drawable.number_three,R.raw.number_three));
        words.add(new Words("four","oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add(new Words("five","massokka",R.drawable.number_five,R.raw.number_five));
        words.add(new Words("six","temokka",R.drawable.number_six,R.raw.number_six));
        words.add(new Words("seven","kenekaku",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Words("eight","kawinta",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Words("nine","wo'e",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Words("ten","na'aacha",R.drawable.number_ten,R.raw.number_ten));
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
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Words word = words.get(position);
                mediaplayer = MediaPlayer.create(getApplicationContext(), word.getaudioID());
                mediaplayer.start();
                mediaplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    ;

                    @Override
                    public void onCompletion(MediaPlayer mediaplayer) {
                        Toast.makeText(NumbersActivity.this, "Finished", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        }
    }

