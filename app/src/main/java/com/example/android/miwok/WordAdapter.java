package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    int mColorID;
    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects, int colorID) {
        super(context, 0, objects);
        mColorID=colorID;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        final Word currentAndroidFlavor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.list_item_1);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentAndroidFlavor.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.list_item_2);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentAndroidFlavor.getDefaultTranslation());

        ImageView iconImageView = (ImageView) listItemView.findViewById(R.id.list_image);
        if (currentAndroidFlavor.getImageID() == -1)
            iconImageView.setVisibility(View.GONE);
        else {
            iconImageView.setVisibility(View.VISIBLE);
            iconImageView.setImageResource(currentAndroidFlavor.getImageID());
        }
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorID);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
// Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

        if(currentAndroidFlavor.getSoundID() == -1)
            ((ImageView)listItemView.findViewById(R.id.play_button)).setVisibility(View.GONE);
        else
            ((ImageView)listItemView.findViewById(R.id.play_button)).setVisibility(View.VISIBLE);

        return listItemView;
    }
}
