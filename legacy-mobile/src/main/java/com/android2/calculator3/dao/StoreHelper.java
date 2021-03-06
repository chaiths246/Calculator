package com.android2.calculator3.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class StoreHelper extends SQLiteOpenHelper {

    public static final String TABLE_THEMES = "themes";
    public static final String TABLE_EXTENSIONS = "extensions";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PACKAGE = "package";
    public static final String COLUMN_PRICE = "price";
    public static final String COLUMN_IMAGE_URL = "image_url";
    // Database creation sql statement
    protected static final String DATABASE_CREATE_THEMES = "create table " + TABLE_THEMES + "(" + COLUMN_ID + " integer primary key autoincrement, " + COLUMN_NAME + " text, " + COLUMN_PACKAGE + " text, " + COLUMN_PRICE + " float(10), " + COLUMN_IMAGE_URL + " text" + ");";
    protected static final String DATABASE_CREATE_EXTENSION = "create table " + TABLE_EXTENSIONS + "(" + COLUMN_ID + " integer primary key autoincrement, " + COLUMN_NAME + " text, " + COLUMN_PACKAGE + " text, " + COLUMN_PRICE + " float(10), " + COLUMN_IMAGE_URL + " text" + ");";
    protected static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "apps.db";

    public StoreHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE_THEMES);
        database.execSQL(DATABASE_CREATE_EXTENSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
    }
}
