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

public class ActKategoriDetail extends Activity {

	String get_bundle_id;
			//variable get database sqlite
			Cursor cursor;
			SQLHelperEnsi dbHelper;
			public static ActKategoriDetail act;
			SQLiteDatabase db;
			//end variable db sqlite
			
			int id,gambar;
			String nama,keterangan,propinsi,kategori;
			
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_detail);
		
		 Bundle getI = getIntent().getExtras();
		 get_bundle_id = getI.getString("ext_id");
		 
		 act = this;


	       db = (new SQLHelperEnsi(this)).getWritableDatabase();
	       cursor = db.rawQuery("SELECT * FROM ensiklopedia where id='"+get_bundle_id+"'  ",null);
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
	       
	       TextView txt_nama= (TextView) findViewById(R.id.text_nama_ensiklopedia);
	       TextView txt_ket= (TextView) findViewById(R.id.text_detail_ensiklopedia);
	       TextView txt_kat= (TextView) findViewById(R.id.text_kategori_detail);
	       ImageView img_gambar= (ImageView) findViewById(R.id.image_ensiklopedia);
	     
	       txt_nama.setText(""+nama);
	       txt_kat.setText(""+kategori);
	       txt_ket.setText(""+keterangan);

	       img_gambar.setImageResource(gambar);
	       
	       
	       //link back atas
	       Button btn_kembali= (Button) findViewById(R.id.btn_back);
			
	       btn_kembali.setOnClickListener(new View.OnClickListener() {
				     public void onClick(View v) {
				    	finish();
				     } 
			});
	       //end link back atas
		 
	}

	

}
