package com.dvilson.devfestconakry2021.data

import androidx.annotation.DrawableRes

data class Page(
    val title :String,
    val description:String,
    @DrawableRes val image:Int
)
