package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father","Aanu",R.drawable.family_father));
        words.add(new Word("Mother","Amma",R.drawable.family_mother));
        words.add(new Word("Elder sister","Malgad Bhaini",R.drawable.family_older_sister));
        words.add(new Word("Younger sister","Dhakli Bhaini",R.drawable.family_younger_sister));
        words.add(new Word("Elder brother","Malgad Bhaavu",R.drawable.family_older_brother));
        words.add(new Word("Younger brother","Dhaklo Bhaavu",R.drawable.family_younger_brother));
        words.add(new Word("Son","Pootu",R.drawable.family_son));
        words.add(new Word("Daughter","Dhoova",R.drawable.family_daughter));
        words.add(new Word("Grandfather","Ajja",R.drawable.family_grandfather));
        words.add(new Word("Grandmother","Anama",R.drawable.family_grandmother));

        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}