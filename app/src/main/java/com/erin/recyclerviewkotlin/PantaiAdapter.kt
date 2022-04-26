package com.erin.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

// TODO 2: Menambahkan parameter ke PantaiAdapter konstruktor yg merupakan val yang disebut context dari jenis Context...
class PantaiAdapter(private val context: Context, private val pantai: List<Pantai>, val listener: (Pantai) -> Unit)
    : RecyclerView.Adapter<PantaiAdapter.PantaiViewHolder>() {

    // TODO 3: PantaiViewHolder hanya digunakan oleh PantaiAdapter, hal itu membuatnya dalam PantaiAdapter akan menampilkan hubungan ini
    class PantaiViewHolder(view: View): RecyclerView.ViewHolder(view) {

        // menentukan val property seperti ImageView yang berjenis ImageView dan TextView yang berjenis TextView
        // kita menentukan tampilannya dengan id img_item_photo seperti yang telah kita tentukan di item_pantai.xml
        val imgPantai = view.findViewById<ImageView>(R.id.img_item_photo)
        val namePantai = view.findViewById<TextView>(R.id.tv_item_name)
        val descPantai = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(pantai: Pantai, listener: (Pantai) -> Unit){
            imgPantai.setImageResource(pantai.imgPantai)
            namePantai.text = pantai.namePantai
            descPantai.text = pantai.descPantai
        }
    }

    // TODO 4: class view holder yang digunakan untuk menampilkan data per item. Holder tampilan mewakili satu tampilan item daftar.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PantaiViewHolder {
        return PantaiViewHolder(
            // objek LayoutInflater untuk mengatur inflater tata letak xml.
            // argumen boolean harus false. hal itu dikarenakan RecyclerView menambahkan item ini ke hierarki tampilan saat waktu tersebut.
            LayoutInflater.from(context).inflate(R.layout.item_pantai, parent, false)
        )
    }

    // metode ini dipanggil oleh pengelola tata letak untuk mengganti isi tampilan item daftar.
    // metode ini memiliki 2 parameter yaitu PantaiViewHolder dan Int.
    override fun onBindViewHolder(holder: PantaiViewHolder, position: Int) {
        holder.bindView(pantai[position], listener)
    }

    // digunakan untuk menampilkan ukuran pantai kita.
    // data aplikasi kita berada di properti pantai yang kita berikan ke konstruktor Pantai Adapter.
    // size digunakan untuk mendapatkan ukurannya.
    override fun getItemCount(): Int = pantai.size

}