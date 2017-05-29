package com.akanime.gamepilihangandabergambar;

import java.util.ArrayList;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;


import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import android.view.View;
import android.widget.TextView;
public class ActKategoriPakaianAdat extends ListActivity {

	private ProgressDialog pDialog;
		JSONArray str_login = null;
		ArrayList<HashMap<String, String>> angkatan = new ArrayList<HashMap<String, String>>();

		JSONArray ambiljson = null;
		JSONObject json;
		String url;
		ActKategoriPakaianAdat lm;
		String[] daftar, daftar2;
		
		//variable get database sqlite
		Cursor cursor;
		SQLHelperEnsi dbHelper;
		public static ActKategoriPakaianAdat act;
		SQLiteDatabase db;
		//end variable db sqlite
		int get_id_pa;
		String get_nama_pa;
		String id_pakaianadat2,nama_pakaianadat2;
		public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.list_menu);	 
	        
	        //db
	        act = this;

	       db = (new SQLHelperEnsi(this)).getWritableDatabase();
	       
	        //end db
	        TextView t_ttl= (TextView) findViewById(R.id.textView_tittle);
	        t_ttl.setText("Pakaian Adat");
	        //back menu
	        Button btnback= (Button) findViewById(R.id.btn_back);
	        
	        btnback.setOnClickListener(new View.OnClickListener() {
	   		 
	            public void onClick(View v) {
	            	Intent intent = new Intent(getApplicationContext(), ActEnsi.class);
	     			startActivity(intent);
	            }
	        });
	        // end back menu
	    	
	
			new GetServer().execute();
			
			ListView lv = getListView();
			lv.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
					String id_pakaianadat= ((TextView) view.findViewById(R.id.textView_id)).getText().toString();
					String nama_pakaianadat = ((TextView) view.findViewById(R.id.textView_nama)).getText().toString();

					Intent in = new Intent(getApplicationContext(), ActKategoriDetail.class);
					in.putExtra("ext_id", id_pakaianadat);
					in.putExtra("ext_nama", nama_pakaianadat);
					startActivity(in);
				}
			});
			
			
			
			
		}
		
	


		//mengambil data dari server
		private class GetServer extends AsyncTask<Void, Void, Void> {

			@Override
			protected void onPreExecute() {
				super.onPreExecute();
				pDialog = new ProgressDialog(ActKategoriPakaianAdat.this);
				pDialog.setMessage("Tunggu Sebentar.. \n\n");
				pDialog.setCancelable(false);
				pDialog.show();

			}

			protected Void doInBackground(Void... arg0) {
				
				/*
				cursor = db.rawQuery("SELECT * FROM ensiklopedia where kategori='Pakaian Adat' ",null);
			       cursor.moveToFirst();
			       if (cursor.getCount()>0)
			       {
			    	   //cursor.moveToPosition(0);
						get_id_pa = cursor.getString(0).toString();
						get_nama_pa =  cursor.getString(2).toString();    
					}
					*/
			        

			       cursor = db.rawQuery("SELECT * FROM ensiklopedia where kategori='Pakaian Adat' ",null);
			       int no=1;
					//cursor.moveToFirst();
					for (int cc=0; cc < cursor.getCount(); cc++)
					{
						 no=no+1;
						if(no==1){
							cursor.moveToFirst();
						}
						else {
							cursor.moveToNext();
						}
						get_id_pa = cursor.getInt(0);
						get_nama_pa =  cursor.getString(2).toString();    
					
							id_pakaianadat2=Integer.toString(get_id_pa);
							nama_pakaianadat2=get_nama_pa;
							
							HashMap<String, String> menu = new HashMap<String, String>();

							menu.put("id_pakaianadat", Integer.toString(get_id_pa));
							menu.put("nama_pakaianadat",get_nama_pa );

							angkatan.add(menu);
						}
					
					 
				
				return null;
				
			}

			protected void onPostExecute(Void result) {
				super.onPostExecute(result);
				  if (pDialog.isShowing())
		                pDialog.dismiss();
					ListAdapter adapter = new SimpleAdapter(ActKategoriPakaianAdat.this, angkatan,R.layout.list_item_menu,new String[]{ "nama_pakaianadat","id_pakaianadat"},new int[] {R.id.textView_nama,R.id.textView_id});
					setListAdapter(adapter);
								
				
			}
		}  



}
