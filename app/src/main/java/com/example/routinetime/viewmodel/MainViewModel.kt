package com.example.routinetime.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.routinetime.model.FirebaseWorker
import com.example.routinetime.model.Profile.Profile
import com.example.routinetime.model.dto.Entity
import com.google.firebase.ktx.Firebase

class MainViewModel(): IMainViewModel {
//    private val _currencyToUSD = MutableLiveData<Entity>()
//    val currencyToUSD: LiveData<Entity> = _currencyToUSD
 private val firebaseWorker =  FirebaseWorker()
     fun writeAccountToFirebase()
    {
        var hash:HashMap<String,Int> = hashMapOf("kek" to 1, "pop" to 0, "mof" to 44)
        firebaseWorker.createAccount(Profile(dailyReport = hash))
    }
}