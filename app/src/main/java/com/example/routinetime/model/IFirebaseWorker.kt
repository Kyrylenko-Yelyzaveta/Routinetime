package com.example.routinetime.model
import com.example.routinetime.model.Profile.Profile

interface IFirebaseWorker {
     fun getAccount()
     fun createAccount(account: Profile)
     fun updateAccount()
}