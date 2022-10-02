package com.example.rudraum.repositary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.rudraum.api.UserDetailInterface
import com.example.rudraum.db.UserDetailDatabse
import com.example.rudraum.model.RegisterResponceModel

class Repositary(
    private val userDetailInterface: UserDetailInterface,
    private val userDatabase: UserDetailDatabse
) {
    private val userLiveDatabse = MutableLiveData<RegisterResponceModel>()
    val userData :LiveData<RegisterResponceModel>
            get() = userLiveDatabse

    fun getUser() {
        val result = userDetailInterface.loginUser("loginUser", "3333333333", "22222", "")
        if (result.isSuccessful) {
            userLiveDatabse.postValue(result.body())
            userDatabase.userDao().addUser(result.body()!!)
        }
    }
}