package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // creates a arrayList objects
        ArrayList<word> words =new ArrayList<>();

        words.add(new word("Where are you going?", "minto wuksus"));
        words.add(new word("What is your name?", "tinnә oyaase'nә"));
        words.add(new word("My name is...", "oyaaset..."));
        words.add(new word("How are you feeling?", "michәksәs?"));
        words.add(new word("I’m feeling good.", "kuchi achit"));
        words.add(new word("Are you coming?", "әәnәs'aa?"));
        words.add(new word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new word("I’m coming.", "әәnәm"));
        words.add(new word("Let’s go.", "yoowutis"));
        words.add(new word("Come here.", "әnni'nem"));

        WordAdapter wordsadapter = new WordAdapter(this,words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordsadapter);



    }
}