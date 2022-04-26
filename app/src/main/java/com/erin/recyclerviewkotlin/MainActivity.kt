package com.erin.recyclerviewkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // untuk pemanggilan isi list, nama gambar dan deskripsinya.
        val pantaiList = listOf<Pantai>(
            Pantai(
                R.drawable.baronn,
                namePantai = "PANTAI BARON",
                descPantai = "Di sepanjang bibir pantai, Anda dapat menyaksikan deretan restoran yang menyajikan aneka masakan laut hingga es kelapa muda segar"
            ),
            Pantai(
                R.drawable.drinii,
                namePantai = "PANTAI DRINI",
                descPantai = "Pantai Drini menjadi salah satu tempat wisata pantai di Jogja yang istimewa karena keberadaan sebuah pulau kecil di tengahnya"
            ),
            Pantai(
                R.drawable.indrayantii,
                namePantai = "PANTAI INDRAYANTI",
                descPantai = "Di sepanjang bibir pantai, Anda dapat menyaksikan deretan restoran yang menyajikan aneka masakan laut hingga es kelapa muda segar"
            ),
            Pantai(
                R.drawable.jogann,
                namePantai = "PANTAI JOGAN",
                descPantai = "Pantai Jogan terletak Desa Purwodadi, Kecamatan Tepus, Kabupaten Gunungkidul"
            ),
            Pantai(
                R.drawable.krakall,
                namePantai = "PANTAI KRAKAL",
                descPantai = "Pantai krakal memiliki hamparan pasir putih dan air laut yang jernih"
            ),
            Pantai(
                R.drawable.kukupp,
                namePantai = "PANTAI KUKUP",
                descPantai = "Pantai Kukup masih berada di kecamatan Tanjungsari bersama dengan Pantai Baron dan Pantai Krakal. Orang-orang biasa menyebutnya trio pantai"
            ),
            Pantai(
                R.drawable.ngandongg,
                namePantai = "PANTAI NGANDONG",
                descPantai = "Tempat wisata yang lagi hits di Jogja ini cocok untuk keluarga karena ombaknya tidak terlalu tinggi dan tergolong ramah bagi siapa saja yang ingin bermain air"
            ),
            Pantai(
                R.drawable.nglamborr,
                namePantai = "PANTAI NGLAMBOR",
                descPantai = "Pantai nglambor adalah salah satu tempat wisata pantai di Jogja untuk snorkeling"
            ),
            Pantai(
                R.drawable.ngobarann,
                namePantai = "PANTAI NGOBARAN",
                descPantai = "Pantai Ngobaran adalah tempat wisata yang kaya akan pesona budaya"
            ),
            Pantai(
                R.drawable.poktunggall,
                namePantai = "PANTAI POK TUNGGAL",
                descPantai = "Tempat wisata pantai di Jogja yang satu ini menawarkan keindahan hamparan pasir putih dan barsian tebing tegak lurus dengan ketinggian tebing mencapai 40 m hingga 60 m"
            ),
            Pantai(
                R.drawable.sadranann,
                namePantai = "PANTAI SADRANAN",
                descPantai = "Pantai ini memiliki hamparan pasir putih yang luas dan landai sehingga asyik dijadikan lokasi piknik segala usia. Wisatawan juga bisa snorkeling untuk melihat keindahan bawah air"
            ),
            Pantai(
                R.drawable.siungg,
                namePantai = "PANTAI SIUNG",
                descPantai = "Inilah tempat wisata pantai di Jogja yang merupakan surga para pemanjat tebing"
            )

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_pantai)
        // LinearLayoutManager digunakan untuk mengelola tata letak.
        recyclerView.layoutManager = LinearLayoutManager(this)
        // Untuk optimasi ketika ukuran RecycleView tidak berubah dari dokumen.
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PantaiAdapter(this, pantaiList){

        }
    }
}