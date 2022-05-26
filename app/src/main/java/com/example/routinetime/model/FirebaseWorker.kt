package com.example.routinetime.model

import com.example.routinetime.model.Profile.Profile
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class FirebaseWorker():IFirebaseWorker {
    companion object
    {
        val database = Firebase.database
    }
    override fun getAccount() {
        TODO("Not yet implemented")
    }

    override fun createAccount(account: Profile) {
        database.getReference().setValue(account)


    }

    override fun updateAccount() {
        TODO("Not yet implemented")
    }


}