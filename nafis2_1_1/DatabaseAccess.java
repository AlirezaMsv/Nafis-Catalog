package com.example.nafis2_1_1;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

//c=db.rawQuery("select * from "+table_name + " where "+
//        field_brand +" like "+"'"+brand+"%'",null);


public class DatabaseAccess {
    String table_name="mahsouls";
    static String field_id="_id";
    static String field_mahsoulname="mahsoulname";
    static String field_par="par";
    static String field_bishtar="bishtar";
    static String field_mavared="mavared";
    static String field_ravesh="ravesh";
    static String field_moarefi="moarefi";
    static String field_price="price";
    static String field_brand="brand";
    static String field_kind="kind";
    static String field_picid="picid";
    static Context context;
    SQLiteDatabase db;
    Cursor c,c2;
    Mahsouls m = new Mahsouls();
    String brand=m.brand;
    String kind=m.kind;
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;
    public DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
        this.context=context;

    }

    public static DatabaseAccess getInstance
            (Context context) {

        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }


    public Cursor getbrand(String brand) {
        try {
            this.db = openHelper.getWritableDatabase();
            c=db.rawQuery("select * from "+table_name + " where "+
                    field_brand +" like "+"'"+brand+"%'",null);
        }
        catch (Exception ex){
            Toast.makeText(context, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
//        this.database = openHelper.getWritableDatabase();
//        c = database.rawQuery("SELECT * FROM mahsouls where brand= "+brand, null);
        return c;
    }
    public Cursor getkind(String kind) {
        try {
            this.db = openHelper.getWritableDatabase();
            c=db.rawQuery("select * from "+table_name + " where "+
                    field_kind +" like "+"'"+kind+"%'",null);
        }
        catch (Exception ex){
            Toast.makeText(context, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
//        this.database = openHelper.getWritableDatabase();
//        c = database.rawQuery("SELECT * FROM mahsouls where kind= "+kind, null);
        return c;
    }

//    public  Cursor setimage (){
//        try {
//            this.db = openHelper.getWritableDatabase();
//            c2=db.rawQuery("select _id from mahsouls",null);
//
//        }
//        catch (Exception ex){
//            Toast.makeText(context, ex.getMessage(), Toast.LENGTH_SHORT).show();
//        }
//        return c2;
//    }


    public Cursor getbrandimg(Cursor c) {
        try {
            this.db = openHelper.getWritableDatabase();
            c2=db.rawQuery("select picid from "+table_name ,null);
        }
        catch (Exception ex){
            Toast.makeText(context, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return c2;
    }

}

//c=db.rawQuery("select * from "+table_name + " where "+
//        field_brand +" like "+"'"+brand+"%'",null);