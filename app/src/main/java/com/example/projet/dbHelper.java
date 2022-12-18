package com.example.projet;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public  class dbHelper extends SQLiteOpenHelper {
    public static  final String DBNAME="login.db";
    public dbHelper(Context context) {
        super(context,DBNAME, null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
              MyDB.execSQL("create Table categorie (id int primary key , name Text )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB , int i, int i1) {

        MyDB.execSQL("drop Table if exists categorie");

        onCreate(MyDB);
    }



    public boolean insert_cat(int id , String name )
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues =new ContentValues() ;
        contentValues.put("id",id);
        contentValues.put("name",name);

        long result = MyDB.insert("categorie",null,contentValues);
        if (result==-1) return false ;
        else return true ;

    }


    public boolean insert_pro(int reference , String name , String image , int prix , int qte )
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues =new ContentValues() ;
        contentValues.put("reference",reference);
        contentValues.put("name",name);
        contentValues.put("image", image);
        contentValues.put("prix",prix);
        contentValues.put("qte",qte);
        long result = MyDB.insert("produit",null,contentValues);
        if (result==-1) return false ;
        else return true ;

    }

    public boolean insertData(String username ,String password)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        ContentValues contentValues =  new ContentValues() ;
         contentValues.put("username",username);
         contentValues.put("password",password);
         long result = MyDB.insert("users",null,contentValues);
         if(result==-1 ) return false ;
         else
             return true ;
    }

    public boolean checkusername(String username)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from users where username= ?",new String[]{username});
        if (cursor.getCount() > 0 )
            return true ;
        else
            return  false ;

    }

    public boolean checkusernamepassword(String username , String password)
    {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("select * from users where username= ? and password = ? ",new String[]{username,password});
        if (cursor.getCount() > 0 )
            return true ;
        else
            return  false ;

    }
}
