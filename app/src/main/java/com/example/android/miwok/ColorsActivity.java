package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red","Tambdo",R.drawable.color_red));
        words.add(new Word("Green","Pachve",R.drawable.color_green));
        words.add(new Word("Black","KaaLe",R.drawable.color_black));
        words.add(new Word("Yellow","Halduve",R.drawable.color_mustard_yellow));
        words.add(new Word("Blue","NeeLo",R.drawable.color_dusty_yellow));
        words.add(new Word("White","Dhavve",R.drawable.color_white));
        words.add(new Word("Grey","Gobbra baNNu",R.drawable.color_gray));
        words.add(new Word("Violet","JambLi",R.drawable.color_brown));

        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}