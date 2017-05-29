package com.akanime.gamepilihangandabergambar;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


public class MenuAct extends Activity {
	// flag for Internet connection status
	Boolean isInternetPresent = false;
	
	Button buttonTentangnet;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_menu);
		Button buttonPlay= (Button) findViewById(R.id.b_play);
		Button buttonEnsi= (Button) findViewById(R.id.b_ensiklopedia);
		Button buttonKeluar= (Button) findViewById(R.id.b_keluar);
		Button buttonTentang= (Button) findViewById(R.id.b_tentang);
		Button buttonPetunjuk= (Button) findViewById(R.id.b_petunjuk);
		
		buttonPlay.setOnClickListener(new View.OnClickListener() {
			     public void onClick(View v) {
			    	 Intent i= new Intent(getApplicationContext(), ActLevel.class);
              		startActivity(i);
			     } 
		});
		buttonEnsi.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActEnsi.class);
		    	 startActivity(i);
		     } 
		});
		buttonTentang.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    		Intent intent = new Intent(getApplicationContext(), ActTentang.class);
		            startActivity(intent); 
		     } 
	});
		buttonPetunjuk.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    		Intent intent = new Intent(getApplicationContext(), ActPetunjuk.class);
		            startActivity(intent); 
		     } 
	});
		buttonKeluar.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	out();
		     } 
	});
		

	}


public void onBackPressed() {
out();
	    }

	public void out(){
		AlertDialog.Builder builder = new AlertDialog.Builder(MenuAct.this);
		builder.setTitle("Exit");
		builder.setMessage("Apakah Anda ingin keluar Aplikasi?")
				.setCancelable(false).setPositiveButton("Yes",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int id) {
								
								
								Intent exit = new Intent(Intent.ACTION_MAIN);
				    		exit.addCategory(Intent.CATEGORY_HOME);
				    			exit.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				    			startActivity(exit);
							}
						}).setNegativeButton("No",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int id) {
								dialog.cancel();
							}
						}).show();

	}

}
