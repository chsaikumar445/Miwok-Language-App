package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        // creates a arrayList objects
        ArrayList<word> wordsobj =new ArrayList<>();
        wordsobj.add(new word("one", "lutti",R.drawable.number_one));
        wordsobj.add(new word("two", "otiiko",R.drawable.number_two));
        wordsobj.add(new word("three", "tolookosu",R.drawable.number_three));
        wordsobj.add(new word("four", "oyyisa",R.drawable.number_four));
        wordsobj.add(new word("five", "massokka",R.drawable.number_five));
        wordsobj.add(new word("six", "temmokka",R.drawable.number_six));
        wordsobj.add(new word("seven", "kenekaku",R.drawable.number_seven));
        wordsobj.add(new word("eight", "kawinta",R.drawable.number_eight));
        wordsobj.add(new word("nine", "wo’e",R.drawable.number_nine));
        wordsobj.add(new word("ten", "na’aacha",R.drawable.number_ten));

        WordAdapter wordsadapter = new WordAdapter(this,wordsobj,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordsadapter);



    }
}