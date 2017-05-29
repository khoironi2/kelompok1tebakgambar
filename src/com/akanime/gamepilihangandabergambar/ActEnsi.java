package com.akanime.gamepilihangandabergambar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ActEnsi extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_ensi);
		 //back menu
        Button btnback= (Button) findViewById(R.id.btn_back);
        
        btnback.setOnClickListener(new View.OnClickListener() {
   		 
            public void onClick(View v) {
            	Intent intent = new Intent(getApplicationContext(), MenuAct.class);
     			startActivity(intent);
            }
        });
        // end back menu
		Button buttonRA= (Button) findViewById(R.id.b_ensi_ra);
		Button buttonPA= (Button) findViewById(R.id.b_ensi_pa);
		Button buttonST= (Button) findViewById(R.id.b_ensi_st);
		
		buttonRA.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActKategoriRumahAdat.class);
         		startActivity(i);
		     } 
		});
		buttonPA.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActKategoriPakaianAdat.class);
        		startActivity(i);
		     } 
		});
		buttonST.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActKategoriSenjataTradisional.class);
        		startActivity(i);
		     } 
		});
	}

	

}
