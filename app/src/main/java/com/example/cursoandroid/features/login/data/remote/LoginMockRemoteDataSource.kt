package com.example.cursoandroid.features.login.data.remote

class LoginMockRemoteDataSource {

    private val username = "android"
    private val password = "12345"

    //metdodo para validar

    //fun validate(userName: String, password: String): Boolean {
   //     if (this.username == username && this.password == password)
     //       return true
   // } else
   // {
   //     return false

        fun validate(username: String, password: String): Boolean {
            return ((this.username == username)
                    && (this.password == password))
        }
  // }

}

