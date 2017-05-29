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

public class ActHasil extends Activity {

	String get_bundle_id;
			//variable get database sqlite
			Cursor cursor;
			SQLHelperEnsi dbHelper;
			public static ActHasil act;
			SQLiteDatabase db;
			
			Cursor cursor2;
			SQLHelperlevelsoal dbHelper2;
			public static ActHasil act2;
			 SQLiteDatabase db2;
			 

			 Cursor cursor3;
				SQLHelperLevel dbHelper3;
				public static ActHasil ma3;
				 SQLiteDatabase db3;
				 
			//end variable db sqlite
				 int newlevel;int newsoal;
			ImageView img_gambar;
			 Button btnnext;
			TextView txt_kat,txt_nama,txt_ket,txt_keterangan;
			int id,gambar;
			String nama,keterangan,propinsi,kategori;
			String get_intent_level,get_intent_nosoal,get_intent_hasil,get_intent_ensi;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_hasil_benar);
		

	       txt_nama= (TextView) findViewById(R.id.text_nama_ensiklopedia);
	       txt_ket= (TextView) findViewById(R.id.text_detail_ensiklopedia);
	       txt_kat= (TextView) findViewById(R.id.text_kategori_detail);
	       txt_keterangan= (TextView) findViewById(R.id.TextView01);
	       img_gambar= (ImageView) findViewById(R.id.image_ensiklopedia);
	       btnnext= (Button) findViewById(R.id.button_selanjutnya);
	       
		 Bundle getI = getIntent().getExtras();
		 get_intent_level = getI.getString("level").toString();
		 get_intent_nosoal = getI.getString("nosoal").toString();
		 get_intent_hasil = getI.getString("hasil").toString();
		 get_intent_ensi = getI.getString("ensi").toString();
		 
		 act = this; 

		 if (get_intent_hasil.equals("benar")){
	       db = (new SQLHelperEnsi(ActHasil.this)).getWritableDatabase();
	       cursor = db.rawQuery("SELECT * FROM ensiklopedia where id="+get_intent_ensi.toString()+"  ",null);
	       cursor.moveToFirst();
	       if (cursor.getCount()>0)
	       {
	       //cursor.moveToPosition(0);
				id = cursor.getInt(0);
				gambar = cursor.getInt(1);
				nama =  cursor.getString(2).toString(); 
				keterangan =  cursor.getString(3).toString();  
				propinsi =  cursor.getString(4).toString(); 
				kategori =  cursor.getString(5).toString();  
			}
	       
	     
	       txt_nama.setText("JAWABAN ANDA BENAR");
	       txt_kat.setText(""+kategori);
	       txt_ket.setText(""+keterangan);

	       img_gambar.setImageResource(gambar);
	       
	       
	       //back menu
	        Button btnback= (Button) findViewById(R.id.btn_back);
	        
	        btnback.setOnClickListener(new View.OnClickListener() {
	   		 
	            public void onClick(View v) {
	            	Intent intent = new Intent(getApplicationContext(), ActLevel.class);
	     			startActivity(intent);
	            }
	        });
	        
	        
	        
	        newsoal=Integer.parseInt(get_intent_nosoal)+1;
	        db2 = (new SQLHelperlevelsoal(ActHasil.this)).getWritableDatabase();
		    db2.execSQL("update level_soal  set status='1' where level='"+get_intent_level.toString()+"' and no='"+newsoal+"' ");
			
		    if (get_intent_nosoal.equals("10")){
		    	
			        newlevel=Integer.parseInt(get_intent_level)+1;
			        
			        if (newlevel==6 || newlevel>5 ){
			        	
			        }
			        else{
			        db3 = (new SQLHelperLevel(ActHasil.this)).getWritableDatabase();
				    db3.execSQL("update level_user  set status='1' where level='"+newlevel+"'");
			        }
			        
			        //back menuselanjutnya
			    
			        btnnext.setOnClickListener(new View.OnClickListener() {
			            public void onClick(View v) {
			            	Intent i= new Intent(getApplicationContext(), ActSoal.class);
				    	 	i.putExtra("level",String.valueOf(newlevel));
				    	 	i.putExtra("no_soal","1");
		         			startActivity(i);
			            }
			        });
						
		    }
		    else{
		    	 btnnext.setOnClickListener(new View.OnClickListener() {
			            public void onClick(View v) {
			            	Intent i= new Intent(getApplicationContext(), ActSoal.class);
				    	 	i.putExtra("level",get_intent_level);
				    	 	i.putExtra("no_soal",String.valueOf(newsoal));
		         			startActivity(i);
			            }
			        });
		    }
		   
		
		   
		 }
		 //end if jika benar
		 
		 
	
		 
	}


public void onBackPressed() {
	Intent intent = new Intent(getApplicationContext(), ActLevel.class);
		startActivity(intent);
}

}
