package com.example.androidproject.model

data class Restaurants(
    val total_entries: Long,
    val per_page: Int,
    val current_page: Int,
    val restaurants: List<Restaurant>
)