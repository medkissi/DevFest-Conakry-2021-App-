package com.dvilson.devfestconakry2021.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Speaker(
    val id :Int,
    val name :String,
    val image:Int =0,
    val subject:String,
    val description:String,
    val country:String,
    val time :String,

):Parcelable
