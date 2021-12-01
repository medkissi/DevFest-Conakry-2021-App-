package com.dvilson.devfestconakry2021


sealed class TabItem(var title: String) {
    object JOUR1 : TabItem("Jour 1")
    object JOUR2 : TabItem("Jour 2")

    object items {
        val list = listOf(JOUR1, JOUR2)
    }
}
