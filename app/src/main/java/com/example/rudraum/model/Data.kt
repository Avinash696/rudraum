package com.example.rudraum.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userTable")
data class Data(
    @PrimaryKey(autoGenerate = true)
    val dbId:Int,

    val app_version: String,
    val barear: String,
    val city: String,
    val created_at: String,
    val gst_name: String,
    val gst_no: String,
    val id: String,
    val mobile: String,
    val name: String,
    val parent_id: String,
    val password: String,
    val state: String,
    val token: Any,
    val type: String,
    val web_panel: String
)