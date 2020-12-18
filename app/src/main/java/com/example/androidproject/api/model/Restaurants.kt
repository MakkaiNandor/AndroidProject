package com.example.androidproject.api.model

data class Restaurants(
    val total_entries: Int,
    val page: Int,
    val per_page: Int,
    /*val current_page: Int,*/
    val restaurants: List<Restaurant>
)