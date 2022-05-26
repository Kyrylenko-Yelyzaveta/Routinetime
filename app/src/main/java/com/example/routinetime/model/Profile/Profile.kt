package com.example.routinetime.model.Profile

data class Profile(
    var nickname: String = "Nickname",
    var firstName: String = "First Name",
    var lastName: String = "Last Name",
    var password: String = "Password",
    var repeatPassword: String = "Repeat Password",
    var dailyReport: HashMap<String,Int>? = null
    )

