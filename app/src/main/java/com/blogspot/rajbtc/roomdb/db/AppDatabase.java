package com.blogspot.rajbtc.roomdb.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDa();
    private static AppDatabase INSTANCE;
    public static AppDatabase getDBInstance(Context context){
        if(INSTANCE==null){
            INSTANCE= Room.databaseBuilder(context,AppDatabase.class,"DDDD")
                    .allowMainThreadQueries()
                    .build();
        }return INSTANCE;
    }
}
