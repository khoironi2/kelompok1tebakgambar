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
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.Drawable;


public class ActLevel extends Activity {
	// flag for Internet connection status
	Boolean isInternetPresent = false;
	
	Button buttoninet;
	 Cursor cursor;
		SQLHelperLevel dbHelper;
		public static ActLevel ma;
		 SQLiteDatabase db;
		 
		 String get_level1, get_status1;
		 String get_level2, get_status2;
		 String get_level3, get_status3;
		 String get_level4, get_status4;
		 String get_level5, get_status5;
		 
		 Button buttonL1, buttonL2, buttonL3,buttonL4,buttonL5;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.level);
      // AdView adView = (AdView)this.findViewById(R.id.adView);
    //   adView.loadAd(new AdRequest());
		 //back menu
        Button btnback= (Button) findViewById(R.id.btn_back);
        
        btnback.setOnClickListener(new View.OnClickListener() {
   		 
            public void onClick(View v) {
            	Intent intent = new Intent(getApplicationContext(), MenuAct.class);
     			startActivity(intent);
            }
        });
        // end back menu
       ma = this;


		buttonL1= (Button) findViewById(R.id.b_level1);
		buttonL2= (Button) findViewById(R.id.b_level2);
		buttonL3= (Button) findViewById(R.id.b_level3);
		buttonL4= (Button) findViewById(R.id.b_level4);
		buttonL5= (Button) findViewById(R.id.b_level5);

       db = (new SQLHelperLevel(this)).getWritableDatabase();
       cursor = db.rawQuery("SELECT * FROM level_user where level='1' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level1 = cursor.getString(1).toString();
			get_status1 =  cursor.getString(2).toString();    
		}
       
       if (get_status1.equals("1")){

    	   buttonL1.setEnabled(true);
    	   Drawable image = ActLevel.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   buttonL1.setCompoundDrawables( image, null, null, null );
    	   buttonL1.setTextColor(Color.parseColor("#a7a7a6"));
       }
       
       cursor = db.rawQuery("SELECT * FROM level_user where level='2' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level2 = cursor.getString(1).toString();
			get_status2 =  cursor.getString(2).toString();    
		}
       if (get_status2.equals("1")){
    	   
    	   buttonL2.setEnabled(true);
    	   Drawable image = ActLevel.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   buttonL2.setCompoundDrawables( image, null, null, null );
    	   buttonL2.setTextColor(Color.parseColor("#a7a7a6"));
    	 //  buttonL2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.tanda_gembok_open, 0, 0, 0);
       } 
       else {
    	   buttonL2.setEnabled(false);
    	   Drawable image = ActLevel.this.getResources().getDrawable( R.drawable.tanda_gembok );
    	   image.setBounds( 0, 0, 24, 24 );
    	   buttonL2.setCompoundDrawables( image, null, null, null );
    	   buttonL2.setTextColor(Color.parseColor("#e4e0e0"));
       }
       
       
       cursor = db.rawQuery("SELECT * FROM level_user where level='3' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level3 = cursor.getString(1).toString();
			get_status3 =  cursor.getString(2).toString();    
		}
       if (get_status3.equals("1")){
    	   
    	   buttonL3.setEnabled(true);
    	   Drawable image = ActLevel.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   buttonL3.setCompoundDrawables( image, null, null, null );
    	   buttonL3.setTextColor(Color.parseColor("#a7a7a6"));
       } 
       else {
    	   buttonL3.setEnabled(false);
    	   Drawable image = ActLevel.this.getResources().getDrawable( R.drawable.tanda_gembok );
    	   image.setBounds( 0, 0, 24, 24 );
    	   buttonL3.setCompoundDrawables( image, null, null, null );
    	   buttonL3.setTextColor(Color.parseColor("#e4e0e0"));
       }
       
       
       cursor = db.rawQuery("SELECT * FROM level_user where level='4' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level4 = cursor.getString(1).toString();
			get_status4 =  cursor.getString(2).toString();    
		}
       if (get_status4.equals("1")){
    	   
    	   buttonL4.setEnabled(true);
    	   Drawable image = ActLevel.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   buttonL4.setCompoundDrawables( image, null, null, null );
    	   buttonL4.setTextColor(Color.parseColor("#a7a7a6"));
       } 
       else {
    	   buttonL4.setEnabled(false);
    	   Drawable image = ActLevel.this.getResources().getDrawable( R.drawable.tanda_gembok );
    	   image.setBounds( 0, 0, 24, 24 );
    	   buttonL4.setCompoundDrawables( image, null, null, null );
    	   buttonL4.setTextColor(Color.parseColor("#e4e0e0"));
       }
       
       cursor = db.rawQuery("SELECT * FROM level_user where level='5' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level5 = cursor.getString(1).toString();
			get_status5 =  cursor.getString(2).toString();    
		}
       if (get_status5.equals("1")){
    	   
    	   buttonL5.setEnabled(true);
    	   Drawable image = ActLevel.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   buttonL5.setCompoundDrawables( image, null, null, null );
    	   buttonL5.setTextColor(Color.parseColor("#a7a7a6"));
       } 
       else {
    	   buttonL5.setEnabled(false);
    	   Drawable image = ActLevel.this.getResources().getDrawable( R.drawable.tanda_gembok );
    	   image.setBounds( 0, 0, 24, 24 );
    	   buttonL5.setCompoundDrawables( image, null, null, null );
    	   buttonL5.setTextColor(Color.parseColor("#e4e0e0"));
       }
       
       
		
		buttonL1.setOnClickListener(new View.OnClickListener() {
			     public void onClick(View v) {
			    	 Intent i= new Intent(getApplicationContext(), ActLevelSoal.class);

						i.putExtra("level","1");
						startActivity(i);
			     } 
		});
		buttonL2.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActLevelSoal.class);

					i.putExtra("level","2");
					startActivity(i);
		     } 
		});
		buttonL3.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActLevelSoal.class);

					i.putExtra("level","3");
					startActivity(i);
		     } 
		});
		buttonL4.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActLevelSoal.class);

					i.putExtra("level","4");
					startActivity(i);
		     } 
		});
		buttonL5.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActLevelSoal.class);
		    	
					i.putExtra("level","5");
					startActivity(i);
		     } 
		});
	
		

	}



public void onBackPressed() {
	Intent intent = new Intent(getApplicationContext(), MenuAct.class);
		startActivity(intent);
	    }

	public void out(){
		AlertDialog.Builder builder = new AlertDialog.Builder(ActLevel.this);
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
