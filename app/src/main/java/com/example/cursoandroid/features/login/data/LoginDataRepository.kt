package com.example.cursoandroid.features.login.data

import com.example.cursoandroid.features.login.data.remote.LoginMockRemoteDataSource
import com.example.cursoandroid.features.login.domain.LoginRepository

//hay que heredar la clase

class LoginDataRepository
    (private val remoteDataSource: LoginMockRemoteDataSource): LoginRepository {
    override fun isValid(username: String, password: String): Boolean {
        //TODO("Not yet implemented")
    return remoteDataSource.validate(username,password)
    }


}