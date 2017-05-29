package com.akanime.gamepilihangandabergambar;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class SQLHelperLevel extends SQLiteOpenHelper{

	private static final String DATABASE_NAME = "akanime_game_kebudayaan1_level00112-3.db";
	private static final int DATABASE_VERSION = 1;

	public SQLHelperLevel(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
				
		
		
		String level_user = "create table " +
				"level_user" +
				"( id int primary key, " +
				"level text null," +
				"status text null);";
		Log.d("Data", "onCreate: " + level_user);
		db.execSQL(level_user);
	
		ContentValues valueslevel = new ContentValues();
		
		// atur level
		valueslevel.put("id", "1");
		valueslevel.put("level", "1");
		valueslevel.put("status", "1");
		db.insert("level_user", "id", valueslevel);
		

		valueslevel.put("id", "2");
		valueslevel.put("level", "2");
		valueslevel.put("status", "0");
		db.insert("level_user", "id", valueslevel);
		

		valueslevel.put("id", "3");
		valueslevel.put("level", "3");
		valueslevel.put("status", "0");
		db.insert("level_user", "id", valueslevel);
		
		valueslevel.put("id", "4");
		valueslevel.put("level", "4");
		valueslevel.put("status", "0");
		db.insert("level_user", "id", valueslevel);
		
		valueslevel.put("id", "5");
		valueslevel.put("level", "5");
		valueslevel.put("status", "0");
		db.insert("level_user", "id", valueslevel);
		// end atur level
		
	
		
	
		
		
	}

	@Override

	public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
		
		

	}

}
