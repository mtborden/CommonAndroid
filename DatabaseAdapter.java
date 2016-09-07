package com.example.cabinolympics;

import java.util.ArrayList;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * This class is the basic implementation of what is needed to create a database and its tables on Android.
 * Implement methods for adding/searching/deleting data as needed
*/

public class DatabaseAdapter extends SQLiteAssetHelper
{
    //enter name of database here
	public static final String MYDATABASE_NAME;
	public static final int MYDATABASE_VERSION = 1;
	
	//list tables to be included in database here
	
	//write SQL scripts as strings to create tables here

    private SQLiteDatabase sqLiteDatabase;

    private Context context;

    public DatabaseAdapter(Context c)
    {
        super(c, MYDATABASE_NAME, null, MYDATABASE_VERSION);
        context = c;
    }
	
	@Override
	public void onCreate(SQLiteDatabase db)
	{
		//use db.execsql(<SCRIPT NAME>) to create tables
	}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }

    public boolean open()
    {
        sqLiteDatabase = this.getWritableDatabase();
        return (sqLiteDatabase != null)
    }

    @Override
    public void close()
    {
        if (sqLiteDatabase != null)
        {
            sqLiteDatabase.close();
        }
    }
	
	//add methods here to add/delete/modify/search data in the database
}
