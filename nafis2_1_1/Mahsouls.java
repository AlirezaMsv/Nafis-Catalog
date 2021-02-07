package com.example.nafis2_1_1;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class Mahsouls extends AppCompatActivity {
    ListView lstmain;
    String[] from={DatabaseAccess.field_mahsoulname,DatabaseAccess.field_price};
    int[] to={R.id.txtname,R.id.txtprice};
    SimpleCursorAdapter adapter;
    DatabaseAccess db;
    Cursor c;
    String brand;
    String kind;
    @Override
    public void onBackPressed() {
        Intent i21=new Intent(this,ScrollingActivity.class);
        startActivity(i21);
//        c=null;
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahsouls);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lstmain=findViewById(R.id.lstmain);
        db=DatabaseAccess.getInstance(this);
        brand=ScrollingActivity.brand;
        kind=ScrollingActivity.kind;
        if(brand!=null){
//            Toast.makeText(this, brand, Toast.LENGTH_SHORT).show();
            loaadatabrand();
        }
        if(kind!=null){
//            Toast.makeText(this, kind, Toast.LENGTH_SHORT).show();
            loaadatakind();
        }


    }
    private void loaadatabrand() {
        db = new DatabaseAccess(this);
        c = db.getbrand(brand);
        adapter = new SimpleCursorAdapter(this,R.layout.rowlayout,c,from,to,0);
        lstmain.setAdapter(adapter);
    }
    private void loaadatakind() {
        db = new DatabaseAccess(this);
        c = db.getkind(kind);
        adapter = new SimpleCursorAdapter(this,R.layout.rowlayout,c,from,to,0);
        lstmain.setAdapter(adapter);
//        Toast.makeText(this, c.getCount()+"", Toast.LENGTH_SHORT).show();

    }


}
