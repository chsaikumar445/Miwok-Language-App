package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // creates a arrayList objects
        ArrayList<word> words =new ArrayList<>();
        words.add(new word("red", "weṭeṭṭi", R.drawable.color_red));
        words.add(new word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));
        words.add(new word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        words.add(new word("green", "chokokki", R.drawable.color_green));
        words.add(new word("brown", "ṭakaakki", R.drawable.color_brown));
        words.add(new word("gray", "ṭopoppi", R.drawable.color_gray));
        words.add(new word("black", "kululli", R.drawable.color_black));
        words.add(new word("white", "kelelli", R.drawable.color_white));

        WordAdapter wordsadapter = new WordAdapter(this,words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordsadapter);



    }
}