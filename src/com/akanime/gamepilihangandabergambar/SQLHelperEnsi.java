package com.akanime.gamepilihangandabergambar;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class SQLHelperEnsi extends SQLiteOpenHelper{

	private static final String DATABASE_NAME = "akanime_game_kebudayaan1_ensi00112-3.db";
	private static final int DATABASE_VERSION = 1;

	public SQLHelperEnsi(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		//buat table kategori
		String kategori = "create table " +
				"kategori" +
				"( id int primary key, " +
				"kategori text null);";
		Log.d("Data", "onCreate: " + kategori);
		db.execSQL(kategori);
		
		//buat table ensiklopedia
		String ensiklopedia = "create table " +
				"ensiklopedia" +
				"( id int primary key," +
				"gambar int null, " +
				"nama text null, " +
				"keterangan text null, " +
				"propinsi text null, " +
				"kategori text null);";
		Log.d("Data", "onCreate: " + ensiklopedia);
		db.execSQL(ensiklopedia);
		
		
		// isi kategori
		ContentValues valuesKategori = new ContentValues();
		
		// isi kategori
		valuesKategori.put("id", "1");
		valuesKategori.put("kategori", "Rumah Adat");
		db.insert("kategori", "id", valuesKategori);

		valuesKategori.put("id", "2");
		valuesKategori.put("kategori", "Pakaian Adat");
		db.insert("kategori", "id", valuesKategori);
		

		valuesKategori.put("id", "3");
		valuesKategori.put("kategori", "Senjata Tradisional");
		db.insert("kategori", "id", valuesKategori);
		// end isi kategori
		
		
		// isi ensiklopedia
		ContentValues valuesEnsiklopedia = new ContentValues();
		
		// isi ensiklopedia kategori rumah adat
		valuesEnsiklopedia.put("id", "1001");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_nad_rumah_krong_bade);
		valuesEnsiklopedia.put("nama", "Rumah Krong Bade");
		valuesEnsiklopedia.put("keterangan", "Rumah Krong Bade adalah rumah adat dari Nanggroe Aceh Darussalam. Rumah Krong Bade juga biasa dikenal dengan nama rumoh Aceh. Rumah ini mempunyai tangga depan yang digunakan bagi tamu atau orang yang tinggal untuk masuk di dalam rumah. Rumah Krong Bade adalah satu budaya Indonesia yang hampir punah. Rumah Krong Bade saat ini sudah jarang dipakai karena hampir sebagian banyak masyarakat aceh memilih untuk tinggal di rumah modern. Hal ini dikarenakan harga pembangunan rumah modern jauh lebih murah dibandingkan dengan Rumah Krong Bade. Selain biaya pembangunan, biaya perawatan Rumah Krong Bade juga memakan biaya yang tidak sedikit.");
		valuesEnsiklopedia.put("propinsi", "Aceh (Nangro Aceh Darussalam)");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		

		valuesEnsiklopedia.put("id", "1002");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sumbar_rumah_gadang);
		valuesEnsiklopedia.put("nama", "Rumah Gadang");
		valuesEnsiklopedia.put("keterangan", "Rumah Gadang atau Rumah Godang adalah nama untuk rumah adat Minangkabau yang merupakan rumah tradisional dan banyak di jumpai di provinsi Sumatera Barat, Indonesia. Rumah ini juga disebut dengan nama lain oleh masyarakat setempat dengan nama Rumah Bagonjong atau ada juga yang menyebut dengan nama Rumah Baanjuang.");
		valuesEnsiklopedia.put("propinsi", "Sumatera Barat");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1003");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_riau_rumah_melayu_selaso_jatuh_kembar);
		valuesEnsiklopedia.put("nama", "Rumah Melayu Selaso Jatuh Kembar");
		valuesEnsiklopedia.put("keterangan", "Rumah Melayu Selaso Jatuh Kembar adalah nama rumah tradisional dari masyarakat Riau, yang pada umumnya adalah rumah panggung yang berdiri diatas tiang dengan bentuk bangunan persegi panjang. Dari beberapa bentuk rumah ini hampir serupa, baik tangga, pintu, dinding, susunan ruangannya sama, dan memiliki ukiran melayu seperti selembayung, lebah bergayut, pucuk rebung dll. Selaso jatuh kembar sendiri bermakna rumah yang memiliki dua selasar (selaso, salaso) yang lantainya lebih rendah dari ruang tengah.");
		valuesEnsiklopedia.put("propinsi", "Riau");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1004");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_jambi_rumah_panjang);
		valuesEnsiklopedia.put("nama", "Rumah Panggung");
		valuesEnsiklopedia.put("keterangan", "Rumah Panggung (Jambi) adalah nama rumah adat yang berasal dari daerah Jambi. Rumah ini terbuat dari kayu. Rumah ini juga dikenal dengan nama rumah Kajang Leko. Rumah ini terbagi ke dalam 8 ruangan. Ruangan pertama bernama jogan yang berfungsi sebagai tempat beristirahat anggota keluarga dan juga sebagai tempat untuk menyimpan air. Ruangan kedua adalah serambi depan yang berfungsi untuk menerima tamu lelaki. Ruangan ketiga adalah serambi dalam yang berfungsi sebagai tempat tidur anak lelaki. Ruang keempat adalah amben melintang yang berfungsi sebagai kamar pengantin. Ruang kelima adalah serambi belakang yang berfungsi sebagai ruang tidur untuk anak-anak perempuan yang belum menikah. Ruang keenam adalah laren yang digunakan untuk menerima tamu perempuan. Ruang ketujuh adalah garang yang digunakan sebagai ruang untuk mengolah makanan dan juga sebagai tempat penyimpanan air. Ruang kedelapan adalah dapur yang digunakan untuk memasak makanan. Rumah panggung Jambi merupakan salah satu kebudayaan Indonesia yang harus dilestarikan.");
		valuesEnsiklopedia.put("propinsi", "Jambi");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1005");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sumsel_rumah_limas);
		valuesEnsiklopedia.put("nama", "Rumah Limas");
		valuesEnsiklopedia.put("keterangan", "Rumah Limas merupakan prototipe rumah tradisional Sumatra Selatan. Selain ditandai dengan atapnya yang berbentuk limas, rumah tradisional ini memiliki lantai bertingkat-tingkat yang disebut Bengkilas dan hanya dipergunakan untuk kepentingan keluarga seperti hajatan. Para tamu biasanya diterima diteras atau lantai kedua.");
		valuesEnsiklopedia.put("propinsi", "Sumatera Selatan");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1006");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_bangkabelitung_rumah_rakit_rumah_limas);
		valuesEnsiklopedia.put("nama", "Rumah Rakit");
		valuesEnsiklopedia.put("keterangan", "Rumah rakit merupakan rumah adat dari Bangka Belitung, rumah ini dibangun diatas air. Rumah ini berpondasikan dari bambu sebagai alat pengapung rumah tersebut. Dahulu alat pengapung rumah rakit hanya terbuat dari bambu, namun sekarang sudah ditambahkan alat pengapung tambahan seperti drum dan lainnya.");
		valuesEnsiklopedia.put("propinsi", "Bangka Belitung");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1007");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_bengkulu_rumah_rakyat);
		valuesEnsiklopedia.put("nama", "Rumah Rakyat");
		valuesEnsiklopedia.put("keterangan", "Rumah rakyat adalah rumah adat asal Bengkulu, rumah ini digunakan sebagai tempat tinggal dari kebanyakan orang Bengkulu. Ukurannya lebih kecil dari rumah bangsawan (rumah dengan ukuran besar).");
		valuesEnsiklopedia.put("propinsi", "Bengkulu");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1008");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_lampung_nowou_sesat);
		valuesEnsiklopedia.put("nama", "Nuwo Sesat");
		valuesEnsiklopedia.put("keterangan", "Nuwo Sesat merupakan rumah adat Lampung. Bentuknya menyerupai panggung, atap terbuat dari anyaman ilalang dan kayu untuk menghindari serangan binatang buas. Rumah tradisional ini juga dirancang tahan gempa. Masyarakat setempat telah mengenal cara membangun rumah yang tahan gempa sejak zaman nenek moyang mereka. Hal ini dikarenakan posisi Lampung yang terletak diantara pertemuan lempeng Asia dan Australia.");
		valuesEnsiklopedia.put("propinsi", "Lampung");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1009");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_jakarta_rumah_kebaya);
		valuesEnsiklopedia.put("nama", "Rumah Kebaya");
		valuesEnsiklopedia.put("keterangan", "Rumah Kebaya merupakan sebuah nama rumah adat suku Betawi (DKI Jakarta). Disebut dengan rumah kebaya dikarenakan bentuk atapnya yang menyerupai pelana yang dilipat dan apabila dilihat dari samping maka lipatan-lipatan tersebut terlihat seperti lipatan kebaya.");
		valuesEnsiklopedia.put("propinsi", "DKI Jakarta");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1010");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_jabar_rumah_kesepuhan_cirebon);
		valuesEnsiklopedia.put("nama", "Rumah Kesepuhan Cirebon");
		valuesEnsiklopedia.put("keterangan", "Rumah Kesepuhan Cirebon merupakan nama rumah adat asal Cirebon, Jawa Barat. Rumah yang disebut juga rumah Keraton Kasepuhan Cirebon ini merupakan tapak sejarah penting karena merupakan pusat pemerintahan sekaligus pusat penyebaran Islam di Jawa Barat. Mula didirikan oleh Pangeran Cakrabuwana dengan nama Keraton Pakungwati pada tahun 1452, kemudian diperluas dan diperbaharui oleh Sunan Gunung Jati pada tahun 1483. Kini, keraton masih lestari dengan segenap peninggalannya dan arsitektur yang bernilai tinggi.");
		valuesEnsiklopedia.put("propinsi", "Jawa Barat");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1011");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_banten_rumah_badui);
		valuesEnsiklopedia.put("nama", "Rumah Badui");
		valuesEnsiklopedia.put("keterangan", "Rumah Badui merupakan rumah adat dari suku Badui (Banten). Rumah khas suku Badui ini dibangun menghadap ke utara dan selatan sebab arah barat juga timur dianggap tak baik dalam kehidupan. Hal lain yang cukup mencolok dari pemukiman orang Badui adalah harmonisasi antara lingkungan dan masyarakat. Mereka tak mengubah alam sesuai dengan kepentingan mereka.");
		valuesEnsiklopedia.put("propinsi", "Banten");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1012");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_jateng_joglo);
		valuesEnsiklopedia.put("nama", "Rumah Joglo");
		valuesEnsiklopedia.put("keterangan", "Rumah Joglo merupakan bangunan arsitektur tradisional Jawa Tengah, rumah joglo mempunyai kerangka bangunan utama yang terdiri dari soko guru berupa empat tiang utama penyangga struktur bangunan serta tumpang sari yang berupa susunan balok yang disangga soko guru.");
		valuesEnsiklopedia.put("propinsi", "Jawa Tengah");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1013");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_jogjakarta_bangsal_kencono_dan_rumah_joglo);
		valuesEnsiklopedia.put("nama", "Bangsal Kencono");
		valuesEnsiklopedia.put("keterangan", "Bangsal Kencono adalah rumah yang berbentuk padepokan. Rumah ini memiliki halaman yang luasnya 14000m2. Di halaman tersebut banyak terdapat sangkar burung dan tanaman yang menghiasi. Saat ana memasuki bangsal Kencono, anda akan menemukan dua buat patung yang terkenal dengan sebutan bupolo. Patung tersebut menggenggam sebuah pemukul atau biasa disebut gada.");
		valuesEnsiklopedia.put("propinsi", "DI Yogyakarta");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1014");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_jatim_rumah_joglo_situbondo);
		valuesEnsiklopedia.put("nama", "Rumah Joglo Situbondo");
		valuesEnsiklopedia.put("keterangan", "Rumah Joglo Situbondo merupakan bangunan arsitektur tradisional Situbondo, Jawa Timur, rumah joglo mempunyai kerangka bangunan utama yang terdiri dari soko guru berupa empat tiang utama penyangga struktur bangunan serta tumpang sari yang berupa susunan balok yang disangga soko guru.");
		valuesEnsiklopedia.put("propinsi", "Jawa Timur");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1015");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_bali_rumah_gapura_candi_bentar);
		valuesEnsiklopedia.put("nama", "Rumah Gapura Candi Bentar");
		valuesEnsiklopedia.put("keterangan", "Gapura Candi Bentar merupakan nama dari rumah adat Bali. Pengambilan nama Gapura Candi Bentar berdasar dari bentuk bangunannya yaitu berupa gapura. Gapura tersebut terdiri dari 2 bangunan candi dibangun sejajar dan serupa yang merupakan gerbang pintu masuk kepekarangan rumah. Gapura tersebut tidak memiliki atap atas yang memisahkan kedua bangunan candi, sehingga kedua bangunan gapura candi tersebut terlihat tampak jelas terpisah, yang menghubungkan bangunan gapura tersebut adalah berupa anak-anak tangga dan pagar besi yang menjadi pintu jalan masuk. Disekitar bangunan gapura terdapat patung-patung yang merupakan simbol dari kebudayaan Bali.");
		valuesEnsiklopedia.put("propinsi", "Bali");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1016");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_ntb_rumah_istana_sultan_sumbawa);
		valuesEnsiklopedia.put("nama", "Rumah Istana Sumbawa");
		valuesEnsiklopedia.put("keterangan", "Rumah Istana Sumbawa atau disebut juga Dalam Loka merupakan rumah adat dari Nusa Tenggara Barat (NTB,) rumah adat ini didirikan dan dikembangkan oleh pemerintahan Sultan Muhammad Jalaluddin Syah III di Pulau Sumbawa, tepatnya di kota Sumbawa Besar. Terdapat pengertian dari Dalam Loka itu sendiri, yaitu kata “Dalam” yang memiliki arti istana atau rumah yang ada di dalam istana dan “Loka” yang memiliki arti dunia atau juga tempat. Sehingga dapat disimpulkan pengertian Dalam Loka merupakan istana atau tempat hunian raja. Namun, penggunaan rumah adat Dalam Loka saat ini difungsikan untuk menyimpan benda atau artifak bersejarah milik Kabupaten Sumbawa.");
		valuesEnsiklopedia.put("propinsi", "Nusa Tenggara Barat (NTB)");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1017");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_ntt_rumah_musalaki);
		valuesEnsiklopedia.put("nama", "Rumah Musalaki");
		valuesEnsiklopedia.put("keterangan", "Rumah Musalaki adalah rumah adat Nusa Tenggara Timur, rumah ini merupakan tempat tinggal Lurah, Camat, atau pembesar lainnya. Rumah ini berbentuk panggung, di bawahnya terdapat balai panjang tempat menerima tamu. Tiang-tiangnya berdiri di atas batu besar sehingga tidak perlu ditanam di dalam tanah. Atapnya terbuat dari jerami.");
		valuesEnsiklopedia.put("propinsi", "Nusa Tenggara Timur (NTT)");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		
		valuesEnsiklopedia.put("id", "1018");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_kalbar_rumah_istana_kesultanan_pontianak);
		valuesEnsiklopedia.put("nama", "Rumah Istana Kesultanan Kadriah Pontianak");
		valuesEnsiklopedia.put("keterangan", "Istana Kesultanan Kadriah berasal dari Pontianak, provinsi Kalimantan Barat, ini pada awalnya dibangun pada tahun 1771 dan selalu senantiasa dibangun sambil direnovasi hingga resmi selesai pada tahun 1778. Istana ini terletak tidak jauh dari Masjid Jami, masjid yang cukup menjadi ikon di Pontianak mungkin jaraknya tidak lebih dari 300 meter. Lokasinya dekat jalan Tritura, yang merupakan pertemuan dari 3 sungai. ");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Barat");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1019");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_kalteng_rumah_betang);
		valuesEnsiklopedia.put("nama", "Rumah Betang");
		valuesEnsiklopedia.put("keterangan", "Rumah Betang adalah rumah adat khas Kalimantan Tengah yang terdapat diberbagai penjuru Kalimantan dan dihuni oleh masyarakat Dayak terutama di daerah hulu sungai yang biasanya menjadi pusat pemukiman suku Dayak.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Tengah");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1020");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_kalsel_rumah_banjar_bubungan_tinggi);
		valuesEnsiklopedia.put("nama", "Rumah Banjar Bubungan Tinggi");
		valuesEnsiklopedia.put("keterangan", "Rumah Bubungan Tinggi adalah salah satu jenis rumah Baanjung yaitu rumah tradisional suku Banjar (disebut rumah Banjar) di Kalimantan Selatan dan bisa dibilang merupakan ikonnya Rumah Banjar karena jenis rumah inilah yang paling terkenal karena menjadi maskot rumah adat khas provinsi Kalimantan Selatan. Di dalam kompleks keraton Banjar dahulu kala bangunan rumah Bubungan Tinggi merupakan pusat atau sentral dari keraton yang menjadi istana kediaman raja (bahasa Jawa: kedhaton) yang disebut Dalam Sirap (bahasa Jawa: ndalem) yang dahulu tepat di depan rumah tersebut dibangun sebuah Balai Seba pada tahaun 1780 pada masa pemerintahan Panembahan Batuah.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Selatan");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1021");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_kaltim_rumah_lamin);
		valuesEnsiklopedia.put("nama", "Rumah Lamin");
		valuesEnsiklopedia.put("keterangan", "Rumah Lamin adalah rumah adat dari Kalimantan Timur. Rumah Lamin adalah identitas masyarakat Dayak di Kalimantan Timur. Rumah Lamin mempunyai panjang sekitar 300 meter, lebar 15 meter, dan tinggi kurang lebih 3 meter. Rumah Lamin juga dikenal sebagai rumah panggung yang panjang dari sambung menyambung. Rumah ini dapat ditinggal oleh beberapa keluarga karena ukuran rumah yang cukup besar. Salah satu rumah Lamin yang berada di Kalimantan Timur bahkan dihuni oleh 12 sampai 30 kelurga. Rumah Lamin dapat menampung kurang lebih 100 orang. Pada tahun 1967, rumah Lamin diresmikan oleh pemerintah Indonesia.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Timur");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1022");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sulut_rumah_pewaris);
		valuesEnsiklopedia.put("nama", "Rumah Pewaris");
		valuesEnsiklopedia.put("keterangan", "Rumah Pewaris atau Walewangkoa merupakan rumah adat suku Minahasa dari Provinsi Sulawesi Utara. Rumah ini merupakan rumah panggung yang dibangun di atas tiang dan balok-balok yang di antaranya terdapat balok-balok yang tidak boleh disambung. Selain itu, rumah Pewaris memiliki 2 buah tangga.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Utara");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1023");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sulbar_rumah_tongkonan);
		valuesEnsiklopedia.put("nama", "Rumah Tongkonan");
		valuesEnsiklopedia.put("keterangan", "Tongkonan adalah rumah adat masyarakat Toraja, Sulawesi Barat. Atapnya melengkung menyerupai perahu, terdiri atas susunan bambu (saat ini sebagian tongkonan menggunakan atap seng). Di bagian depan terdapat deretan tanduk kerbau. Bagian dalam ruangan dijadikan tempat tidur dan dapur. Tongkonan digunakan juga sebagai tempat untuk menyimpan mayat.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Barat");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1024");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sulteng_rumah_tambi);
		valuesEnsiklopedia.put("nama", "Rumah Tambi");
		valuesEnsiklopedia.put("keterangan", "Rumah Adat Tambi adalah rumah adat dari Sulawesi Tengah. Merupakan rumah tempat tinggal raja, para bangsawan maupun rakyat biasa. Yang membedakan rumah adat para bangsawan dengan rumah adat yang dihuni oleh masyarakat biasa terletak pada bentuk bumbungan rumah. Bumbungan atap rumah adat (Tambi) yang ditinggali oleh para bangsawan dipasangkan tanduk kerbau, sedangkan rumah adat milik rakyat biasa tidak menggunakan tanduk kerbau di bagian atas atapnya.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Tengah");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1025");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sultra_rumah_istana_buton_malige);
		valuesEnsiklopedia.put("nama", "Rumah Istana Buton Malige");
		valuesEnsiklopedia.put("keterangan", "Rumah Istana Buton Malige merupakan rumah adat asal Sulawesi Tenggara.  Bangunan ini merupakan bangunan di atas tiang, dan seluruhnya dari bahan kayu. Bangunannya terdiri dari empat tingkat atau empat lantai. Ruang lantai pertama lebih luas dari lantai kedua. Sedangkan lantai keempat lebih besar dari lantai ketiga, jadi makin ke atas makin kecil atau sempit ruangannya, tapi di lantai keempat sedikit lebih melebar. Seluruh bangunan tanpa memakai paku dalam pembuatannya, melainkan memakai pasak atau paku kayu. Tiang-tiang depan terdiri dari 5 buah yang berjajar ke belakang sampai delapan deret, hingga jumlah seluruhnya adalah 40 buah tiang.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Tenggara");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1026");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sulsel_rumah_tongkonan);
		valuesEnsiklopedia.put("nama", "Rumah Tongkonan Sulsel");
		valuesEnsiklopedia.put("keterangan", "Tongkonan merupakan warisan rumah adat Sulawesi Selatan. Tongkonan adalah rumah adat masyarakat Toraja. Atapnya melengkung menyerupai perahu atau tanduk kerbau, terdiri atas susunan bambu. Di bagian depan terdapat deretan tanduk kerbau. Atapnya ditutupi dengan ijuk hitam, sedangkan bagian bawah biasanya dipergunakan sebagai kandang kerbau. Bagian dalam ruangan dijadikan tempat tidur dan dapur. Uniknya rumah tongkonan ini dibuat tanpa mempergunakan bahan dari logam. Rumah adat tongkonan ini akan dibangun berjajar menghadap ke arah utara. Di depan tongkonan terdapat lumbung padi, yang disebut ‘alang‘.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Selatan");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1027");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_gorontalo_rumah_dulohupa_dan_rumah_pewaris);
		valuesEnsiklopedia.put("nama", "Rumah Dulohupa");
		valuesEnsiklopedia.put("keterangan", "Rumah adat Dulohupa terletak di propinsi Gorontalo. Rumah adat ini berbentuk rumah panggung yang badannya terbuat dari papan dan struktur atap bernuansa daerah Gorontalo. Selain itu rumah adat Dulohupa juga dilengkapi pilar-pilar kayu sebagai hiasan serta lambang dari rumah adat Gorontalo dan memiliki dua tangga yang berada di bagian kiri dan kanan rumah adat yang menjadi symbol tangga adat atau disebut tolitihu.");
		valuesEnsiklopedia.put("propinsi", "Gorontalo");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1028");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_maluku_rumah_baileo);
		valuesEnsiklopedia.put("nama", "Rumah Baileo");
		valuesEnsiklopedia.put("keterangan", "Rumah Baileo adalah rumah adat Maluku dan Maluku Utara, Indonesia. Rumah Baileo merupakan representasi kebudayaan Maluku dan memiliki fungsi yang sangat penting bagi kehidupan masyarakat. Rumah Baileo adalah identitas setiap negeri di Maluku selain Masjid atau Gereja. Baileo berfungsi sebagai tempat penyimpanan benda-benda suci, tempat upacara adat, sekaligus sebagai balai warga. Ciri utama rumah Baileo adalah ukurannya besar, dan memiliki bentuk yang berbeda jika dibandingkan dengan rumah-rumah lain di sekitarnya.");
		valuesEnsiklopedia.put("propinsi", "Maluku");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1029");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_maluku_utara_rumah_baileo);
		valuesEnsiklopedia.put("nama", "Rumah Baileo Maluku utara");
		valuesEnsiklopedia.put("keterangan", "Rumah Baileo adalah rumah adat Maluku dan Maluku Utara, Indonesia. Rumah Baileo merupakan representasi kebudayaan Maluku dan memiliki fungsi yang sangat penting bagi kehidupan masyarakat. Rumah Baileo adalah identitas setiap negeri di Maluku selain Masjid atau Gereja. Baileo berfungsi sebagai tempat penyimpanan benda-benda suci, tempat upacara adat, sekaligus sebagai balai warga. Ciri utama rumah Baileo adalah ukurannya besar, dan memiliki bentuk yang berbeda jika dibandingkan dengan rumah-rumah lain di sekitarnya.");
		valuesEnsiklopedia.put("propinsi", "Maluku Utara");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1030");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_papua_barat_rumah_honai);
		valuesEnsiklopedia.put("nama", "Rumah Honai Papua Barat");
		valuesEnsiklopedia.put("keterangan", "Rumah Hanoi merupakan rumah adat Papua dan Papua Barat. Rumah ini terbuat dari kayu dengan atap berbentuk kerucut yang terbuat dari jerami atau ilalang. Honai sengaja dibangun sempit atau kecil dan tidak berjendela yang bertujuan untuk menahan hawa dingin pegunungan Papua. Honai biasanya dibangun setinggi 2,5 meter dan pada bagian tengah rumah disiapkan tempat untuk membuat api unggun untuk menghangatkan diri. Rumah Honai terbagi dalam tiga tipe, yaitu untuk kaum laki-laki (disebut Honai), wanita (disebut Ebei), dan kandang babi (disebut Wamai).");
		valuesEnsiklopedia.put("propinsi", "Papua Barat");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1031");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_papua_rumah_honai);
		valuesEnsiklopedia.put("nama", "Rumah Honai ");
		valuesEnsiklopedia.put("keterangan", "Rumah Hanoi merupakan rumah adat Papua dan Papua Barat. Rumah ini terbuat dari kayu dengan atap berbentuk kerucut yang terbuat dari jerami atau ilalang. Honai sengaja dibangun sempit atau kecil dan tidak berjendela yang bertujuan untuk menahan hawa dingin pegunungan Papua. Honai biasanya dibangun setinggi 2,5 meter dan pada bagian tengah rumah disiapkan tempat untuk membuat api unggun untuk menghangatkan diri. Rumah Honai terbagi dalam tiga tipe, yaitu untuk kaum laki-laki (disebut Honai), wanita (disebut Ebei), dan kandang babi (disebut Wamai).");
		valuesEnsiklopedia.put("propinsi", "Papua");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		// end isi ensiklopedia kategori rumah adat
		
		
		// isi ensiklopedia kategori pakaian adat
		// isi ensiklopedia kategori rumah adat
		valuesEnsiklopedia.put("id", "1001");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_nad_rumah_krong_bade);
		valuesEnsiklopedia.put("nama", "Rumah Krong Bade");
		valuesEnsiklopedia.put("keterangan", "Rumah Adat Propinsi Nangro Aceh Darussalam adalah Rumah Krong Bade");
		valuesEnsiklopedia.put("propinsi", "Aceh (Nangro Aceh Darussalam)");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		

		valuesEnsiklopedia.put("id", "1002");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sumbar_rumah_gadang);
		valuesEnsiklopedia.put("nama", "Rumah Gadang");
		valuesEnsiklopedia.put("keterangan", "Propinsi Sumatera Barat memiliki rumah adat yang diberi nama yaitu: Rumah Gadang.");
		valuesEnsiklopedia.put("propinsi", "Sumatera Barat");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1003");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_riau_rumah_melayu_selaso_jatuh_kembar);
		valuesEnsiklopedia.put("nama", "Rumah Melayu Selaso Jatuh Kembar");
		valuesEnsiklopedia.put("keterangan", "Propinsi Riau memiliki rumah adat yang diberi nama yaitu: Rumah Melayu Selaso Jatuh Kembar.");
		valuesEnsiklopedia.put("propinsi", "Riau");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1004");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_jambi_rumah_panjang);
		valuesEnsiklopedia.put("nama", "Rumah Panjang");
		valuesEnsiklopedia.put("keterangan", "Propinsi Jambi memiliki rumah adat yang diberi nama yaitu: Rumah Panjang.");
		valuesEnsiklopedia.put("propinsi", "Jambi");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1005");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sumsel_rumah_limas);
		valuesEnsiklopedia.put("nama", "Rumah Limas");
		valuesEnsiklopedia.put("keterangan", "Propinsi Sumatera Selatan memiliki rumah adat yang diberi nama yaitu: Rumah Limas.");
		valuesEnsiklopedia.put("propinsi", "Sumatera Selatan");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1006");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_bangkabelitung_rumah_rakit_rumah_limas);
		valuesEnsiklopedia.put("nama", "Rumah Rakit , Rumah Limas");
		valuesEnsiklopedia.put("keterangan", "Propinsi Bangka Belitung memiliki rumah adat yang diberi nama yaitu: Rumah Rakit, Rumah Limas.");
		valuesEnsiklopedia.put("propinsi", "Bangka Belitung");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1007");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_bengkulu_rumah_rakyat);
		valuesEnsiklopedia.put("nama", "Rumah Rakyat");
		valuesEnsiklopedia.put("keterangan", "Propinsi Bengkulu memiliki rumah adat yang diberi nama yaitu: Rumah Rakyat.");
		valuesEnsiklopedia.put("propinsi", "Bengkulu");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1008");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_lampung_nowou_sesat);
		valuesEnsiklopedia.put("nama", "Nowou Sesat");
		valuesEnsiklopedia.put("keterangan", "Propinsi Lampung memiliki rumah adat yang diberi nama yaitu: Nowou Sesat.");
		valuesEnsiklopedia.put("propinsi", "Lampung");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1009");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_jakarta_rumah_kebaya);
		valuesEnsiklopedia.put("nama", "Rumah Kebaya");
		valuesEnsiklopedia.put("keterangan", "Propinsi DKI Jakarta memiliki rumah adat yang diberi nama yaitu: Rumah Kebaya.");
		valuesEnsiklopedia.put("propinsi", "DKI Jakarta");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1010");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_jabar_rumah_kesepuhan_cirebon);
		valuesEnsiklopedia.put("nama", "Rumah Kesepuhan Cirebon");
		valuesEnsiklopedia.put("keterangan", "Propinsi Jawa Barat memiliki rumah adat yang diberi nama yaitu: Rumah Kesepuhan Cirebon.");
		valuesEnsiklopedia.put("propinsi", "Jawa Barat");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1011");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_banten_rumah_badui);
		valuesEnsiklopedia.put("nama", "Rumah Badui");
		valuesEnsiklopedia.put("keterangan", "Propinsi Banten memiliki rumah adat yang diberi nama yaitu: Rumah Badui.");
		valuesEnsiklopedia.put("propinsi", "Banten");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1012");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_jateng_joglo);
		valuesEnsiklopedia.put("nama", "Rumah Joglo");
		valuesEnsiklopedia.put("keterangan", "Propinsi Jawa Tengah memiliki rumah adat yang diberi nama yaitu: Rumah Joglo.");
		valuesEnsiklopedia.put("propinsi", "Jawa Tengah");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1013");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_jogjakarta_bangsal_kencono_dan_rumah_joglo);
		valuesEnsiklopedia.put("nama", "Bangsal Kencono dan Rumah Joglo");
		valuesEnsiklopedia.put("keterangan", "Propinsi DI Yogyakarta memiliki rumah adat yang diberi nama yaitu: Rumah Joglo dan Bangsal Kencono.");
		valuesEnsiklopedia.put("propinsi", "DI Yogyakarta");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1014");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_jatim_rumah_joglo_situbondo);
		valuesEnsiklopedia.put("nama", "Rumah Joglo Situbondo");
		valuesEnsiklopedia.put("keterangan", "Propinsi Jawa Timur memiliki rumah adat yang diberi nama yaitu: Rumah Joglo Situbondo.");
		valuesEnsiklopedia.put("propinsi", "Jawa Timur");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1015");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_bali_rumah_gapura_candi_bentar);
		valuesEnsiklopedia.put("nama", "Rumah Gapura Candi Bentar");
		valuesEnsiklopedia.put("keterangan", "Propinsi Bali memiliki rumah adat yang diberi nama yaitu: Rumah Gapura Candi Bentar.");
		valuesEnsiklopedia.put("propinsi", "Bali");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1016");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_ntb_rumah_istana_sultan_sumbawa);
		valuesEnsiklopedia.put("nama", "Rumah Istana Sultan Sumbawa");
		valuesEnsiklopedia.put("keterangan", "Propinsi Nusa Tenggara Barat (NTB) memiliki rumah adat yang diberi nama yaitu: Rumah Istana Sultan Sumbawa.");
		valuesEnsiklopedia.put("propinsi", "Nusa Tenggara Barat (NTB)");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1017");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_ntt_rumah_musalaki);
		valuesEnsiklopedia.put("nama", "Rumah Musalaki");
		valuesEnsiklopedia.put("keterangan", "Propinsi Nusa Tenggara Timur (NTT) memiliki rumah adat yang diberi nama yaitu: Rumah Musalaki.");
		valuesEnsiklopedia.put("propinsi", "Nusa Tenggara Timur (NTT)");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		
		valuesEnsiklopedia.put("id", "1018");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_kalbar_rumah_istana_kesultanan_pontianak);
		valuesEnsiklopedia.put("nama", "Rumah Istana Kesultanan Pontianak");
		valuesEnsiklopedia.put("keterangan", "Propinsi Kalimantan Barat memiliki rumah adat yang diberi nama yaitu: Rumah Istana Kesultanan Pontianak.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Barat");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "1019");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_kalteng_rumah_betang);
		valuesEnsiklopedia.put("nama", "Rumah Betang");
		valuesEnsiklopedia.put("keterangan", "Propinsi Kalimantan Tengah memiliki rumah adat yang diberi nama yaitu: Rumah Betang.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Tengah");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1020");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_kalsel_rumah_banjar_bubungan_tinggi);
		valuesEnsiklopedia.put("nama", "Rumah Banjar Bubungan Tinggi");
		valuesEnsiklopedia.put("keterangan", "Propinsi Kalimantan Selatan memiliki rumah adat yang diberi nama yaitu: Rumah Banjar Bubungan Tinggi.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Selatan");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1021");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_kaltim_rumah_lamin);
		valuesEnsiklopedia.put("nama", "Rumah Lamin");
		valuesEnsiklopedia.put("keterangan", "Propinsi Kalimantan Timur memiliki rumah adat yang diberi nama yaitu: Rumah Lamin.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Timur");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1022");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sulut_rumah_pewaris);
		valuesEnsiklopedia.put("nama", "Rumah Pewaris");
		valuesEnsiklopedia.put("keterangan", "Propinsi Sulawesi Utara memiliki rumah adat yang diberi nama yaitu: Rumah Pewaris.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Utara");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1023");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sulbar_rumah_tongkonan);
		valuesEnsiklopedia.put("nama", "Rumah Tongkonan");
		valuesEnsiklopedia.put("keterangan", "Propinsi Sulawesi Barat memiliki rumah adat yang diberi nama yaitu: Rumah Tongkonan.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Barat");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1024");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sulteng_rumah_tambi);
		valuesEnsiklopedia.put("nama", "Rumah Tambi");
		valuesEnsiklopedia.put("keterangan", "Propinsi Sulawesi Tengah memiliki rumah adat yang diberi nama yaitu: Rumah Tambi.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Tengah");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1025");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sultra_rumah_istana_buton_malige);
		valuesEnsiklopedia.put("nama", "Rumah Istana Buton Malige");
		valuesEnsiklopedia.put("keterangan", "Propinsi Sulawesi Tenggara memiliki rumah adat yang diberi nama yaitu: Rumah Istana Buton Malige.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Tenggara");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1026");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_sulsel_rumah_tongkonan);
		valuesEnsiklopedia.put("nama", "Rumah Tongkonan Sulsel");
		valuesEnsiklopedia.put("keterangan", "Propinsi Sulawesi Selatan memiliki rumah adat yang diberi nama yaitu: Rumah Tongkonan.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Selatan");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1027");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_gorontalo_rumah_dulohupa_dan_rumah_pewaris);
		valuesEnsiklopedia.put("nama", "Rumah Dulohupa dan Rumah Pewaris");
		valuesEnsiklopedia.put("keterangan", "Propinsi Gorontalo memiliki rumah adat yang diberi nama yaitu: Rumah Dulohupa dan Rumah Pewaris.");
		valuesEnsiklopedia.put("propinsi", "Gorontalo");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1028");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_maluku_rumah_baileo);
		valuesEnsiklopedia.put("nama", "Rumah Baileo");
		valuesEnsiklopedia.put("keterangan", "Propinsi Maluku memiliki rumah adat yang diberi nama yaitu: Rumah Baileo.");
		valuesEnsiklopedia.put("propinsi", "Maluku");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1029");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_maluku_utara_rumah_baileo);
		valuesEnsiklopedia.put("nama", "Rumah Baileo Maluku utara");
		valuesEnsiklopedia.put("keterangan", "Propinsi Maluku Utara memiliki rumah adat yang diberi nama yaitu: Rumah Baileo.");
		valuesEnsiklopedia.put("propinsi", "Maluku Utara");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1030");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_papua_barat_rumah_honai);
		valuesEnsiklopedia.put("nama", "Rumah Honai Papua Barat");
		valuesEnsiklopedia.put("keterangan", "Propinsi Papua Barat memiliki rumah adat yang diberi nama yaitu: Rumah Honai.");
		valuesEnsiklopedia.put("propinsi", "Papua Barat");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "1031");
		valuesEnsiklopedia.put("gambar", R.drawable.ra_papua_rumah_honai);
		valuesEnsiklopedia.put("nama", "Rumah Honai ");
		valuesEnsiklopedia.put("keterangan", "Propinsi Papua  memiliki rumah adat yang diberi nama yaitu: Rumah Honai.");
		valuesEnsiklopedia.put("propinsi", "Papua");
		valuesEnsiklopedia.put("kategori", "Rumah Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		// end isi ensiklopedia kategori rumah adat
		
		

		// isi ensiklopedia kategori pakaian adat
		valuesEnsiklopedia.put("id", "2001");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_papuabarat_ewer);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Ewer Papua Barat");
		valuesEnsiklopedia.put("keterangan", "Pakaian Ewer merupakan pakaian adat dari Papua Barat. Pakaian ini memiliki bentuk yang hamir sama antara laki-laki dan perempuan. Hiasan didada dan kepala juga mereka biasanya berupa kalung, gelang, hiasan burung cendrawasih pada bagian kepala dan lain sebagainya.");
		valuesEnsiklopedia.put("propinsi", "Papua Barat");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2002");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_papua_pakaian_adat);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Papua");
		valuesEnsiklopedia.put("keterangan", "Pakaian Papua merupakan pakaian adat dari Papua. Pakaian yang dikenakan laki-laki dan perempuan di Papua hampir sama bentuknya. Mereka memakai baju dan penutup badan bagian bawah dengan model yang sama. Mereka juga sama-sama memakai hiasan kepala berupa burung cendrawasih, gelang, kalung, dan ikat pinggang dari manik-manik, serta rumbai-rumbai pada pergelangan kaki. Dengan tombak/panah dan perisai yang dipegang mempelai laki-laki menambah kesan dari adat Papua.");
		valuesEnsiklopedia.put("propinsi", "Papua");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2003");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_gorontalo_biliu_makutu);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Biliu dan Mukuta");
		valuesEnsiklopedia.put("keterangan", "Pakaian Biliu dan Mukuta adalah pakaian adat istiadat daerah Gorontalo. Dalam acara pernikahan pakaian daerah khas Gorontalo disebut Biliu (pakaian pengantin putri) dan Mukuta (pakaian pengantin putra). Pakaian adat Gorontalo umumnya mempunyai tiga warna dan memiliki arti tertentu yaitu warna ungu, warna kuning keemasan, dan warna hijau. Selain itu dalam upacara pernikahan adat Gorontalo, masyarakat hanya menggunakan empat warna utama, yaitu merah, hijau, kuning emas, dan ungu. Warna merah dalam masyarakat adat Gorontalo bermakna keberanian dan tanggung jawab, warna hijau bermakna kesuburan, kesejahteraan, kedamaian, dan kerukunan, warna kuning emas bermakna kemuliaan, kesetian, kebesaran, dan kejujuran, sedangkan warna ungu bermakna keanggunanan dan kewibawaan.");
		valuesEnsiklopedia.put("propinsi", "Gorontalo");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2004");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_sulsel_bodo);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Bodo");
		valuesEnsiklopedia.put("keterangan", "Pakaian Bodo merupakan pakaian adat dari daerah Bugis, Sulawesi Selatan. Baju Bodo berbentuk segi empat, biasanya berlengan pendek, yaitu setengah atas bagian siku lengan. Baju Bodo juga dikenali sebagai salah satu busana tertua di dunia");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Selatan");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2005");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_sulut_kulavi);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Kulavi");
		valuesEnsiklopedia.put("keterangan", "Pakaian Kulavi merupakan pakaian adat dari Sulawesi Utara. Untuk pria biasanya terletak pada motif hiasan di dada dan penutup kepala mereka, untuk wanita biasanya terletak pada hiasan di kepala serta gelang yang dipakainya.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Utara");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2006");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_sultenggara_sukutolaki);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Suku Tolaki");
		valuesEnsiklopedia.put("keterangan", "Pakaian Tolaki merupakan pakaian adat dari masyarakat Tolaki, Sulawesi Tenggara. Pakaian ini dibuat menggunakan bahan kulit kayu bernama Kinawo. Masyarakat Tolaki selalu memperhitungkan kebutuhan zaman, fungsi, tujuan, kelompok usia, bahkan status sosial dari pemakainya.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Tenggara");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2007");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_sultengah_nggembe);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Nggembe");
		valuesEnsiklopedia.put("keterangan", "Pakaian Nggembe merupakan pakaian adat dari Sulawesi Tengah. Busana ini biasanya dipakai saat upacara adat atau pesta. Baju Nggembe berbentuk segi empat, berkerah bulat berlengan selebar kain, panjang blus sampai pinggang dan berbentuk longgar.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Tengah");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2008");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_sulawsibarat_mandar);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Mandar");
		valuesEnsiklopedia.put("keterangan", "Pakaian Mandar merupakan pakaian adat dari Sulawesi Barat. Lipa Saqbe Mandar (Sarung Sutra Mandar) sepintas memiliki persamaan dengan kain sutra daerah lain, tapi di setiap jenis dan nama Lipa Saqbe Mandar memiliki ciri khas khusus yakni dari segi corak (sure’ ataupun bunga) dan cara pembuatannya, yang membuatnya terkenal ke daerah sekitarnya (bugis dan makassar).");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Barat");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2009");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_ntb_lombok);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Lombok");
		valuesEnsiklopedia.put("keterangan", "Pakaian tradisional Lombok merupakan pakaian adat dari Nusa Tenggara Barat. Pakaian adat ini biasanya digunakan saat ada upacara keagamaan atau menyambut hari besar.");
		valuesEnsiklopedia.put("propinsi", "Nusa Tenggara Barat (NTB)");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2010");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_ntt_ntt);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional NTT");
		valuesEnsiklopedia.put("keterangan", "Pakaian NTT merupakan pakaian adat dari Nusa Tenggara Timur. Ti’langga merupakan aksesoris dari pakaian tradisional untuk pria. Untuk wanita, biasanya mengenakan baju kebaya pendek dan bagain bawahnya mengenakan kain tenun.");
		valuesEnsiklopedia.put("propinsi", "Nusa Tenggara Timur (NTT)");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2011");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_maluku_utara_manteren_lamo);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Manteren Lamo");
		valuesEnsiklopedia.put("keterangan", "Pakaian Manteren Lamo (Sultan) merupakan pakaian adat dari Maluku Utara. Pakaian ini terdiri atas celana panjang hitam dengan bis merah memanjang dari atas ke bawah, baju berbentuk jas tertutup dengan kancing besar terbuat dari perak berjumlah sembilan . Sementara itu, leher jas, ujung tangan, dan saku jas yang terletak di bagian luar berwarna merah. Konon warna tersebut melambangkan keperkasaan dari pemakainya. Selain itu, penampilan busana yang dikenakan oleh sultan tersebut dilengkapi dengan Destar untuk menutup kepala. Busana yang dikenakan oleh istri sultan terdiri atas kebaya panjang atau Kimun Gia, yang terbuat dari kain satin berwarna putih dengan pengikat pinggang yang terbuat dari emas, serta kain panjang. Perhiasan lainnya yang dikenakan oleh permaisuri tersebut meliputi kalung, bros, dan peniti yang terbuat dari intan, berlian, atau emas. Di samping itu, mereka juga mengenakan hiasan lainnya yang berupa konde yang berukuran besar, sedangkan konde kecil biasanya dipakai oleh pembantu permaisuri.");
		valuesEnsiklopedia.put("propinsi", "Maluku Utara");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2012");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_maluku_baju_cele);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Baju Cele");
		valuesEnsiklopedia.put("keterangan", " Baju Cele merupakan pakaian khas dari kota Ambon, Maluku. Baju Cel e bermotif garis-garis geometris atau berkotak-kotak kecil. Biasanya, baju Cele  dikombinasikan dengan kain sarung yang warnanya tidak terlalu jauh berbeda, yang penting harus seimbang dan serasi. Baju cele  dipakai dalam upacara-upacara adat (acara pelantikan raja, acara cuci negeri, acara pesta negeri, acara panas pela, dan lain-lain.).");
		valuesEnsiklopedia.put("propinsi", "Maluku");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2013");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_bali_bali);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Bali");
		valuesEnsiklopedia.put("keterangan", "Pakaian adat bali setidaknya ada tiga jenis yang umum dikenakan oleh masyarakat Bali. Pertama, pakaian adat untuk upacara keagamaan. Kedua, pakaian adat untuk upacara pernikahan. Dan, ketiga adalah pakaian adat untuk aktivitas sehari-hari. Pakaian Adat khas Bali ini berbeda antara yang dipakai oleh laki-laki dan perempuan.");
		valuesEnsiklopedia.put("propinsi", "Bali");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2014");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_kalbar_perang);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Perang");
		valuesEnsiklopedia.put("keterangan", "Pakaian Adat Tradisional Perang merupakan pakaian adat dari Kalimantan Barat. Pakaian ini adalah pakaian yang digunakan sudah sejak dulu oleh masyarakat Kalimantan Barat. Pakaian adat trasional Kalimantan Barat berbahan kulit kayu yang diproses menjadi kain. Untuk bahan utama yang digunakan sebagai bahan pakaian adat tradisional Kalimantan Barat adalah kulit kayu kapuo atau ampuro. Kulit kayu tersebut dipukul termasuk di pukul di dalam air menggunakan pemukul yang berbentuk bulat. Kemampuan mengolah kulit kayu menjadi kain oleh masyarakat merupakan kemampuan yang secara turun temurun diturunkan oleh nenek moyang.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Barat");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2015");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_kaltengah_kaltengah);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Kalimantan Tengah");
		valuesEnsiklopedia.put("keterangan", "Suku Dayak Ngaju merupakan sebutan bagi penduduk yang mendiami wilayah Kalimantan Tengah. Kelengkapan pakaian tradisional yang dikenakan oleh kaum pria dalam adat Dayak Ngaju yaitu berupa rompi, kain penutup bagian bawah sebatas lutut, ikat kepala berhiaskan bulu-bulu enggang, kalung manik-manik dan ikat pinggang, serta tameng kayu beserta mandau dibagian pinggang. Sementara kelengkapan yang dikenakan oleh kaum wanita yaitu berupa baju rompi, kain (rok pendek), ikat atau penutup kepala yang dihiasi bulu-bulu enggang, kalung manik-manik, ikat pinggang serta gelang tangan.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Tengah");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2016");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_kalsel_pengantin_bagajah_gamuling_baular_lulut);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Pengantin Bagajah Gamuling Baular Lulut");
		valuesEnsiklopedia.put("keterangan", "Bagajah Gamuling Baular Lulut adalah nama Pakaian pengantin Banjar propinsi Kalimantan Selatan yang Asli yang pertama. Pakaian pengantin Banjar yang banyak dipengaruhi budaya Hindu yang terlihat begitu eksotik. Dipenuhi roncean bunga melati dan mawar yang disebut bogam, juga rangkaian melati yang sebut karang jagung Pasangan pengantin pun bermahkota Bagajah Gamuling Baular Lulut yang terbuat dari lingkaran logam bundar. Dibentuk menjadi badan dua ekor ular lidi dipertemukan menjadi satu yang bagian depannya diletakan 'amar' atau mahkota bertatahkan dua ekor ular naga berebut kumala yang terletak di antara dua kepala naga, sedangkan di bagian pertemuan ekor diletakan 'garuda mungkur paksi melayang'. Di sebelah kiri, kanan dan depan badan ular lidi diletakkan kembang goyang yang berjumlah ganjil baik pengantin wanita juga pria, pada beberapa bagian busana yang dikenakan berhias payet ditambah berbagai aksesori yang memperindah penampilannya, seperti pada sarung yang dikenakan dengan motif khas bintang 'halilipan'(kaki seribu) yang dihias sulaman benang emas, manik dan payet dengn ciri merayap ke bawah sebagai pelambang kecerdikan, sangat berbisa tetapi tidak pamer kehebatan.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Selatan");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2017");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_kaltim_kalimantantimur);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Kalimantan Timur");
		valuesEnsiklopedia.put("keterangan", "Selain dikenal dengan keindahan alam, kebudayaan serta adat istiadatnya, wilayah yang mayoritas dihuni oleh suku Dayak dan Kutai sebagai penduduk asli Kalimantan Timur juga memiliki kekayaan lain berupa pakaian adat tradisional. Bergantung fungsi dan penggunaannya masyarakat Kalimantan Timur biasa mengenakan pakaian khas daerah mereka untuk keperluan tertentu seperti saat upacara perkawinan, pertunjukan tarian, dan untuk acara lainnya.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Timur");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2018");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_kalutara_kalut);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Kalimantan Utara");
		valuesEnsiklopedia.put("keterangan", "Pakaian adat Kalimantan Utara hampir mirip dengan pakaian adat di Kalimantan Timur. Karena provinsi ini dulu termasuk kedalam provinsi Kalimantan Timur sehingga untuk suku bangsa dan kebudayannya pun mirip dengan Kalimantan timur. Pakaian adat pada pria mengenakan rompi tanpa lengan serta dililitkan kain hingga selutut. Dikepala dikenakan topi berhiaskan bulun burung. Sedangkan pakaian adat pada wanita menegnakan rompi yang bercorak khas Kalimantan tanpa lengan serta bagian bawahnya rok. Dikepalanya dihiasi topi yang unik.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Utara");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2019");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_jogja_kasatrian);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Kasatrian");
		valuesEnsiklopedia.put("keterangan", "Pakaian adat tradisional masyarakat Daerah Istimewa Yogyakarta terdiri dari seperangkat pakaian adat tradisional yang memiliki unsur-unsur yang tidak dapat dipisahkan satu dengan lainnya. Kelengkapan berbusana tersebut merupakan ciri khusus pemberi identitas bagi pemakainya yang meliputi fungsi dan peranannya. Oleh karena itu, cara berpakaian biasanya sudah dibakukan secara adat, kapan dikenakan, di man dikenakan, dan siapa yang mengenakannya.");
		valuesEnsiklopedia.put("propinsi", "DI Yogyakarta");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2020");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_banten_pangsi);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Pangsi");
		valuesEnsiklopedia.put("keterangan", "Pakaian Adat Tradisional dari Propinsi Banten yaitu Pakaian Adat Tradisional Pangsi. Pakaian ini biasa dikenakan oleh masyarakat Baduy. Masyarakat Baduy masih mengenakan pakaian adat tradisionalnya dalam kehidupan sehari-hari. Baduy Dalam sering mengenakan pakaian adat berwarna putih yang melambangkan kesucian. Sementara Baduy Luar mengenakan pakaian adat berwarna hitam.");
		valuesEnsiklopedia.put("propinsi", "Banten");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2021");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_jakarta_betawi);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Betawi");
		valuesEnsiklopedia.put("keterangan", "Pakaian Adat Tradisional dari Propinsi DKI Jakarta yaitu Pakaian Adat Tradisional Betawi. Dalam acara-acara resmi seperti pernikahan, hajatan, atau hari-hari besar, masyarakat suku betawi memiliki pakaian resmi yang terbilang sangat antik. Para pria mengenakan jas hitam dengan hiasan rantai emas di sakunya, celana dasar kain hitam yang dilengkapi dengan gubatan kain sarung pendek, serta peci hitam sebagai penutup kepala. Bagi para wanita, mereka mengenakan pakaian yang sebetulnya masih serupa dengan pakaian keseharian mereka yaitu kurung, kain batik bermotif geometri, serta kerudung berwarna cerah.");
		valuesEnsiklopedia.put("propinsi", "DKI Jakarta");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2022");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_jateng_kainkebaya);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Kain Kebaya");
		valuesEnsiklopedia.put("keterangan", "Pakaian Adat Tradisional dari Propinsi Jawa Tengah yaitu Pakaian Adat Tradisional Kain Kebaya. Kebaya terbuat dari bahan tipis yang dikenakan dengan sarung, batik, atau pakaian rajutan tradisional lainnya seperti songket dengan motif warna-warni.");
		valuesEnsiklopedia.put("propinsi", "Jawa Tengah");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2023");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_jawabarat_kebaya);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Kebaya Jawa Barat");
		valuesEnsiklopedia.put("keterangan", "Pakaian Adat Tradisional dari Propinsi Jawa Barat yaitu Pakaian Adat Tradisional Kebaya, sama seperti Jawa Tengah. Kain kebaya pada dasarnya digunakan perempuan di semua lapisan, baik rakyat biasan maupun bangsawan. Perbedaannya mungkin hanya pada bahan kebaya yang digunakan serta corak hiasnya. ");
		valuesEnsiklopedia.put("propinsi", "Jawa Barat");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2024");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_jatim_pesaan);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Pesa'an");
		valuesEnsiklopedia.put("keterangan", "Pakaian Adat Tradisional dari Propinsi Jawa Timur yaitu Pakaian Adat Tradisional Pesa'an. Pakaian ini lebih umum sering dipakai oleh warga madura, warna cerah dan kuat dalam busana madura digunakan sebagai perlambang karakter masyarakat Madura yang berani, tegas, tidak pernah ragu-ragu dan terbuka dalam menyampaikan pendapatnya. Sementara untuk bangsawan madura umumnya menggunakan jas tutup polos dan kain panjang, lengkap dengan atribut yang menunjukan derajat kebangsawanan seseorang yakni dengan pemakaian tutup kepala atau odheng.");
		valuesEnsiklopedia.put("propinsi", "Jawa Timur");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2025");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_riau_belangga);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Belanga");
		valuesEnsiklopedia.put("keterangan", "Pakaian Adat Tradisional dari Propinsi Kepulauan Riau yaitu Pakaian Adat Tradisional Belanga. Teluk Belanga merupakan pakaian adat tertinggi dalam susunan adat Melayu Kepulauan Riau. Baju ini memiliki motif polos, biasanya berwarna tidak terlalu mencolok, meskipun terkadang berwarna kuat seperti merah atau biru tetapi tetap terlihat teduh. Warna yang dipilih biasanya senada dengan celana yang dipakai. ");
		valuesEnsiklopedia.put("propinsi", "Kepulauan Riau");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2026");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_riau_indragiri);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Indragiri");
		valuesEnsiklopedia.put("keterangan", "Pakaian Adat Tradisional dari Propinsi Riau yaitu Pakaian Adat Tradisional Indragiri. Pakaian resmi ini digunakan diacara pertemuan resmi kerajaan, dan pada masa sekarang digunakan pada saat acara undangan pemerintahan, seperti undangan memperingati hari jadi Provinsi Riau, yang pada undangan selalu ditulis berbusana melayu.");
		valuesEnsiklopedia.put("propinsi", "Riau");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		
		valuesEnsiklopedia.put("id", "2027");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_bangkabelitung_paksian);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Paksian");
		valuesEnsiklopedia.put("keterangan", "Pakaian Adat Tradisional dari Propinsi Bangka Belitung yaitu Pakaian Adat Tradisional Paksian. Pakaian pengantin tradisional Bangka Belitung biasa disebut dengan nama Paksian. Pengantin perempuan biasanya memakai baju kurung berwarna merah yang berbahan kain sutra. Kepala mempelai wanita biasanya memakai mahkota yang biasa disebut dengan nama Paksian. Sedangkan pengantin pria menggunakan Sorban atau yang biasa disebut masyarakat Bangka Belitung sebagai Sungkon. ");
		valuesEnsiklopedia.put("propinsi", "Bangka Belitung");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2028");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_bengkulu_bengkulu);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Bengkulu");
		valuesEnsiklopedia.put("keterangan", "Pakaian adat Bengkulu yang dikenakan oleh pria terdiri atas jas, sarung, celana panjang, alas kaki yang dilengkapi dengan tutup kepala dan sebuah keris. Jas tersebut dari kain bermutu seperti wol dan sejenisnya dan biasanya berwarna gelap seperti hitam atau biru tua. Demikian pula untuk celananya terbuat dari bahan dan warna yang sama. Sementara, pakaian adat wanita Bengkulu mengenakan baju kurung berlengan panjang, bertabur corak-corak, sulaman emas berbentuk lempengan-lempengan bulat seperti uang logam. Bahan baju kurung umumnya beludru dalam warna-warna merah tua, biru tua, lembayung atau hitam. Sarung songket benang emas atau perak dalam warna serasi dari sutra merupakan perangkat busana yang dikenakan dari pinggang sampai dengan mata kaki.");
		valuesEnsiklopedia.put("propinsi", "Bengkulu");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2029");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_lampung_tulang_bawang);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Tulang Bawang");
		valuesEnsiklopedia.put("keterangan", "Pakaian Adat Tradisional dari Propinsi Lampung yaitu Pakaian Adat Tulang Bawang. Untuk busana adat kesehariannya laki-laki Lampung akan mengikat kepalanya dengan menggunakan kikat. Bahan kikat ini terbuat dari kain batik. Jika di kenakan dalam kerapatan adat akan dipadukan dengan pakaian teluk belanga serta kain. Kalau untuk mengiring pengantin akan dikenakan kekat akkin, semacam destar yang pada bagian tepinya dihias dengan bunga-bunga terbuat dari benang emas dan pada bagian tengah dengan berhiaskan siger, dan pada salah satu sudutnya ada sulaman benang emas yang berupa bunga tanjung atau bunga cengkeh. Sementara itu, untuk pakaian keseharian wanita Lampung mengenakan kanduk/kakambut yaitu berupa kudung untuk penutup kepala dengan cara dililitkan. Bahan kanduk atau kakambut ini terbuat dari kain halus yang tipis atau dari bahan sutera. Lawai kurung di pakai sebagai penutup badan dan bentuknya menyerupai Baju kurung. Busana ini dibuat dengan menggunakan bahan tipis ataupun kain sutra dan pada bagian tepi muka dan bagian lengan umumnya dihiasi dengan rajutan renda yang halus. ");
		valuesEnsiklopedia.put("propinsi", "Lampung");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		

		
		valuesEnsiklopedia.put("id", "2030");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_sumsel_palembang_aesangede);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Aesan Gede");
		valuesEnsiklopedia.put("keterangan", "Pakaian adat Sumatera Selatan sangat terkenal dengan sebutan Aesan gede yang melambangkan kebesaran.  Pakaian adat ini biasanya hanya digunakan saat upacara adat perkawinan.");
		valuesEnsiklopedia.put("propinsi", "Sumatera Selatan");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2031");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_jambi_melayu);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Melayu");
		valuesEnsiklopedia.put("keterangan", "Pakaian Adat Tradisional dari Propinsi Jambi yaitu Pakaian Adat Tradisional Melayu ");
		valuesEnsiklopedia.put("propinsi", "Jambi");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2032");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_sumbar_bundo);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Bundo Kanduang");
		valuesEnsiklopedia.put("keterangan", "Pakaian adat Sumatera Barat yang paling populer dalam adat minangkabau dikenal dengan nama Bundo Kanduang. Pakaian ini terdiri dari tingkolok (penutup kepala), baju kurung, kain selempang, kain sarung, serta perhiasan berupa kalung dan anting. Pakaian yang khusus diperuntukan bagi wanita yang telah diangkat menjadi bundo kanduang ini memiliki ciri khas penutup kepala yang disebut tingkolok. Tingkolok merupakan hiasan kepala perempuan yang berbentuk runcing dan bercabang menyerupai tanduk kerbau. Pemakaian tengkuluk digunakan sebagai perlambang perempuan sebagai pemilik rumah gadang.");
		valuesEnsiklopedia.put("propinsi", "Sumatera Barat");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2033");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_sumut_ulos);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Ulos");
		valuesEnsiklopedia.put("keterangan", "Pakaian adat tradisional Sumatera Utara adalah Ulos. Pakaian adat Ulos dianggap oleh masyarakat suku Batak Karo sebagai ajimat yang mempunyai daya magis tertentu.");
		valuesEnsiklopedia.put("propinsi", "Sumatera Utara");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		valuesEnsiklopedia.put("id", "2034");
		valuesEnsiklopedia.put("gambar", R.drawable.pa_aceh_ulee_balang);
		valuesEnsiklopedia.put("nama", "Pakaian Adat Tradisional Ulee Balang");
		valuesEnsiklopedia.put("keterangan", "Pakaian adat tradisional Aceh biasa adalah Ulee Balang, pakaian tersebut biasanya digunakan oleh para raja dan keluarganya.");
		valuesEnsiklopedia.put("propinsi", "Aceh (Nangro Aceh Darussalam)");
		valuesEnsiklopedia.put("kategori", "Pakaian Adat");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		// end isi ensiklopedia kategori pakaian adat
		
		// isi ensiklopedia kategori senjata tradisional
		valuesEnsiklopedia.put("id", "3001");
		valuesEnsiklopedia.put("gambar", R.drawable.st_nad_rencong);
		valuesEnsiklopedia.put("nama", "Rencong");
		valuesEnsiklopedia.put("keterangan", "Rencong merupakan senjata tradisional dari Nangro Aceh Darussalam. Rencong adalah senjata tajam belati Dari Indonesia tradisional Aceh. Bentuknya menyerupai huruf 'L', rencong termasuk dalam kategori belati yang berbeda dengan pisau atau pedang. Rencong memiliki kemiripan rupa dengan keris. Panjang mata pisau rencong dapat bervariasi dari 10 cm sampai 50 cm. Matau pisau tersebut dapat berlengkung seperti keris, namun dalam banyak rencong, dapat juga lurus seperti pedang. Rencong dimasukkan ke dalam sarung belati yang terbuat dari kayu, gading, tanduk, atau kadang-kadang logam perak atau emas. Dalam pembawaan, rencong diselipkan di antara sabuk di depan perut pemakai.");
		valuesEnsiklopedia.put("propinsi", "Aceh (Nangro Aceh Darussalam)");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3002");
		valuesEnsiklopedia.put("gambar", R.drawable.st_sumut_piso_surit_piso_gaja_dompak);
		valuesEnsiklopedia.put("nama", "Piso Surit Piso Gaja Dompak");
		valuesEnsiklopedia.put("keterangan", "Piso Surit Piso Gaja Dompak merupakan senjata tradisional dari Sumatera Utara. Piso Gaja Dompak adalah senjata tradisional yang berasal dari Sumatera Utara. Nama piso gaja dompak diambil dari kata piso yang berarti pisau yang berfungsi untuk memotong atau menusuk, dan bentuknya runcing dan tajam. Bernama gaja dompak karena  berarti ukiran berpenampang gajah pada tangkai senjata tersebut.");
		valuesEnsiklopedia.put("propinsi", "Sumatera Utara");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3003");
		valuesEnsiklopedia.put("gambar", R.drawable.st_sumbar_karih_ruduih_piarit);
		valuesEnsiklopedia.put("nama", "Karih Ruduih Piarit");
		valuesEnsiklopedia.put("keterangan", "Merupakan senjata tradisional yang sangat terkenal di Sumatera Barat, merupakan senjata tikam, di samping belati. Karih ini juga merupakan pelengkap pakaian adat kaum pria, yang bentuknya kecil seperti keris tetapi tidak berlekuk. Hulunya yang berukir agak melengkung ke bawah, sehingga lebih mudah untuk menggenggamnya.");
		valuesEnsiklopedia.put("propinsi", "Sumatera Barat");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3004");
		valuesEnsiklopedia.put("gambar", R.drawable.st_riau_pedang_jenawi_badik_tumbuk_lado);
		valuesEnsiklopedia.put("nama", "Pedang Jenawi Badik Tumbuk Lado");
		valuesEnsiklopedia.put("keterangan", "Pedang Jenawi merupakan senjata tradisional yang terkenal di Riau. Pedang ini biasanya dipergunakan oleh panglima perang, sedangkan para prajuritnya memakai klewang. Selain klewang para prajurit yang dipersenjatai pula dengan tombak. Ada pula senjata yang dinamakan Badik Tumbuk Lada. Badik ini mempunyai wilahan yang sama dengan keris, namun agak pendek. Badik digunakan untuk keperluan sehari-hari dan untuk berperang. Maka badik sering pula diberi zat yang mengandung racun. Telah pula diadatkan, bila badik telah ditarik dari sarungnya, maka haruslah ditikamkan. Bila sasarannya tidak ada, maka badik ditikamkan pada suatu benda atau binatang Barulah kemudian badik dimasukkan kembali pada sarungnya.");
		valuesEnsiklopedia.put("propinsi", "Riau");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3005");
		valuesEnsiklopedia.put("gambar", R.drawable.st_riau_pedang_jenawi_badik_tumbuk_lado);
		valuesEnsiklopedia.put("nama", "Pedang Jenawi Badik Tumbuk Lado");
		valuesEnsiklopedia.put("keterangan", "Pedang Jenawi merupakan senjata tradisional yang terkenal di Kepulauan Riau. Pedang ini biasanya dipergunakan oleh panglima perang, sedangkan para prajuritnya memakai klewang. Selain klewang para prajurit yang dipersenjatai pula dengan tombak. Ada pula senjata yang dinamakan Badik Tumbuk Lada. Badik ini mempunyai wilahan yang sama dengan keris, namun agak pendek. Badik digunakan untuk keperluan sehari-hari dan untuk berperang. Maka badik sering pula diberi zat yang mengandung racun. Telah pula diadatkan, bila badik telah ditarik dari sarungnya, maka haruslah ditikamkan. Bila sasarannya tidak ada, maka badik ditikamkan pada suatu benda atau binatang Barulah kemudian badik dimasukkan kembali pada sarungnya.");
		valuesEnsiklopedia.put("propinsi", "Kepulauan Riau");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3006");
		valuesEnsiklopedia.put("gambar", R.drawable.st_jambi_badik_tumbuk_lado);
		valuesEnsiklopedia.put("nama", "Badik Tumbuk Lada");
		valuesEnsiklopedia.put("keterangan", "Pedang Jenawi merupakan senjata tradisional yang terkenal di Jambi. Pedang ini biasanya dipergunakan oleh panglima perang, sedangkan para prajuritnya memakai klewang. Selain klewang para prajurit yang dipersenjatai pula dengan tombak. Ada pula senjata yang dinamakan Badik Tumbuk Lada. Badik ini mempunyai wilahan yang sama dengan keris, namun agak pendek. Badik digunakan untuk keperluan sehari-hari dan untuk berperang. Maka badik sering pula diberi zat yang mengandung racun. Telah pula diadatkan, bila badik telah ditarik dari sarungnya, maka haruslah ditikamkan. Bila sasarannya tidak ada, maka badik ditikamkan pada suatu benda atau binatang Barulah kemudian badik dimasukkan kembali pada sarungnya.");
		valuesEnsiklopedia.put("propinsi", "Jambi");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3007");
		valuesEnsiklopedia.put("gambar", R.drawable.st_sumsel_tombak_trisula);
		valuesEnsiklopedia.put("nama", "Tombak Trisula");
		valuesEnsiklopedia.put("keterangan", "Tombak trisula merupakan senjata khas daerah Sumatera Selatan yang memiliki dua ujung sisi yang bisa digunakan sebagai senjata. Salah satu ujungnya berbentuk trisula, sedangkan ujung yang lainnya berupa mata tombak berbentuk segitiga yang diukir demikian cantik.");
		valuesEnsiklopedia.put("propinsi", "Sumatera Selatan");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3008");
		valuesEnsiklopedia.put("gambar", R.drawable.st_bangka_belitung_siwar_panjang);
		valuesEnsiklopedia.put("nama", "Siwar Panjang");
		valuesEnsiklopedia.put("keterangan", "Siwar Panjang merupakan senjata khas dari Bangka Belitung. Siwar Panjang adalah senjata tusuk genggam yang bentuknya menyerupai golok panjang dengan sisi tajam di salah satu bilahnya. Senjata ini mempunyai kedudukan yang penting bagi seseorang. Berfungsi sebagai alat untuk mempertahankan diri dan benda keramat.");
		valuesEnsiklopedia.put("propinsi", "Bangka Belitung");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3009");
		valuesEnsiklopedia.put("gambar", R.drawable.st_bengkulu_kuduk_badik_rudus);
		valuesEnsiklopedia.put("nama", "Kuduk , Badik , Rudus");
		valuesEnsiklopedia.put("keterangan", "Kuduk, badik, dan rudus merupakan senjata tradisional daerah Bengkulu. Kuduk adalah sejenis keris yang berlekuk, bermata satu dengan punggung yang agak tebal. Sarungnya memakai centalan dan dipakai untuk membela diri dan berburu. Badik juga sejenis keris dengan bentuk lurus dan bermata satu. Diapakai untuk berburu dan sebagai perlengkapan upacara adat. Rudus adalah sejenis pedang yang terdiri dari mata, ulu, dan sarung. Dipergunakan untuk berperang, membela diri dan kelengkapan pada upacara penobatan datuk (kepala adat).");
		valuesEnsiklopedia.put("propinsi", "Bengkulu");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3010");
		valuesEnsiklopedia.put("gambar", R.drawable.st_lampung_terapang_pehduk_payan);
		valuesEnsiklopedia.put("nama", "Terapang");
		valuesEnsiklopedia.put("keterangan", "Terangang merupakan salah satu senjata tradisional dari daerah Lampung. Keris panjang yang juga dipanggil keris gabus atau terapang-sebagai regalia kesultanan Minangkabau dan digunakan sebagai alat kebesaran diraja termasuklah negeri sembilan. Negeri sembilan sendiri sepanjang sejarah kewujudannya mempunyai lapan bilah keris panjang, sigar jantan. Sebagai contohnya, Sultan Iskandar Muda pernah menghadiahkan keris Gabus atau terapang ini kepada King James 1 (England) pada tahun 1613, yang dibuat di Minangkabau.");
		valuesEnsiklopedia.put("propinsi", "Lampung");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3011");
		valuesEnsiklopedia.put("gambar", R.drawable.st_jakarta_parang_golok);
		valuesEnsiklopedia.put("nama", "Parang , Badik , Golok");
		valuesEnsiklopedia.put("keterangan", "Parang, Badik, Golok merupakan beberapa senjata tradisional masyarakat Betawi, yang digunakan dalam kehidupan sehari-hari dan sudah menyatu dalam kehidupan mereka. Setiap keluarga Betawi pasti memilikinya, bahkan setiap lelaki pada zaman dahulu selalu membawanya kemanapun mereka pergi. Namun karena perkembangan zaman serta teknologi sehingga golok sudah dianggap tidak praktis lagi dan mulai jarang ditemukan di masyarakat.");
		valuesEnsiklopedia.put("propinsi", "DKI Jakarta");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3012");
		valuesEnsiklopedia.put("gambar", R.drawable.st_jabar_kujang);
		valuesEnsiklopedia.put("nama", "Kujang");
		valuesEnsiklopedia.put("keterangan", "Senjata khas dan unik dari provinsi Jawa Barat adalah kujang. Kujang mulai di buat sekitar abad ke-8 atau ke-9. Kujang biasanya terbuat dari besi atau baja. Panjang kujang sekitar 20 cm hingga 25 cm, dan berat kujang bisa mencapai 300 gram. Selain sebagai senjata, Masyarakat Jawa Barat menggunakan kujang juga sebagai alat pertanian, hiasan, maupun cenderamata. Kujang merupakan alat yang melambangkan kekuatan dan keberanian untuk melindungi hak dan kebenaran.");
		valuesEnsiklopedia.put("propinsi", "Jawa Barat");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3013");
		valuesEnsiklopedia.put("gambar", R.drawable.st_banten_kujang);
		valuesEnsiklopedia.put("nama", "Kujang Banten");
		valuesEnsiklopedia.put("keterangan", "Kujang juga merupakan senjata tradisional dari daerah Banten. Bentuk Kujang dari Banten pun juga hampir sama dari daerah Jawa Barat, biasanya terbuat dari besi atau baja. Panjang kujang sekitar 20 cm hingga 25 cm, dan berat kujang bisa mencapai 300 gram. Selain sebagai senjata, Kujang juga digunakan sebagai alat pertanian, hiasan, maupun cenderamata. Kujang merupakan alat yang melambangkan kekuatan dan keberanian untuk melindungi hak dan kebenaran.");
		valuesEnsiklopedia.put("propinsi", "Banten");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3014");
		valuesEnsiklopedia.put("gambar", R.drawable.st_jateng_keris);
		valuesEnsiklopedia.put("nama", "Keris");
		valuesEnsiklopedia.put("keterangan", "Keris merupakan senjata khas suku Jawa, khususnya bagi masyarakat Jawa Tengah dan Jogja ini adalah suatu senjata yang mengandung nilai mistis dan sakral. Bagi masyarakat Jawa penganut aliran kejawen, bahkan keris ini dianggap memiliki jiwa dan harus dipelihara, dimandikan bahkan diberi makan. Keris ini memiliki panjang seperti sebuah pisau, hanya saja bentuknya yang tergolong unik, karena bentuknya meliuk-liuk seperti seekor ular.");
		valuesEnsiklopedia.put("propinsi", "Jawa Tengah");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3015");
		valuesEnsiklopedia.put("gambar", R.drawable.st_jogja_keris);
		valuesEnsiklopedia.put("nama", "Keris Yogya");
		valuesEnsiklopedia.put("keterangan", "Keris merupakan senjata khas suku Jawa, khususnya bagi masyarakat Jogja dan Jawa Tengah ini adalah suatu senjata yang mengandung nilai mistis dan sakral. Bagi masyarakat Jawa penganut aliran kejawen, bahkan keris ini dianggap memiliki jiwa dan harus dipelihara, dimandikan bahkan diberi makan. Keris ini memiliki panjang seperti sebuah pisau, hanya saja bentuknya yang tergolong unik, karena bentuknya meliuk-liuk seperti seekor ular.");
		valuesEnsiklopedia.put("propinsi", "DI Yogyakarta");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3016");
		valuesEnsiklopedia.put("gambar", R.drawable.st_jatim_clurit);
		valuesEnsiklopedia.put("nama", "Clurit");
		valuesEnsiklopedia.put("keterangan", "Clurit merupakan senjata khas dari daerah Jawa Timur, tepatnya Madura. Bagi masyarakat Madura, Celurit tak dapat dipisahkan dari budaya dan tradisi mereka hingga saat ini. Senjata tradisional ini memiliki bilahnya berbentuk melengkung bentuk bilah inilah yang menjadi ciri khasnya. Celurit menjadi senjata khas suku Madura yang biasa digunakan sebagai senjata carok.");
		valuesEnsiklopedia.put("propinsi", "Jawa Timur");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3017");
		valuesEnsiklopedia.put("gambar", R.drawable.st_bali_keris);
		valuesEnsiklopedia.put("nama", "Keris Bali");
		valuesEnsiklopedia.put("keterangan", "Keris dari Bali pada umunya sama seperti keris dari Jawa Timur, namun bedanya adalah lebih besar dan panjang. Balutan sarung keris berpenampilan mewah, dihias dengan emas, perak, gading, dan bahannya kayu langka yang dihiasi ukiran.");
		valuesEnsiklopedia.put("propinsi", "Bali");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3018");
		valuesEnsiklopedia.put("gambar", R.drawable.st_ntb_sampari_sondi_keris);
		valuesEnsiklopedia.put("nama", "Keris Sampari Sondi");
		valuesEnsiklopedia.put("keterangan", "Keris Sampari Sondi merupakan senjata khas dari daerah Nusa Tenggara Barat. Keris ini merupakan benda pusaka yang diperoleh secara turun temurun. Dipakai pada saat upara upara adat, juga pada waktu upacara keagaaman, seperti Maulid Nabi Muhammad SAW, Idut Fitri, Idul Adha dan pada waktu menerima tamu negara.");
		valuesEnsiklopedia.put("propinsi", "Nusa Tenggara Barat (NTB)");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3019");
		valuesEnsiklopedia.put("gambar", R.drawable.st_ntt_sundu);
		valuesEnsiklopedia.put("nama", "Sundu");
		valuesEnsiklopedia.put("keterangan", "Senjata yang umumnya dipakai oleh penduduk NTT adalah Sundu atau Sudu, semacam keris. Penduduk menganggapnya sebagai senjata tikam yang keramat. Senjata lainnya adalah Saweo, Pisau, Kampak, Parang, dan Senapan Tumbuk.");
		valuesEnsiklopedia.put("propinsi", "Nusa Tenggara Timur (NTT)");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3020");
		valuesEnsiklopedia.put("gambar", R.drawable.st_kalbar_mandau);
		valuesEnsiklopedia.put("nama", "Mandau");
		valuesEnsiklopedia.put("keterangan", "Senjata tradisional asal Kalimantan Barat bernama Mandau. Mandau sejenis Pedang yang memiliki keunikan tersendiri, dengan ukiran dan kekhasannya. Hulunya terbuat dari tanduk rusa yang diukir, sementara besi bahan Ahpang (Mandau) terbuat dari besi yang ditambang sendiri dan terdiri dari dua jenis, yaitu Bahtuk Nyan yang terkenal keras dan tajam sehingga lalat hinggap pun bisa putus tapi mudah patah dan Umat Motihke yang terkenal lentur, beracun dan tidak berkarat.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Barat");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3021");
		valuesEnsiklopedia.put("gambar", R.drawable.st_kalteng_mandau_lunjuk_sumpit_randu);
		valuesEnsiklopedia.put("nama", "Sumpit");
		valuesEnsiklopedia.put("keterangan", "Sumpit atau sumpitan (bahasa kalimantan tengah : sipet) adalah senjata yang digunakan untuk berburu maupun dalam pertempuran terbuka atau sebagai senjata rahasia untuk pembunuhan diam-diam. Penggunaan sumpit yaitu dengan cara ditiup. Dari segi penggunaannya sumpit atau sipet ini memiliki keunggulan tersendiri karena dapat digunakan sebagai senjata jarak jauh dan tidak merusak alam karena bahan pembuatannya yang alami. Dan salah satu kelebihan dari sumpit atau sipet ini memiliki akurasi tembak yang dapat mencapai 200 meter.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Tengah");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3022");
		valuesEnsiklopedia.put("gambar", R.drawable.st_kalsel_keris_bujak_beliung);
		valuesEnsiklopedia.put("nama", "Bujak Beliung");
		valuesEnsiklopedia.put("keterangan", "Bujak Beliung adalah nama senjata yang merupakan senjata tradisional dari Provinsi Kalimantan Selatan. Kalimantan selatan adalah provinsi yang menempati lahan bagian tenggara pulau kalimantan, namun letaknya strategis karena berada di perlintasan perlayaran laut jawa dan selat makasar.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Selatan");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3023");
		valuesEnsiklopedia.put("gambar", R.drawable.st_kaltim_mandau);
		valuesEnsiklopedia.put("nama", "Mandau");
		valuesEnsiklopedia.put("keterangan", "Mandau merupakan senjata tradisional Kalimantan Timur, tepatnya suku Dayak. Mandau semacam golok dan berbentuk panjang, terbuat dari bahan pilihan yang diambil dari batu gunung yang mengandung besi. Hiasan senjata ini berupa bulu burung enggang atau rambut manusia, ditaruh di hulu mandau yang terbuat dari tanduk atau kayu.");
		valuesEnsiklopedia.put("propinsi", "Kalimantan Timur");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3024");
		valuesEnsiklopedia.put("gambar", R.drawable.st_sulut_keris_peda_sabel);
		valuesEnsiklopedia.put("nama", "Keris , Peda , Sabel");
		valuesEnsiklopedia.put("keterangan", "Keris merupakan senjata tradisional yang biasa dipakai oleh rakyat di Sulawesi Utara. Bentuknya lurus tanpa berlekuk lekuk. Sedangkan senjata terkenal lainnya adalah peda (semacam parang), sabel,tombak, dan perisai. Pedan dan parang dapat dipergunakan untuk berbagai keperluan, seperti untuk bertani atau menyadap enau. Pedan ini bentuknya pendek dengan ukurun 50cm, terbuat dari besi. Hulunya terbuat dari kayu yang keras dan ujungnya bercabang dua. Sabel termasuk jenis peda dengan ukuran lebih panjang, yaitu 1-1,5m. Hulunya juga bercabang dua dan dipakai untuk perang, perisai sebagai penangkis terbuat dari kayu, diberi ukiran dengan motif motif binatang atau daun daun.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Utara");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3025");
		valuesEnsiklopedia.put("gambar", R.drawable.st_sulawesibarat_tombak);
		valuesEnsiklopedia.put("nama", "Tombak");
		valuesEnsiklopedia.put("keterangan", "Tombak atau lembing merupakan senjata khas Sulawesi Barat. Tombak adalah senjata untuk berburu dan berperang, bagiannya terdiri dari tongkat sebagai pegangan dan mata atau kepala tombak yang tajam dan kadang diperkeras dengan bahan lain. Bersamaan dengan kapak tombak adalah perkakas pertama yang dibuat manusia dan sejalan dengan perkembangan peradaban mata tombak dan kapak yang semula berupa tulang atau batu yang dihaluskan diganti menjadi logam yang lebih kuat dan tahan lama.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Barat");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3026");
		valuesEnsiklopedia.put("gambar", R.drawable.st_sulteng_pasatimpo);
		valuesEnsiklopedia.put("nama", "Pasatimpo");
		valuesEnsiklopedia.put("keterangan", "Pasatimpo adalah sejenis keris yang bentuk hulunya bengkok ke bawah dan sarungnya diberi tali. Senjata ini sering digunakan oleh masyarakat setempat dalam tari-tari penyembuh yang berfungsi sebagai pengusir roh-roh jahat. Kini, Pasa timpo lebih sering digunakan dalam tari-tari kepahlawanan. Fungsinya hanya untuk membesarkan jiwa penarinya. Karena keris tidak digerakan tetapi cukup diikatkan saja pada pinggang penari sebagai hiasan.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Tengah");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3027");
		valuesEnsiklopedia.put("gambar", R.drawable.st_sultenggara_keris);
		valuesEnsiklopedia.put("nama", "Keris");
		valuesEnsiklopedia.put("keterangan", "Keris adalah senjata tradisional rakyat Sulawesi Tenggara/ bentuknya berlekuk lekuk seperti keris pada umumnya. Istana dan banteng kerajaan Sultan Buton sangat terkenal dalam sejarah perlawanan bersenjata menentang Belanda. Keris dan pedang dipakai untuk perang jarak dekat, sedangkan tombak, lembing dan sumpitan untuk perang jarak jauh.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Tenggara");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3028");
		valuesEnsiklopedia.put("gambar", R.drawable.st_sulsel_badik);
		valuesEnsiklopedia.put("nama", "Badik ");
		valuesEnsiklopedia.put("keterangan", "Badik ini merupakan senjata khas tradisonal Makassar, Bugis dan Mandar yang berada dikepulauan Sulawesi. Ukurannya yang pendek dan mudah dibawa kemana mana.");
		valuesEnsiklopedia.put("propinsi", "Sulawesi Selatan");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3029");
		valuesEnsiklopedia.put("gambar", R.drawable.st_gorontalo_wamilo);
		valuesEnsiklopedia.put("nama", "Parang");
		valuesEnsiklopedia.put("keterangan", "Senjata Tradisional asal Gorontalo adalah parang. Ciri khas dari senjata ini adalah ujung hulunya sedikit melengkung.");
		valuesEnsiklopedia.put("propinsi", "Gorontalo");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3030");
		valuesEnsiklopedia.put("gambar", R.drawable.st_maluku_parang_salawaki_kalawai);
		valuesEnsiklopedia.put("nama", "Parang Salawaki atau Salawaku");
		valuesEnsiklopedia.put("keterangan", "Salawaku merupakan senjata tradisional khas daerah Maluku. Senjata ini biasanya dipakai oleh para penari pria saat mempertunjukkan tarian Cakalele. Pada salawaku terdapat ukiran-ukiran bermakna khusus yang terbuat dari kulit kerang laut. Ukuran parang dan salawaku sangat bervariasi tergantung postur badan sang penari. Masyarakat pulau Kakara B di Halmahera Utara terkenal sebagai pengrajin salawaku yang piawai.");
		valuesEnsiklopedia.put("propinsi", "Maluku");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3031");
		valuesEnsiklopedia.put("gambar", R.drawable.st_maluku_parang_salawaki_kalawai);
		valuesEnsiklopedia.put("nama", "Parang Salawaki atau Salawaku");
		valuesEnsiklopedia.put("keterangan", "Salawaku juga merupakan senjata tradisional khas daerah Maluku Utara. Kedua senjata ini biasanya dipakai oleh para penari pria saat mempertunjukkan tarian Cakalele. Pada salawaku terdapat ukiran-ukiran bermakna khusus yang terbuat dari kulit kerang laut. Ukuran parang dan salawaku sangat bervariasi tergantung postur badan sang penari. Masyarakat pulau Kakara B di Halmahera Utara terkenal sebagai pengrajin salawaku yang piawai.");
		valuesEnsiklopedia.put("propinsi", "Maluku Utara");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3032");
		valuesEnsiklopedia.put("gambar", R.drawable.st_papua_barat_busur_panah);
		valuesEnsiklopedia.put("nama", "Busur Panah ");
		valuesEnsiklopedia.put("keterangan", "Senjata utama penduduk Papua Barat adalah Panah. Busurnya terbuat dari bambu atau kayu, dan tali busurnya terbuat dari rotan. Anak panahnya terbuat dari bambu, kayu, atau tulang kangguru. Busur panah biasanya di gunakan untuk berburu dan berperang.");
		valuesEnsiklopedia.put("propinsi", "Papua Barat");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);

		valuesEnsiklopedia.put("id", "3033");
		valuesEnsiklopedia.put("gambar", R.drawable.st_papua_pisau_belati);
		valuesEnsiklopedia.put("nama", "Pisau Belati");
		valuesEnsiklopedia.put("keterangan", "Salah satu senjata tradisional di papua adalah pisau belati. Senjata ini terbuat dari tulang kaki burung kasuari dan bulu nya menghiasi hulu belati tersebut.");
		valuesEnsiklopedia.put("propinsi", "Papua ");
		valuesEnsiklopedia.put("kategori", "Senjata Tradisional");
		db.insert("ensiklopedia", "id", valuesEnsiklopedia);
		
		
		// end isi ensiklopedia kategori senjata tradisional
		
		
	}

	@Override

	public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
		
		

	}

}
