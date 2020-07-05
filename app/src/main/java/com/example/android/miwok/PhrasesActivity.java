package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("What is your name?","Tugel naav kasane?"));
        words.add(new Word("My name is...","Migel naava..."));
        words.add(new Word("Where are you going?","Khainka Bhayr sarlo?"));
        words.add(new Word("Are you coming?","Ettas ve?"));
        words.add(new Word("Yes, I am coming.","Vai, Haav ettasa."));
        words.add(new Word("I'm coming.","Haav ettasa."));
        words.add(new Word("Let's go.","Yo vacha."));
        words.add(new Word("Come here.","Yo hanga."));
        words.add(new Word("What are you doing?","Kasan kartasa?"));

        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}