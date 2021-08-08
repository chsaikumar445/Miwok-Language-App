package com.example.miwok;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word>{

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<word> words, int ColorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = ColorResourceId;
    }

    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemview =  convertView;
        if(listitemview == null){
            listitemview = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        word currentAndroidFlavor = getItem(position);

        ImageView image =listitemview.findViewById(R.id.images);
        if(currentAndroidFlavor.hasimage()) {
            image.setImageResource(currentAndroidFlavor.getImageResourceId());
        }
        else {
            image.setVisibility(View.GONE);
        }

        TextView miwokview =listitemview.findViewById(R.id.miwok_word);
        miwokview.setText(currentAndroidFlavor.getMiwokword());

        TextView englishview =listitemview.findViewById(R.id.english_word);
        englishview.setText(currentAndroidFlavor.getEnglishword());

        View text_container = listitemview.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);

        text_container.setBackgroundColor(color);

        return  listitemview;
    }
}
