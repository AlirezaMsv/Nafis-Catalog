package com.example.nafis2_1_1;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class ScrollingActivity extends AppCompatActivity {
    public static String kind;
    public static String brand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public String brandreturn(){
        return brand;
    }
    public String kindreturn(){
        return kind;
    }

    public void brandvoid(View view) {
        kind=null;
        brand=null;
        Intent intent=new Intent(this,Mahsouls.class);
        switch (view.getId()){
            case R.id.amuzesh :
                brand="nafis";
                startActivity(intent);
                break;
            case R.id.aromatic :
                startActivity(intent);
                brand="aromatic";
                break;
            case R.id.blackberry :
                startActivity(intent);
                brand="blackberry";

                break;
            case R.id.ellen :
                startActivity(intent);
                brand="ellen";

                break;
            case R.id.mnd :
                startActivity(intent);

                brand="mnd";
                break;
            case R.id.moralup :
                startActivity(intent);
                brand="moralup";
                break;
            case R.id.superstar:
                startActivity(intent);
                brand="superstar";
                break;
        }
    }

    public void kindvoid(View view) {
        kind=null;
        brand=null;
        Intent intent=new Intent(this,Mahsouls.class);
        switch (view.getId()){
            case R.id.hair :
                startActivity(intent);
                kind="hair";
                break;
            case R.id.kodak :
                startActivity(intent);
                kind="baby";
                break;
            case R.id.body:
                startActivity(intent);
                kind="body";
                break;
            case R.id.arayesh:
                startActivity(intent);
                kind="arayesh";
                break;
        }
    }
}

