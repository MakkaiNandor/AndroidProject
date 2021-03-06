package com.example.androidproject.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "restaurant_table")
data class Restaurant(
        @PrimaryKey val id: Long,
        val name: String,
        val address: String,
        val city: String,
        val state: String,
        val area: String,
        val postal_code: String,
        val country: String,
        val phone: String,
        val lat: Double,
        val lng: Double,
        val price: Int,
        val reserve_url: String,
        val mobile_reserve_url: String,
        val image_url: String
)