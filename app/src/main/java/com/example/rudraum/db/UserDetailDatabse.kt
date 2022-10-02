package com.example.rudraum.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.rudraum.model.Data


@Database(entities = [Data::class], version = 1)
abstract class UserDetailDatabse : RoomDatabase() {
    abstract fun userDao(): UserDetailDao

    companion object {
        @Volatile
        private var INSTANCE: UserDetailDatabse? = null
        fun getDatabase(context: Context): UserDetailDatabse {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context,UserDetailDatabse::class.java, "userDb")
                    .build()
            }
            return INSTANCE!!
        }
    }
}