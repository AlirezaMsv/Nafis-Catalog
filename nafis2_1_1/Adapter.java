package com.example.nafis2_1_1;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.cursoradapter.widget.SimpleCursorAdapter;

import java.util.SimpleTimeZone;

public class Adapter extends SimpleCursorAdapter {
    Activity contex;
    String[] from;
    Cursor c;
    int flags;
    DatabaseAccess db;
    public Adapter(Activity contex, Cursor c, String[] from , int flags) {
        super(contex, R.layout.rowlayout, c, from,null,flags);
        this.contex = contex;
        this.c = c;
        this.from = from;
        this.flags = flags;
    }



    @Override
    public void setViewText(TextView v, String text) {
        super.setViewText(v, text);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        db.getbrandimg(c);
        View v=contex.getLayoutInflater().inflate(R.layout.rowlayout,null);
        ImageView img=v.findViewById(R.id.pics);
        return super.getView(position, convertView, parent);
    }
}
