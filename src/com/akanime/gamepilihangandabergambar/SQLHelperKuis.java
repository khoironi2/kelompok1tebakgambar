package com.akanime.gamepilihangandabergambar;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class SQLHelperKuis extends SQLiteOpenHelper{

	private static final String DATABASE_NAME = "akanime_game_kebudayaan1_kuis00112-3.db";
	private static final int DATABASE_VERSION = 1;

	public SQLHelperKuis(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
				
		//isi/create tabel quis
		String sqlquiz = "create table " +
				"kuis" +
				"( id int primary key, " +
				"level text null," +
				"nosoal text null," +
				"gambar int null," +
				"soal text null," +
				"jawaban text null," +
				"a text null," +
				"b text null," +
				"c text null," +
				"d text null," +
				"ensi text null);";
		Log.d("Data", "onCreate: " + sqlquiz);
		db.execSQL(sqlquiz);
		
		
		ContentValues valuesquiz = new ContentValues();
		//level 1
		valuesquiz.put("id", "1001");
		valuesquiz.put("level", "1");
		valuesquiz.put("nosoal", "1");
		valuesquiz.put("gambar", R.drawable.ra_nad_rumah_krong_bade);
		valuesquiz.put("soal", "Apa nama rumah adat diatas ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Rumah Krong Bade");
		valuesquiz.put("b", "Rumah Joglo");
		valuesquiz.put("c", "Rumah Limas");
		valuesquiz.put("d", "Rumah Lamin");
		valuesquiz.put("ensi", "1001");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "1002");
		valuesquiz.put("level", "1");
		valuesquiz.put("nosoal", "2");
		valuesquiz.put("gambar",  R.drawable.ra_sumbar_rumah_gadang);
		valuesquiz.put("soal", "Apa nama rumah adat diatas ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Rumah Gadang");
		valuesquiz.put("b", "Rumah Krong Bade");
		valuesquiz.put("c", "Rumah Honai");
		valuesquiz.put("d", "Rumah Joglo");
		valuesquiz.put("ensi", "1002");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "1003");
		valuesquiz.put("level", "1");
		valuesquiz.put("nosoal", "3");
		valuesquiz.put("gambar",  R.drawable.st_papua_barat_busur_panah);
		valuesquiz.put("soal", "Apa nama Senjata Tradisional diatas ?");
		valuesquiz.put("jawaban", "b");
		valuesquiz.put("a", "Keris");
		valuesquiz.put("b", "Busur Panah");
		valuesquiz.put("c", "Golok");
		valuesquiz.put("d", "Clurit");
		valuesquiz.put("ensi", "3032");
		db.insert("kuis", "id", valuesquiz);
		


		valuesquiz.put("id", "1004");
		valuesquiz.put("level", "1");
		valuesquiz.put("nosoal", "4");
		valuesquiz.put("gambar",  R.drawable.st_gorontalo_wamilo);
		valuesquiz.put("soal", "Apa nama Senjata Tradisional diatas ?");
		valuesquiz.put("jawaban", "d");
		valuesquiz.put("a", "Golok");
		valuesquiz.put("b", "Busur Panah");
		valuesquiz.put("c", "Parang");
		valuesquiz.put("d", "Wamilo");
		valuesquiz.put("ensi", "3029");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "1005");
		valuesquiz.put("level", "1");
		valuesquiz.put("nosoal", "5");
		valuesquiz.put("gambar",  R.drawable.ra_jateng_joglo);
		valuesquiz.put("soal", "Apa nama Rumah Adat diatas ?");
		valuesquiz.put("jawaban", "d");
		valuesquiz.put("a", "Limas");
		valuesquiz.put("b", "Honai");
		valuesquiz.put("c", "Minang");
		valuesquiz.put("d", "Joglo");
		valuesquiz.put("ensi", "1012");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "1006");
		valuesquiz.put("level", "1");
		valuesquiz.put("nosoal", "6");
		valuesquiz.put("gambar",  R.drawable.pa_sulawsibarat_mandar);
		valuesquiz.put("soal", "Apa nama Pakaian Adat diatas ?");
		valuesquiz.put("jawaban", "d");
		valuesquiz.put("a", "Perang");
		valuesquiz.put("b", "Batik");
		valuesquiz.put("c", "Kebaya");
		valuesquiz.put("d", "Mandar");
		valuesquiz.put("ensi", "2008");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "1007");
		valuesquiz.put("level", "1");
		valuesquiz.put("nosoal", "7");
		valuesquiz.put("gambar",  R.drawable.pa_sulawsibarat_mandar);
		valuesquiz.put("soal", "Berasal dari Propinsi mana Pakaian Adat diatas ?");
		valuesquiz.put("jawaban", "c");
		valuesquiz.put("a", "Sulawesi Utara");
		valuesquiz.put("b", "Sulawesi Selatan");
		valuesquiz.put("c", "Sulawesi Barat");
		valuesquiz.put("d", "Sulawesi Timur");
		valuesquiz.put("ensi", "2008");
		db.insert("kuis", "id", valuesquiz);


		valuesquiz.put("id", "1008");
		valuesquiz.put("level", "1");
		valuesquiz.put("nosoal", "8");
		valuesquiz.put("gambar", R.drawable.pa_sultengah_nggembe);
		valuesquiz.put("soal", "Berasal dari Propinsi mana Pakaian Adat diatas ?");
		valuesquiz.put("jawaban", "b");
		valuesquiz.put("a", "Sulawesi Utara");
		valuesquiz.put("b", "Sulawesi Tengah");
		valuesquiz.put("c", "Sulawesi Barat");
		valuesquiz.put("d", "Sulawesi Tenggara");
		valuesquiz.put("ensi", "2007");
		db.insert("kuis", "id", valuesquiz);
		
		valuesquiz.put("id", "1009");
		valuesquiz.put("level", "1");
		valuesquiz.put("nosoal", "9");
		valuesquiz.put("gambar", R.drawable.ra_bali_rumah_gapura_candi_bentar);
		valuesquiz.put("soal", "Berasal dari Propinsi mana Rumah Adat diatas ?");
		valuesquiz.put("jawaban", "d");
		valuesquiz.put("a", "Jawa Timur");
		valuesquiz.put("b", "Jawa Tengah");
		valuesquiz.put("c", "Jawa Barat");
		valuesquiz.put("d", "Bali");
		valuesquiz.put("ensi", "1015");
		db.insert("kuis", "id", valuesquiz);
		
		valuesquiz.put("id", "1010");
		valuesquiz.put("level", "1");
		valuesquiz.put("nosoal", "10");
		valuesquiz.put("gambar", R.drawable.ra_bali_rumah_gapura_candi_bentar);
		valuesquiz.put("soal", "Apa nama Rumah Adat diatas ?");
		valuesquiz.put("jawaban", "c");
		valuesquiz.put("a", "Rumah Joglo");
		valuesquiz.put("b", "Rumah limas");
		valuesquiz.put("c", "Rumah Gapura Candi Bentar");
		valuesquiz.put("d", "Rumah Istana Sultan Sumbawa");
		valuesquiz.put("ensi", "1015");
		db.insert("kuis", "id", valuesquiz);
		
		
		//level 1 end
		
		//isi kuis level 2
		
		//level 2
		valuesquiz.put("id", "2001");
		valuesquiz.put("level", "2");
		valuesquiz.put("nosoal", "1");
		valuesquiz.put("gambar", R.drawable.ra_lampung_nowou_sesat);
		valuesquiz.put("soal", "Berasal dari propinsi mana rumah adat diatas ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Lampung");
		valuesquiz.put("b", "Bali");
		valuesquiz.put("c", "NTT");
		valuesquiz.put("d", "NTB");
		valuesquiz.put("ensi", "1008");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "2002");
		valuesquiz.put("level", "2");
		valuesquiz.put("nosoal", "2");
		valuesquiz.put("gambar",  R.drawable.ra_jakarta_rumah_kebaya);
		valuesquiz.put("soal", "Apa nama rumah adat diatas ?");
		valuesquiz.put("jawaban", "b");
		valuesquiz.put("a", "Rumah Panjang");
		valuesquiz.put("b", "Rumah Kebaya");
		valuesquiz.put("c", "Rumah Limas");
		valuesquiz.put("d", "Rumah Joglo");
		valuesquiz.put("ensi", "1009");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "2003");
		valuesquiz.put("level", "2");
		valuesquiz.put("nosoal", "3");
		valuesquiz.put("gambar",  R.drawable.ra_banten_rumah_badui);
		valuesquiz.put("soal", "Apa nama Rumah Adat diatas ?");
		valuesquiz.put("jawaban", "d");
		valuesquiz.put("a", "Rumah Panjang");
		valuesquiz.put("b", "Rumah Joglo");
		valuesquiz.put("c", "Rumah Honai");
		valuesquiz.put("d", "Rumah Badui");
		valuesquiz.put("ensi", "1011");
		db.insert("kuis", "id", valuesquiz);
		


		valuesquiz.put("id", "2004");
		valuesquiz.put("level", "2");
		valuesquiz.put("nosoal", "4");
		valuesquiz.put("gambar",  R.drawable.st_gorontalo_wamilo);
		valuesquiz.put("soal", "Berasal dari Propinsi Senjata Tradisional diatas ?");
		valuesquiz.put("jawaban", "d");
		valuesquiz.put("a", "Bali");
		valuesquiz.put("b", "Papua");
		valuesquiz.put("c", "Banten");
		valuesquiz.put("d", "Gorontalo");
		valuesquiz.put("ensi", "3029");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "2005");
		valuesquiz.put("level", "2");
		valuesquiz.put("nosoal", "5");
		valuesquiz.put("gambar",  R.drawable.st_papua_barat_busur_panah);
		valuesquiz.put("soal", "Senjata Busur Panah adalah senjata tradisional dari propinsi ?");
		valuesquiz.put("jawaban", "d");
		valuesquiz.put("a", "Aceh");
		valuesquiz.put("b", "NTB");
		valuesquiz.put("c", "NTT");
		valuesquiz.put("d", "Papua Barat");
		valuesquiz.put("ensi", "3032");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "2006");
		valuesquiz.put("level", "2");
		valuesquiz.put("nosoal", "6");
		valuesquiz.put("gambar",  R.drawable.st_papua_pisau_belati);
		valuesquiz.put("soal", "Senjata tradisional pisau belati adalah senjata tradisional dari propinsi ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Papua");
		valuesquiz.put("b", "Bali");
		valuesquiz.put("c", "NTT");
		valuesquiz.put("d", "NTB");
		valuesquiz.put("ensi", "3033");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "2007");
		valuesquiz.put("level", "2");
		valuesquiz.put("nosoal", "7");
		valuesquiz.put("gambar",  R.drawable.pa_sulut_kulavi);
		valuesquiz.put("soal", "Pakaian Adat Tradisional Kulavi dari propinsi ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Sulawesi Utara");
		valuesquiz.put("b", "Sulawesi Selatan");
		valuesquiz.put("c", "Sulawesi Barat");
		valuesquiz.put("d", "Sulawesi Timur");
		valuesquiz.put("ensi", "2005");
		db.insert("kuis", "id", valuesquiz);


		valuesquiz.put("id", "2008");
		valuesquiz.put("level", "2");
		valuesquiz.put("nosoal", "8");
		valuesquiz.put("gambar", R.drawable.pa_sulsel_bodo);
		valuesquiz.put("soal", "Berasal dari Propinsi mana Pakaian Adat diatas ?");
		valuesquiz.put("jawaban", "b");
		valuesquiz.put("a", "Sulawesi Barat");
		valuesquiz.put("b", "Sulawesi Tengah");
		valuesquiz.put("c", "Sulawesi Selatan");
		valuesquiz.put("d", "Sulawesi Tenggara");
		valuesquiz.put("ensi", "2004");
		db.insert("kuis", "id", valuesquiz);
		
		valuesquiz.put("id", "2009");
		valuesquiz.put("level", "2");
		valuesquiz.put("nosoal", "9");
		valuesquiz.put("gambar", R.drawable.pa_papua_pakaian_adat);
		valuesquiz.put("soal", "Berasal dari Propinsi mana Rumah Adat diatas ?");
		valuesquiz.put("jawaban", "d");
		valuesquiz.put("a", "Bali");
		valuesquiz.put("b", "NTT");
		valuesquiz.put("c", "Maluku");
		valuesquiz.put("d", "Papua");
		valuesquiz.put("ensi", "2002");
		db.insert("kuis", "id", valuesquiz);
		
		valuesquiz.put("id", "2010");
		valuesquiz.put("level", "2");
		valuesquiz.put("nosoal", "10");
		valuesquiz.put("gambar", R.drawable.pa_papuabarat_ewer);
		valuesquiz.put("soal", "Apa nama Pakaian Adat diatas ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Ewer");
		valuesquiz.put("b", "Bodo");
		valuesquiz.put("c", "Kulavi");
		valuesquiz.put("d", "nggembe");
		valuesquiz.put("ensi", "2001");
		db.insert("kuis", "id", valuesquiz);
		
		
		//level 2 end
		
		//isi kuis level 3
		
		//level 3
		valuesquiz.put("id", "3001");
		valuesquiz.put("level", "3");
		valuesquiz.put("nosoal", "1");
		valuesquiz.put("gambar", R.drawable.ra_lampung_nowou_sesat);
		valuesquiz.put("soal", "Apa nama rumah adat diatas ?");
		valuesquiz.put("jawaban", "b");
		valuesquiz.put("a", "Kulavi");
		valuesquiz.put("b", "Nowou sesat");
		valuesquiz.put("c", "Bodo");
		valuesquiz.put("d", "Kebaya");
		valuesquiz.put("ensi", "1008");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "3002");
		valuesquiz.put("level", "3");
		valuesquiz.put("nosoal", "2");
		valuesquiz.put("gambar",  R.drawable.ra_ntb_rumah_istana_sultan_sumbawa);
		valuesquiz.put("soal", "Rumah Istana Sultan Sumbawa berasal dari propinsi?");
		valuesquiz.put("jawaban", "b");
		valuesquiz.put("a", "NTB");
		valuesquiz.put("b", "NTT");
		valuesquiz.put("c", "Maluku");
		valuesquiz.put("d", "Sulawesi Tengah");
		valuesquiz.put("ensi", "1016");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "3003");
		valuesquiz.put("level", "3");
		valuesquiz.put("nosoal", "3");
		valuesquiz.put("gambar",  R.drawable.ra_banten_rumah_badui);
		valuesquiz.put("soal", " Rumah Adat Badui berasal dari propinsi diatas ?");
		valuesquiz.put("jawaban", "b");
		valuesquiz.put("a", "Jawa Timur");
		valuesquiz.put("b", "Banten");
		valuesquiz.put("c", "Bali");
		valuesquiz.put("d", "Papua");
		valuesquiz.put("ensi", "1011");
		db.insert("kuis", "id", valuesquiz);
		


		valuesquiz.put("id", "3004");
		valuesquiz.put("level", "3");
		valuesquiz.put("nosoal", "4");
		valuesquiz.put("gambar",  R.drawable.pa_ntb_lombok);
		valuesquiz.put("soal", "Berasal dari Propinsi mana Pakaian Adat diatas ?");
		valuesquiz.put("jawaban", "d");
		valuesquiz.put("a", "Bali");
		valuesquiz.put("b", "Papua");
		valuesquiz.put("c", "Banten");
		valuesquiz.put("d", "Lombok");
		valuesquiz.put("ensi", "2009");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "3005");
		valuesquiz.put("level", "3");
		valuesquiz.put("nosoal", "5");
		valuesquiz.put("gambar", R.drawable.pa_ntt_ntt);
		valuesquiz.put("soal", "Dari Propinsi mana pakaian adat diatas ?");
		valuesquiz.put("jawaban", "c");
		valuesquiz.put("a", "Aceh");
		valuesquiz.put("b", "NTB");
		valuesquiz.put("c", "NTT");
		valuesquiz.put("d", "Papua Barat");
		valuesquiz.put("ensi", "2010");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "3006");
		valuesquiz.put("level", "3");
		valuesquiz.put("nosoal", "6");
		valuesquiz.put("gambar",  R.drawable.pa_maluku_utara_manteren_lamo);
		valuesquiz.put("soal", "Apa nama pakaian adat diatas ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Manteren Lamo");
		valuesquiz.put("b", "Kebaya");
		valuesquiz.put("c", "Kulavi");
		valuesquiz.put("d", "Batik");
		valuesquiz.put("ensi", "2011");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "3007");
		valuesquiz.put("level", "3");
		valuesquiz.put("nosoal", "7");
		valuesquiz.put("gambar",   R.drawable.pa_maluku_baju_cele);
		valuesquiz.put("soal", "Pakaian Adat Tradisional Baju Cele dari propinsi ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Maluku");
		valuesquiz.put("b", "Sulawesi Selatan");
		valuesquiz.put("c", "NTB");
		valuesquiz.put("d", "Kalimantan Timur");
		valuesquiz.put("ensi", "2012");
		db.insert("kuis", "id", valuesquiz);


		valuesquiz.put("id", "3008");
		valuesquiz.put("level", "3");
		valuesquiz.put("nosoal", "8");
		valuesquiz.put("gambar", R.drawable.pa_sulsel_bodo);
		valuesquiz.put("soal", "Nama dari Pakaian Adat diatas adalah ?");
		valuesquiz.put("jawaban", "c");
		valuesquiz.put("a", "Kebaya");
		valuesquiz.put("b", "Batik");
		valuesquiz.put("c", "Bodo");
		valuesquiz.put("d", "Pangsi");
		valuesquiz.put("ensi", "2004");
		db.insert("kuis", "id", valuesquiz);
		
		valuesquiz.put("id", "3009");
		valuesquiz.put("level", "3");
		valuesquiz.put("nosoal", "9");
		valuesquiz.put("gambar",  R.drawable.st_nad_rencong);
		valuesquiz.put("soal", "Berasal dari Propinsi mana Senjata tradisional diatas ?");
		valuesquiz.put("jawaban", "c");
		valuesquiz.put("a", "Bali");
		valuesquiz.put("b", "NTT");
		valuesquiz.put("c", "Aceh");
		valuesquiz.put("d", "Papua");
		valuesquiz.put("ensi", "3001");
		db.insert("kuis", "id", valuesquiz);
		
		valuesquiz.put("id", "3010");
		valuesquiz.put("level", "3");
		valuesquiz.put("nosoal", "10");
		valuesquiz.put("gambar", R.drawable.st_sumut_piso_surit_piso_gaja_dompak);
		valuesquiz.put("soal", "Piso Surit Piso Gaja Dompak berasal dari propinsi ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Sumatera Utara");
		valuesquiz.put("b", "Sulawesi Utara");
		valuesquiz.put("c", "Sumatera Selatan");
		valuesquiz.put("d", "Sulawesi Selatan");
		valuesquiz.put("ensi", "3002");
		db.insert("kuis", "id", valuesquiz);
		
		
		//level 3 end
		
		//isi kuis level 4
		
		//level 4
		valuesquiz.put("id", "4001");
		valuesquiz.put("level", "4");
		valuesquiz.put("nosoal", "1");
		valuesquiz.put("gambar", R.drawable.st_sumbar_karih_ruduih_piarit);
		valuesquiz.put("soal", "Senjata Karih Ruduih Piarit berasal dari propinsi ?");
		valuesquiz.put("jawaban", "b");
		valuesquiz.put("a", "Sumatera Utara");
		valuesquiz.put("b", "Sumatera Barat");
		valuesquiz.put("c", "Sumatera Selatan");
		valuesquiz.put("d", "Sulawesi Selatan");
		valuesquiz.put("ensi", "3003");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "4002");
		valuesquiz.put("level", "4");
		valuesquiz.put("nosoal", "2");
		valuesquiz.put("gambar",   R.drawable.st_riau_pedang_jenawi_badik_tumbuk_lado);
		valuesquiz.put("soal", "Senjata tradisional diatas berasal dari propinsi?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Jambi");
		valuesquiz.put("b", "Riau");
		valuesquiz.put("c", "Bali");
		valuesquiz.put("d", "NTT");
		valuesquiz.put("ensi", "3006");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "4003");
		valuesquiz.put("level", "4");
		valuesquiz.put("nosoal", "3");
		valuesquiz.put("gambar",  R.drawable.st_sumsel_tombak_trisula);
		valuesquiz.put("soal", "Apa nama senjata tradisional diatas ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Tombak trisula");
		valuesquiz.put("b", "Siwar panjang");
		valuesquiz.put("c", "Clurit");
		valuesquiz.put("d", "Papua");
		valuesquiz.put("ensi", "3007");
		db.insert("kuis", "id", valuesquiz);
		


		valuesquiz.put("id", "4004");
		valuesquiz.put("level", "4");
		valuesquiz.put("nosoal", "4");
		valuesquiz.put("gambar",  R.drawable.st_bangka_belitung_siwar_panjang);
		valuesquiz.put("soal", "Siwar Panjang adalah senjata tradisional dari propinsi?");
		valuesquiz.put("jawaban", "d");
		valuesquiz.put("a", "Bali");
		valuesquiz.put("b", "Banten");
		valuesquiz.put("c", "Jawa Barat");
		valuesquiz.put("d", "Bangka Belitung");
		valuesquiz.put("ensi", "3008");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "4005");
		valuesquiz.put("level", "4");
		valuesquiz.put("nosoal", "5");
		valuesquiz.put("gambar", R.drawable.st_bengkulu_kuduk_badik_rudus);
		valuesquiz.put("soal", "Senjata tradisional Kuduk , Badik , Rudus  berasal dari propinsi ?");
		valuesquiz.put("jawaban", "b");
		valuesquiz.put("a", "Aceh");
		valuesquiz.put("b", "Bengkulu");
		valuesquiz.put("c", "Jawa Tengah");
		valuesquiz.put("d", "Papua Barat");
		valuesquiz.put("ensi", "3009");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "4006");
		valuesquiz.put("level", "4");
		valuesquiz.put("nosoal", "6");
		valuesquiz.put("gambar",  R.drawable.pa_maluku_utara_manteren_lamo);
		valuesquiz.put("soal", "Pakaian adat diatas berasal dari propinsi ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Maluku Utara");
		valuesquiz.put("b", "Sulawesi Utara");
		valuesquiz.put("c", "Sumatera Utara");
		valuesquiz.put("d", "Papua");
		valuesquiz.put("ensi", "2011");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "4007");
		valuesquiz.put("level", "4");
		valuesquiz.put("nosoal", "7");
		valuesquiz.put("gambar",   R.drawable.pa_maluku_baju_cele);
		valuesquiz.put("soal", "Apa nama pakaian adat diatas ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Baju Cele");
		valuesquiz.put("b", "Batik sarimbit");
		valuesquiz.put("c", "Baular lulut");
		valuesquiz.put("d", "Kebaya");
		valuesquiz.put("ensi", "2012");
		db.insert("kuis", "id", valuesquiz);


		valuesquiz.put("id", "4008");
		valuesquiz.put("level", "4");
		valuesquiz.put("nosoal", "8");
		valuesquiz.put("gambar",R.drawable.pa_jatim_pesaan);
		valuesquiz.put("soal", "Pakaian Adat Tradisional Pesa'an berasal dari propinsi ?");
		valuesquiz.put("jawaban", "c");
		valuesquiz.put("a", "Jawa Tengah");
		valuesquiz.put("b", "Jawa Barat");
		valuesquiz.put("c", "Jawa Timur");
		valuesquiz.put("d", "Jakarta");
		valuesquiz.put("ensi", "2024");
		db.insert("kuis", "id", valuesquiz);
		
		valuesquiz.put("id", "4009");
		valuesquiz.put("level", "4");
		valuesquiz.put("nosoal", "9");
		valuesquiz.put("gambar",  R.drawable.st_nad_rencong);
		valuesquiz.put("soal", "Apa nama Senjata tradisional diatas ?");
		valuesquiz.put("jawaban", "b");
		valuesquiz.put("a", "Clurit");
		valuesquiz.put("b", "Rencong");
		valuesquiz.put("c", "Sundu");
		valuesquiz.put("d", "Mandau");
		valuesquiz.put("ensi", "3001");
		db.insert("kuis", "id", valuesquiz);
		
		valuesquiz.put("id", "4010");
		valuesquiz.put("level", "4");
		valuesquiz.put("nosoal", "10");
		valuesquiz.put("gambar",  R.drawable.st_jatim_clurit);
		valuesquiz.put("soal", "Senjata tradisional diatas berasal dari propinsi ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Jawa Timur");
		valuesquiz.put("b", "Jawa Tengah");
		valuesquiz.put("c", "Jawa Barat");
		valuesquiz.put("d", "Jakarta");
		valuesquiz.put("ensi", "3016");
		db.insert("kuis", "id", valuesquiz);
		
		
		//level 4 end
		
		//isi kuis level 5
		
		//level 5
		valuesquiz.put("id", "5001");
		valuesquiz.put("level", "5");
		valuesquiz.put("nosoal", "1");
		valuesquiz.put("gambar", R.drawable.st_ntt_sundu);
		valuesquiz.put("soal", "Senjata tradisional dari propinsi Nusa Tenggara Timur (NTT)  adalah ?");
		valuesquiz.put("jawaban", "b");
		valuesquiz.put("a", "Siwar panjang");
		valuesquiz.put("b", "Sundu");
		valuesquiz.put("c", "Parang");
		valuesquiz.put("d", "Golok");
		valuesquiz.put("ensi", "3019");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "5002");
		valuesquiz.put("level", "5");
		valuesquiz.put("nosoal", "2");
		valuesquiz.put("gambar",   R.drawable.st_kalbar_mandau);
		valuesquiz.put("soal", "Senjata tradisional dari Propinsi Kalimantan barat adalah?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Mandau");
		valuesquiz.put("b", "Parang");
		valuesquiz.put("c", "Sundu");
		valuesquiz.put("d", "Rencong");
		valuesquiz.put("ensi", "3020");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "5003");
		valuesquiz.put("level", "5");
		valuesquiz.put("nosoal", "3");
		valuesquiz.put("gambar",  R.drawable.st_sumsel_tombak_trisula);
		valuesquiz.put("soal", "Senjata tradisional tombak trisula berasal dari propinsi ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Sumatera Selatan");
		valuesquiz.put("b", "Sulawesi Selatan");
		valuesquiz.put("c", "Sumatera Utara");
		valuesquiz.put("d", "Sulawesi Utara");
		valuesquiz.put("ensi", "3007");
		db.insert("kuis", "id", valuesquiz);
		


		valuesquiz.put("id", "5004");
		valuesquiz.put("level", "5");
		valuesquiz.put("nosoal", "4");
		valuesquiz.put("gambar", R.drawable.st_lampung_terapang_pehduk_payan);
		valuesquiz.put("soal", "Senjata tradisional diatas berasal dari propinsi?");
		valuesquiz.put("jawaban", "c");
		valuesquiz.put("a", "Bali");
		valuesquiz.put("b", "Banten");
		valuesquiz.put("c", "Lampung");
		valuesquiz.put("d", "Bangka Belitung");
		valuesquiz.put("ensi", "3010");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "5005");
		valuesquiz.put("level", "5");
		valuesquiz.put("nosoal", "5");
		valuesquiz.put("gambar", R.drawable.ra_kalsel_rumah_banjar_bubungan_tinggi);
		valuesquiz.put("soal", "Rumah Adat diatas berasal dari propinsi ?");
		valuesquiz.put("jawaban", "b");
		valuesquiz.put("a", "Sumatera Selatan");
		valuesquiz.put("b", "Kalimantan Selatan");
		valuesquiz.put("c", "Sulawesi Selatan");
		valuesquiz.put("d", "Sulawesi Utara");
		valuesquiz.put("ensi", "1020");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "5006");
		valuesquiz.put("level", "5");
		valuesquiz.put("nosoal", "6");
		valuesquiz.put("gambar", R.drawable.ra_kaltim_rumah_lamin);
		valuesquiz.put("soal", "Apa nama rumah adat dai Propinsi Kalimantan Timur ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Rumah Lamin");
		valuesquiz.put("b", "Limas");
		valuesquiz.put("c", "Joglo");
		valuesquiz.put("d", "Rumah Pewaris");
		valuesquiz.put("ensi", "1021");
		db.insert("kuis", "id", valuesquiz);

		valuesquiz.put("id", "5007");
		valuesquiz.put("level", "5");
		valuesquiz.put("nosoal", "7");
		valuesquiz.put("gambar",   R.drawable.ra_sulteng_rumah_tambi);
		valuesquiz.put("soal", "Rumah adat Tambi berasal dari propinsi ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Sulawesi Tengah");
		valuesquiz.put("b", "Sumatera Utara");
		valuesquiz.put("c", "Sulawesi Utara");
		valuesquiz.put("d", "Sulawesi Tenggara");
		valuesquiz.put("ensi", "1024");
		db.insert("kuis", "id", valuesquiz);


		valuesquiz.put("id", "5008");
		valuesquiz.put("level", "5");
		valuesquiz.put("nosoal", "8");
		valuesquiz.put("gambar", R.drawable.ra_sultra_rumah_istana_buton_malige);
		valuesquiz.put("soal", "Rumah Istana Buton Malige berasal dari propinsi ?");
		valuesquiz.put("jawaban", "a");
		valuesquiz.put("a", "Sulawesi Tenggara");
		valuesquiz.put("b", "Sulawesi Tengah");
		valuesquiz.put("c", "Sulawesi Selatan");
		valuesquiz.put("d", "Sulawesi Utara");
		valuesquiz.put("ensi", "1025");
		db.insert("kuis", "id", valuesquiz);
		
		valuesquiz.put("id", "5009");
		valuesquiz.put("level", "5");
		valuesquiz.put("nosoal", "9");
		valuesquiz.put("gambar",  R.drawable.ra_maluku_rumah_baileo);
		valuesquiz.put("soal", "Rumah adat diatas berasal dari propinsi ?");
		valuesquiz.put("jawaban", "b");
		valuesquiz.put("a", "Papua");
		valuesquiz.put("b", "Maluku");
		valuesquiz.put("c", "Bali");
		valuesquiz.put("d", "Riau");
		valuesquiz.put("ensi", "1028");
		db.insert("kuis", "id", valuesquiz);
		
		valuesquiz.put("id", "5010");
		valuesquiz.put("level", "5");
		valuesquiz.put("nosoal", "10");
		valuesquiz.put("gambar",  R.drawable.pa_bali_bali);
		valuesquiz.put("soal", "Pakaian diatas berasal dari propinsi ?");
		valuesquiz.put("jawaban", "d");
		valuesquiz.put("a", "Jawa Timur");
		valuesquiz.put("b", "Jawa Tengah");
		valuesquiz.put("c", "Jawa Barat");
		valuesquiz.put("d", "Bali");
		valuesquiz.put("ensi", "2013");
		db.insert("kuis", "id", valuesquiz);
		
		
		//level 5 end
	}

	@Override

	public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
		
		

	}

}
