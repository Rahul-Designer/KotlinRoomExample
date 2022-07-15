package com.example.kotlinroomexample

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contact")
data class Contact(
    @NonNull
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    var name: String,
    var number: String,
    var isActive : Int)