package com.example.emoji;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class imageAdapter extends BaseAdapter {
    private String[] imageNames;
    private int[] imagePhoto;
    private int[] imageNumber;
    private Context context;
    private LayoutInflater layoutInflater;
    private String[] imageDescription;


    public imageAdapter(String[] imageNames, int[] imagePhoto,int[]imageNumber,String[] imageDescription, Context context) {
        this.imageNames = imageNames;
        this.imagePhoto = imagePhoto;
        this.context = context;
        this.imageNumber = imageNumber;
        this.imageDescription = imageDescription;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imagePhoto.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //Change xml to View.
        if(view == null){
            view = layoutInflater.inflate(R.layout.row_item,viewGroup,false);
        }
        TextView name = view.findViewById(R.id.name);
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView number = view.findViewById(R.id.number);




        name.setText(imageNames[i]);
        imageView.setImageResource(imagePhoto[i]);
        number.setText(String.valueOf(imageNumber[i]));
        return view;
    }
}
