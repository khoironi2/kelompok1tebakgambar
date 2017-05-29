package com.akanime.gamepilihangandabergambar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class ActSoal  extends Activity {
 String j_id,j_soal,j_a,j_b,j_jawaban;
 CheckBox jwbA,jwbB ; Button buttonjawab;
	public String kode;
	private static final String AR_ID = "id";
	JSONArray ambiljson = null;
	int page, nilai, nomorsoal;
	String rekap,hasil;

Boolean isInternetPresent = false;
	
	 Cursor cursor;
		SQLHelperKuis dbHelper;
		public static ActSoal ma;
		 SQLiteDatabase db;
		
		 String get_level_string,get_no_soal;
		 int get_db_id,get_db_gambar;
		 String get_db_level,get_db_nosoal,get_db_soal,get_db_jawaban,get_db_a,get_db_b,get_db_c,get_db_d,get_db_ensi;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_game);
        
        ma = this;

    	Bundle getI = getIntent().getExtras();
        get_level_string = getI.getString("level").toString();
        get_no_soal = getI.getString("no_soal").toString();
        
        db = (new SQLHelperKuis(this)).getWritableDatabase();
        cursor = db.rawQuery("SELECT * FROM kuis where level='"+ get_level_string.toString() +"' and nosoal='"+ get_no_soal.toString() +"'",null);

        cursor.moveToFirst();
        
        if (cursor.getCount()>0)
        {
        	//cursor.moveToPosition(0);
        	get_db_id = cursor.getInt(0);
        	get_db_level =  cursor.getString(1).toString();
        	get_db_nosoal =  cursor.getString(2).toString();
        	get_db_gambar= cursor.getInt(3);
        	get_db_soal =  cursor.getString(4).toString();
        	get_db_jawaban =  cursor.getString(5).toString();
        	get_db_a =  cursor.getString(6).toString();
        	get_db_b =  cursor.getString(7).toString();
        	get_db_c =  cursor.getString(8).toString();
        	get_db_d =  cursor.getString(9).toString();
        	get_db_ensi =  cursor.getString(10).toString();
			
		       
		}
     
        //variable textview image dan button
        	TextView txt_level= (TextView) findViewById(R.id.text_lvl);
	       TextView txt_soal= (TextView) findViewById(R.id.text_soal);
	       ImageView gbr_soal= (ImageView) findViewById(R.id.image_soal);
	       Button btn_j_a= (Button) findViewById(R.id.button_a);
	       Button btn_j_b= (Button) findViewById(R.id.button_b);
	       Button btn_j_c= (Button) findViewById(R.id.button_c);
	       Button btn_j_d= (Button) findViewById(R.id.button_d);
	       
	       
	       txt_level.setText("Level : "+get_level_string.toString() + " - Soal no : " + get_no_soal.toString());
	       txt_soal.setText(""+get_db_soal);
	       gbr_soal.setImageResource(get_db_gambar);
	       btn_j_a.setText(""+get_db_a);
	       btn_j_b.setText(""+get_db_b);
	       btn_j_c.setText(""+get_db_c);
	       btn_j_d.setText(""+get_db_d);
	       
	       
	       btn_j_a.setOnClickListener(new View.OnClickListener() {
			     public void onClick(View v) {
			    	
			    	 if (get_db_jawaban.equals("a")){
			    		Intent i= new Intent(getApplicationContext(), ActHasil.class);
						i.putExtra("level",get_level_string.toString());
						i.putExtra("nosoal",get_no_soal.toString());
						i.putExtra("ensi",get_db_ensi.toString());
						i.putExtra("hasil","benar");
						startActivity(i);
			    	}
			    	else{
			    		Intent i= new Intent(getApplicationContext(), ActHasilSalah.class);
			    		Bundle b = new Bundle();
		       			b.putInt("gambar", get_db_gambar);
		       			i.putExtras(b);
						i.putExtra("level",get_level_string.toString());
						i.putExtra("nosoal",get_no_soal.toString());
						i.putExtra("soal",get_db_soal.toString());
						i.putExtra("hasil","salah");
						startActivity(i);
			    	}
			    	
			     } 
	       });
	       btn_j_b.setOnClickListener(new View.OnClickListener() {
			     public void onClick(View v) {
			    	if (get_db_jawaban.equals("b")){
			    		Intent i= new Intent(getApplicationContext(), ActHasil.class);
						i.putExtra("level",get_level_string.toString());
						i.putExtra("nosoal",get_no_soal.toString());
						i.putExtra("ensi",get_db_ensi.toString());
						i.putExtra("hasil","benar");
						startActivity(i);
			    	}
			    	else{
			    		Intent i= new Intent(getApplicationContext(), ActHasilSalah.class);
			    		Bundle b = new Bundle();
		       			b.putInt("gambar", get_db_gambar);
		       			i.putExtras(b);
						i.putExtra("level",get_level_string.toString());
						i.putExtra("nosoal",get_no_soal.toString());
						i.putExtra("soal",get_db_soal.toString());
						i.putExtra("hasil","salah");
						startActivity(i);
			    	}
			     } 
	       });
	       btn_j_c.setOnClickListener(new View.OnClickListener() {
			     public void onClick(View v) {
			    	if (get_db_jawaban.equals("c")){
			    		Intent i= new Intent(getApplicationContext(), ActHasil.class);
						i.putExtra("level",get_level_string.toString());
						i.putExtra("nosoal",get_no_soal.toString());
						i.putExtra("ensi",get_db_ensi.toString());
						i.putExtra("hasil","benar");
						startActivity(i);
			    	}
			    	else{
			    		Intent i= new Intent(getApplicationContext(), ActHasilSalah.class);
			    		Bundle b = new Bundle();
		       			b.putInt("gambar", get_db_gambar);
		       			i.putExtras(b);
						i.putExtra("level",get_level_string.toString());
						i.putExtra("nosoal",get_no_soal.toString());
						i.putExtra("soal",get_db_soal.toString());
						i.putExtra("hasil","salah");
						startActivity(i);
			    	}
			     } 
	       });
	       btn_j_d.setOnClickListener(new View.OnClickListener() {
			     public void onClick(View v) {
			    	if (get_db_jawaban.equals("d")){
			    		Intent i= new Intent(getApplicationContext(), ActHasil.class);
						i.putExtra("level",get_level_string.toString());
						i.putExtra("nosoal",get_no_soal.toString());
						i.putExtra("ensi",get_db_ensi.toString());
						i.putExtra("hasil","benar");
						startActivity(i);
			    	}
			    	else{
			    		Intent i= new Intent(getApplicationContext(), ActHasilSalah.class);
			    		Bundle b = new Bundle();
		       			b.putInt("gambar", get_db_gambar);
		       			i.putExtras(b);
						i.putExtra("level",get_level_string.toString());
						i.putExtra("nosoal",get_no_soal.toString());
						i.putExtra("soal",get_db_soal.toString());
						i.putExtra("hasil","salah");
						startActivity(i);
			    	}
			     } 
	       });
        
   }

       

}
