package com.akanime.gamepilihangandabergambar;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActHasilSalah extends Activity {

			ImageView img_gambar;
			TextView txt_soal;
			int id,get_gambar;
			String soal;
			String get_intent_soal,get_gambar_string;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_hasil_salah);
		

	       txt_soal= (TextView) findViewById(R.id.textView_soal_hasil_salah);
	       img_gambar= (ImageView) findViewById(R.id.image_hasil_salah);
	       
	       
		 Bundle getI = getIntent().getExtras();
		 get_intent_soal = getI.getString("soal").toString();
		 get_gambar= getI.getInt("gambar");
		// get_gambar_string = getI.getString("gambar").toString();
		 
	//	get_gambar=Integer.parseInt(get_gambar_string);
	     
	       txt_soal.setText(" "+get_intent_soal.toString() +"\n");

	       img_gambar.setImageResource(get_gambar);
	       
	       
	       //back menu
	        Button btnback= (Button) findViewById(R.id.btn_back);
	        
	        btnback.setOnClickListener(new View.OnClickListener() {
	   		 
	            public void onClick(View v) {
	            	Intent intent = new Intent(getApplicationContext(), ActLevel.class);
	     			startActivity(intent);
	            }
	        });
	        
	      //back menukembali
	        Button btnback2= (Button) findViewById(R.id.button_kembali);
	        
	        btnback2.setOnClickListener(new View.OnClickListener() {
	   		 
	            public void onClick(View v) {
	            	Intent intent = new Intent(getApplicationContext(), ActLevel.class);
	     			startActivity(intent);
	            }
	        });
	        
	        
	  
		 
	
		 
	}

	public void onBackPressed() {
		Intent intent = new Intent(getApplicationContext(), ActLevel.class);
			startActivity(intent);
	}


}
