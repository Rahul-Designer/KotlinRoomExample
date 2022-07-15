package com.example.kotlinroomexample

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ContactDao {

    // suspend for coroutine
    @Insert
    suspend fun insertContact (contact: Contact)

    @Update
    suspend fun updateContact (contact: Contact)

    @Delete
    suspend fun deleteContact (contact: Contact)

    @Query("SELECT * FROM contact")
    fun getContact() : LiveData<List<Contact>>
}