package com.erin.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

// TODO 1: disini kita menyiapkan tipe data baru sesuai dengan spesifikasi
data class Pantai(
    val imgPantai: Int,
    val namePantai: String,
    val descPantai: String
) : Parcelable
