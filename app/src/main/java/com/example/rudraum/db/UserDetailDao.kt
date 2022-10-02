package com.example.rudraum.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.rudraum.model.Data
import com.example.rudraum.model.RegisterResponceModel

@Dao
interface UserDetailDao {

    @Insert
    fun addUser(userSingle:RegisterResponceModel)

    @Query("SELECT * FROM userTable")
    fun getUser() :List<Data>
}