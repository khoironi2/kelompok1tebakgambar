package com.akanime.gamepilihangandabergambar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ActSoal2 extends Activity {


	 String get_level_string,get_no_soal;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_petunjuk);
		/*
		 
		link back atas
	       Button btn_kembali= (Button) findViewById(R.id.btn_back);
			
	       btn_kembali.setOnClickListener(new View.OnClickListener() {
				     public void onClick(View v) {
				    	finish();
				     } 
			});
	       //end link back atas
	       
	       */
			Bundle getI = getIntent().getExtras();
	        get_level_string = getI.getString("level").toString();
	        get_no_soal = getI.getString("no_soal").toString();
	        
	}

	

}
