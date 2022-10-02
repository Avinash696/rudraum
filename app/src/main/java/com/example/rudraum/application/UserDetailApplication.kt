package com.example.rudraum.application

import android.app.Application
import com.example.rudraum.api.RetrofitHelper
import com.example.rudraum.api.UserDetailInterface
import com.example.rudraum.db.UserDetailDatabse
import com.example.rudraum.repositary.Repositary

class UserDetailApplication:Application() {

    lateinit var userRepositary: Repositary
    override fun onCreate() {
        initilizer()
        super.onCreate()
    }

    private fun initilizer() {
        val userService = RetrofitHelper.getClient().create(UserDetailInterface::class.java)
        val userDatabase = UserDetailDatabse.getDatabase(applicationContext)
        userRepositary = Repositary(userService,userDatabase)
    }
}