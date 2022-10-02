package com.example.rudraum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.rudraum.api.UserDetailInterface
import com.example.rudraum.api.RetrofitHelper
import com.example.rudraum.application.UserDetailApplication
import com.example.rudraum.repositary.Repositary
import com.example.rudraum.viewModel.RegisterViewModel
import com.example.rudraum.viewModel.RegisterViewModelFactory
import okhttp3.MediaType
import okhttp3.RequestBody

class MainActivity : AppCompatActivity() {
    val TAG= "raw"
    lateinit var registerViewModel: RegisterViewModel
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val repo = (application as UserDetailApplication).userRepositary
        registerViewModel = ViewModelProvider(this,RegisterViewModelFactory(repo))[RegisterViewModel::class.java]

        Log.d(TAG, "onCreate: ${registerViewModel.users.value}")
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

//    fun test() {
//        val name = RequestBody.create(MediaType.parse("text/plain"), "avinash").toString()
//        val gst_name = RequestBody.create(MediaType.parse("text/plain"), "Rudruam01").toString()
//        val gst_no = RequestBody.create(MediaType.parse("text/plain"), "trch0910").toString()
//        val mobile = RequestBody.create(MediaType.parse("text/plain"), "3333333333").toString()
//        val password = RequestBody.create(MediaType.parse("text/plain"), "22222").toString()
//        val parent_id = RequestBody.create(MediaType.parse("text/plain"), "1000").toString()
//        val client = RetrofitHelper.getClient().create(UserDetailInterface::class.java)
//        val call =
//            client.registerUser("registerUser", name, gst_name, gst_no, mobile, password, parent_id)
//
//        if(call.isSuccessful)
//            Log.d(TAG, "test: ${call.body()}")
//        else
//            Log.d(TAG, "test: ${call.errorBody()}")
//    }

    
}