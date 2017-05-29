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


public class ActLevelSoal extends Activity {
	// flag for Internet connection status
	Boolean isInternetPresent = false;
	
	Button buttoninet;
	 Cursor cursor;
		SQLHelperlevelsoal dbHelper;
		public static ActLevelSoal ma;
		 SQLiteDatabase db;
		 
		 String get_level1, get_status1;
		 String get_level2, get_status2;
		 String get_level3, get_status3;
		 String get_level4, get_status4;
		 String get_level5, get_status5;
		 String get_level6, get_status6;
		 String get_level7, get_status7;
		 String get_level8, get_status8;
		 String get_level9, get_status9;
		 String get_level10, get_status10;
		 
		 Button button1, button2, button3,button4,button5;
		 Button button6, button7, button8,button9,button10;
		 int get_level;
		 String get_level_string;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.levelsoal);
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
        Bundle getI = getIntent().getExtras();
        get_level_string = getI.getString("level").toString();
        
        TextView t_ttl= (TextView) findViewById(R.id.textView_tittle);
        t_ttl.setText(""+ "Level " + get_level_string.toString());
        
        ma = this;


		button1= (Button) findViewById(R.id.button1);
		button2= (Button) findViewById(R.id.button2);
		button3= (Button) findViewById(R.id.button3);
		button4= (Button) findViewById(R.id.button4);
		button5= (Button) findViewById(R.id.button5);
		button6= (Button) findViewById(R.id.button6);
		button7= (Button) findViewById(R.id.button7);
		button8= (Button) findViewById(R.id.button8);
		button9= (Button) findViewById(R.id.button9);
		button10= (Button) findViewById(R.id.button10);

       db = (new SQLHelperlevelsoal(this)).getWritableDatabase();
       cursor = db.rawQuery("SELECT * FROM level_soal where level='"+get_level_string.toString()+"' and no='1' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level1 = cursor.getString(1).toString();
			get_status1 =  cursor.getString(3).toString();    
		}
       
       if (get_status1.equals("1")){

    	   button1.setEnabled(true);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button1.setCompoundDrawables( image, null, null, null );
    	   button1.setTextColor(Color.parseColor("#a7a7a6"));
       }
       
       cursor = db.rawQuery("SELECT * FROM level_soal where level='"+get_level_string.toString()+"' and no='2' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level2 = cursor.getString(1).toString();
			get_status2 =  cursor.getString(3).toString();    
		}
       if (get_status2.equals("1")){
    	   
    	   button2.setEnabled(true);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button2.setCompoundDrawables( image, null, null, null );
    	   button2.setTextColor(Color.parseColor("#a7a7a6"));
    	 //  buttonL2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.tanda_gembok_open, 0, 0, 0);
       } 
       else {
    	   button2.setEnabled(false);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button2.setCompoundDrawables( image, null, null, null );
    	   button2.setTextColor(Color.parseColor("#e4e0e0"));
       }
       
       
       cursor = db.rawQuery("SELECT * FROM level_soal where level='"+get_level_string.toString()+"' and no='3' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level3 = cursor.getString(1).toString();
			get_status3 =  cursor.getString(3).toString();    
		}
       if (get_status3.equals("1")){
    	   
    	   button3.setEnabled(true);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button3.setCompoundDrawables( image, null, null, null );
    	   button3.setTextColor(Color.parseColor("#a7a7a6"));
       } 
       else {
    	   button3.setEnabled(false);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button3.setCompoundDrawables( image, null, null, null );
    	   button3.setTextColor(Color.parseColor("#e4e0e0"));
       }
       
       
       cursor = db.rawQuery("SELECT * FROM level_soal where level='"+get_level_string.toString()+"' and no='4' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level4 = cursor.getString(1).toString();
			get_status4 =  cursor.getString(3).toString();    
		}
       if (get_status4.equals("1")){
    	   
    	   button4.setEnabled(true);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button4.setCompoundDrawables( image, null, null, null );
    	   button4.setTextColor(Color.parseColor("#a7a7a6"));
       } 
       else {
    	   button4.setEnabled(false);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button4.setCompoundDrawables( image, null, null, null );
    	   button4.setTextColor(Color.parseColor("#e4e0e0"));
       }
       
       cursor = db.rawQuery("SELECT * FROM level_soal where level='"+get_level_string.toString()+"' and no='5' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level5 = cursor.getString(1).toString();
			get_status5 =  cursor.getString(3).toString();    
		}
       if (get_status5.equals("1")){
    	   
    	   button5.setEnabled(true);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button5.setCompoundDrawables( image, null, null, null );
    	   button5.setTextColor(Color.parseColor("#a7a7a6"));
       } 
       else {
    	   button5.setEnabled(false);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button5.setCompoundDrawables( image, null, null, null );
    	   button5.setTextColor(Color.parseColor("#e4e0e0"));
       }
       
       cursor = db.rawQuery("SELECT * FROM level_soal where level='"+get_level_string.toString()+"' and no='6' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level6 = cursor.getString(1).toString();
			get_status6 =  cursor.getString(3).toString();    
		}
       if (get_status6.equals("1")){
    	   
    	   button6.setEnabled(true);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button6.setCompoundDrawables( image, null, null, null );
    	   button6.setTextColor(Color.parseColor("#a7a7a6"));
       } 
       else {
    	   button6.setEnabled(false);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button6.setCompoundDrawables( image, null, null, null );
    	   button6.setTextColor(Color.parseColor("#e4e0e0"));
       }
       
       cursor = db.rawQuery("SELECT * FROM level_soal where level='"+get_level_string.toString()+"' and no='7' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level7 = cursor.getString(1).toString();
			get_status7 =  cursor.getString(3).toString();    
		}
       if (get_status7.equals("1")){
    	   
    	   button7.setEnabled(true);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button7.setCompoundDrawables( image, null, null, null );
    	   button7.setTextColor(Color.parseColor("#a7a7a6"));
       } 
       else {
    	   button7.setEnabled(false);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button7.setCompoundDrawables( image, null, null, null );
    	   button7.setTextColor(Color.parseColor("#e4e0e0"));
       }
       cursor = db.rawQuery("SELECT * FROM level_soal where level='"+get_level_string.toString()+"' and no='8' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level8 = cursor.getString(1).toString();
			get_status8 =  cursor.getString(3).toString();    
		}
       if (get_status8.equals("1")){
    	   
    	   button8.setEnabled(true);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button8.setCompoundDrawables( image, null, null, null );
    	   button8.setTextColor(Color.parseColor("#a7a7a6"));
       } 
       else {
    	   button8.setEnabled(false);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button8.setCompoundDrawables( image, null, null, null );
    	   button8.setTextColor(Color.parseColor("#e4e0e0"));
       }
       
       cursor = db.rawQuery("SELECT * FROM level_soal where level='"+get_level_string.toString()+"' and no='9' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level9 = cursor.getString(1).toString();
			get_status9 =  cursor.getString(3).toString();    
		}
       if (get_status9.equals("1")){
    	   
    	   button9.setEnabled(true);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button9.setCompoundDrawables( image, null, null, null );
    	   button9.setTextColor(Color.parseColor("#a7a7a6"));
       } 
       else {
    	   button9.setEnabled(false);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button9.setCompoundDrawables( image, null, null, null );
    	   button9.setTextColor(Color.parseColor("#e4e0e0"));
       }
       
       cursor = db.rawQuery("SELECT * FROM level_soal where level='"+get_level_string.toString()+"' and no='10' ",null);
       cursor.moveToFirst();
       if (cursor.getCount()>0)
       {
       //cursor.moveToPosition(0);
			get_level10 = cursor.getString(1).toString();
			get_status10 =  cursor.getString(3).toString();    
		}
       if (get_status10.equals("1")){
    	   
    	   button10.setEnabled(true);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok_open );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button10.setCompoundDrawables( image, null, null, null );
    	   button10.setTextColor(Color.parseColor("#a7a7a6"));
       } 
       else {
    	   button10.setEnabled(false);
    	   Drawable image = ActLevelSoal.this.getResources().getDrawable( R.drawable.tanda_gembok );
    	   image.setBounds( 0, 0, 24, 24 );
    	   button10.setCompoundDrawables( image, null, null, null );
    	   button10.setTextColor(Color.parseColor("#e4e0e0"));
       }
		
		button1.setOnClickListener(new View.OnClickListener() {
			     public void onClick(View v) {
			    	 Intent i= new Intent(getApplicationContext(), ActSoal.class);
			    	 	i.putExtra("level",get_level_string.toString());
			    	 	i.putExtra("no_soal","1");
              			startActivity(i);
			     } 
		});
		button2.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActSoal.class);
		    	 	i.putExtra("level",get_level_string.toString());
		    	 	i.putExtra("no_soal","2");
         			startActivity(i);
		     } 
		});
		button3.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActSoal.class);
		    	 	i.putExtra("level",get_level_string.toString());
		    	 	i.putExtra("no_soal","3");
         			startActivity(i);
		     } 
		});
		button4.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActSoal.class);
		    	 	i.putExtra("level",get_level_string.toString());
		    	 	i.putExtra("no_soal","4");
         			startActivity(i);
		     } 
		});
		button5.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActSoal.class);
		    	 	i.putExtra("level",get_level_string.toString());
		    	 	i.putExtra("no_soal","5");
         			startActivity(i);
		     } 
		});
		button6.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActSoal.class);
		    	 	i.putExtra("level",get_level_string.toString());
		    	 	i.putExtra("no_soal","6");
         			startActivity(i);
		     } 
		});
		button7.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActSoal.class);
		    	 	i.putExtra("level",get_level_string.toString());
		    	 	i.putExtra("no_soal","7");
        			startActivity(i);
		     } 
		});
		button8.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActSoal.class);
		    	 	i.putExtra("level",get_level_string.toString());
		    	 	i.putExtra("no_soal","8");
        			startActivity(i);
		     } 
		});
		button9.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActSoal.class);
		    	 	i.putExtra("level",get_level_string.toString());
		    	 	i.putExtra("no_soal","9");
        			startActivity(i);
		     } 
		});
		button10.setOnClickListener(new View.OnClickListener() {
		     public void onClick(View v) {
		    	 Intent i= new Intent(getApplicationContext(), ActSoal.class);
		    	 	i.putExtra("level",get_level_string.toString());
		    	 	i.putExtra("no_soal","10");
        			startActivity(i);
		     } 
		});
		

	}



public void onBackPressed() {
	Intent intent = new Intent(getApplicationContext(), ActLevel.class);
		startActivity(intent);
	    }

	

}
