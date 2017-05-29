package com.akanime.gamepilihangandabergambar;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ProgressBar;

public class ActSplash extends Activity {
	
	
	 private long ms = 0;
	 private long splashDuration = 1000;
		 private boolean splashActive = true;
		 private boolean paused = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Show the splash screen
        setContentView(R.layout.layout_splash);
      
		
        // Find the progress bar
        Thread mythread = new Thread() {
     	   public void run() {
     	    try {
     	     while (splashActive && ms < splashDuration) {
     	      if (!paused)
     	       ms = ms + 100;
     	      sleep(70);
     	     }
     	    } catch (Exception e) {
     	    } finally {
     	     Intent intent = new Intent(ActSplash.this,
     	       MenuAct.class);
     	     startActivity(intent);
     	     finish();
     	    }
     	   }
     	  };
     	  mythread.start();
    }
    
    public void onBackPressed() {

		Intent intent = new Intent(getApplicationContext(),
        	       ActSplash.class);
        	     startActivity(intent);
        	     finish();
	   Intent exit = new Intent(Intent.ACTION_MAIN);
		exit.addCategory(Intent.CATEGORY_HOME);
		exit.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(exit);
        // Otherwise defer to system default behavior.
        super.onBackPressed();
    }
}