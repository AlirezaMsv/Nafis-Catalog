package com.example.nafis2_1_1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseOpenHelper extends SQLiteAssetHelper {
    private static  final String dbname="dbfinal1.db";
    private static final int dbversion=1;


    public DatabaseOpenHelper(Context context) {
        super(context, dbname,null,dbversion);
    }
}
