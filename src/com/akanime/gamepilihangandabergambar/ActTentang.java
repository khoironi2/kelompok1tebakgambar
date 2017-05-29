package com.akanime.gamepilihangandabergambar;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActTentang extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_tentang);
		 //link back atas
	       Button btn_kembali= (Button) findViewById(R.id.btn_back);
			
	       btn_kembali.setOnClickListener(new View.OnClickListener() {
				     public void onClick(View v) {
				    	finish();
				     } 
			});
	       //end link back atas
	       
	       //link 
	       
	}

	

}
