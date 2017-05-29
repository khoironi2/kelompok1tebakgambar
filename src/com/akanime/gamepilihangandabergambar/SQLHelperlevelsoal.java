package com.akanime.gamepilihangandabergambar;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class SQLHelperlevelsoal extends SQLiteOpenHelper{

	private static final String DATABASE_NAME = "akanime_game_kebudayaan1_levelsoal00112-3.db";
	private static final int DATABASE_VERSION = 1;

	public SQLHelperlevelsoal(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
				
		
		
		String level_soal = "create table " +
				"level_soal" +
				"( id int primary key, " +
				"level text null," +
				"no text null," +
				"status text null);";
		Log.d("Data", "onCreate: " + level_soal);
		db.execSQL(level_soal);
	
		ContentValues valueslevel = new ContentValues();
		
		// atur level
		valueslevel.put("id", "1001");
		valueslevel.put("level", "1");
		valueslevel.put("no", "1");
		valueslevel.put("status", "1");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "1002");
		valueslevel.put("level", "1");
		valueslevel.put("no", "2");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "1003");
		valueslevel.put("level", "1");
		valueslevel.put("no", "3");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "1004");
		valueslevel.put("level", "1");
		valueslevel.put("no", "4");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "1005");
		valueslevel.put("level", "1");
		valueslevel.put("no", "5");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "1006");
		valueslevel.put("level", "1");
		valueslevel.put("no", "6");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "1007");
		valueslevel.put("level", "1");
		valueslevel.put("no", "7");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "1008");
		valueslevel.put("level", "1");
		valueslevel.put("no", "8");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "1009");
		valueslevel.put("level", "1");
		valueslevel.put("no", "9");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "1010");
		valueslevel.put("level", "1");
		valueslevel.put("no", "10");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		

		
		// end atur level 1
		
		// atur level 2
		valueslevel.put("id", "2001");
		valueslevel.put("level", "2");
		valueslevel.put("no", "1");
		valueslevel.put("status", "1");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "2002");
		valueslevel.put("level", "2");
		valueslevel.put("no", "2");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "2003");
		valueslevel.put("level", "2");
		valueslevel.put("no", "3");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "2004");
		valueslevel.put("level", "2");
		valueslevel.put("no", "4");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "2005");
		valueslevel.put("level", "2");
		valueslevel.put("no", "5");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "2006");
		valueslevel.put("level", "2");
		valueslevel.put("no", "6");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "2007");
		valueslevel.put("level", "2");
		valueslevel.put("no", "7");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "2008");
		valueslevel.put("level", "2");
		valueslevel.put("no", "8");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "2009");
		valueslevel.put("level", "2");
		valueslevel.put("no", "9");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "2010");
		valueslevel.put("level", "2");
		valueslevel.put("no", "10");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		//end atur level 2
		
		//atur level 3
		valueslevel.put("id", "3001");
		valueslevel.put("level", "3");
		valueslevel.put("no", "1");
		valueslevel.put("status", "1");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "3002");
		valueslevel.put("level", "3");
		valueslevel.put("no", "2");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "3003");
		valueslevel.put("level", "3");
		valueslevel.put("no", "3");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "3004");
		valueslevel.put("level", "3");
		valueslevel.put("no", "4");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "3005");
		valueslevel.put("level", "3");
		valueslevel.put("no", "5");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "3006");
		valueslevel.put("level", "3");
		valueslevel.put("no", "6");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "3007");
		valueslevel.put("level", "3");
		valueslevel.put("no", "7");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "3008");
		valueslevel.put("level", "3");
		valueslevel.put("no", "8");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "3009");
		valueslevel.put("level", "3");
		valueslevel.put("no", "9");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "3010");
		valueslevel.put("level", "3");
		valueslevel.put("no", "10");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		//end atur level 3
		
		//atur level4
		valueslevel.put("id", "4001");
		valueslevel.put("level", "4");
		valueslevel.put("no", "1");
		valueslevel.put("status", "1");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "4002");
		valueslevel.put("level", "4");
		valueslevel.put("no", "2");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "4003");
		valueslevel.put("level", "4");
		valueslevel.put("no", "3");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "4004");
		valueslevel.put("level", "4");
		valueslevel.put("no", "4");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "4005");
		valueslevel.put("level", "4");
		valueslevel.put("no", "5");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "4006");
		valueslevel.put("level", "4");
		valueslevel.put("no", "6");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "4007");
		valueslevel.put("level", "4");
		valueslevel.put("no", "7");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "4008");
		valueslevel.put("level", "4");
		valueslevel.put("no", "8");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "4009");
		valueslevel.put("level", "4");
		valueslevel.put("no", "9");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "4010");
		valueslevel.put("level", "4");
		valueslevel.put("no", "10");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		//end atur level4
		
		//atur level 5
		valueslevel.put("id", "5001");
		valueslevel.put("level", "5");
		valueslevel.put("no", "1");
		valueslevel.put("status", "1");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "5002");
		valueslevel.put("level", "5");
		valueslevel.put("no", "2");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "5003");
		valueslevel.put("level", "5");
		valueslevel.put("no", "3");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "5004");
		valueslevel.put("level", "5");
		valueslevel.put("no", "4");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "5005");
		valueslevel.put("level", "5");
		valueslevel.put("no", "5");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "5006");
		valueslevel.put("level", "5");
		valueslevel.put("no", "6");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "5007");
		valueslevel.put("level", "5");
		valueslevel.put("no", "7");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "5008");
		valueslevel.put("level", "5");
		valueslevel.put("no", "8");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "5009");
		valueslevel.put("level", "5");
		valueslevel.put("no", "9");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		
		valueslevel.put("id", "5010");
		valueslevel.put("level", "5");
		valueslevel.put("no", "10");
		valueslevel.put("status", "0");
		db.insert("level_soal", "id", valueslevel);
		//end atur level5
		
	
		
	
		
		
	}

	@Override

	public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
		
		

	}

}
