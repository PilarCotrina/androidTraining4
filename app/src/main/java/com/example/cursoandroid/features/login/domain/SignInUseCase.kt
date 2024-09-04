package com.example.cursoandroid.features.login.domain
//1 sola cosa y no debe ser de android
class SignInUseCase (private val loginRepository: LoginRepository){

    // otra opcion fun execute() {}
    //es un objeto que lo utilizo como una función

    operator fun invoke(username:String, password:String): Boolean {

        return loginRepository.isValid(username, password)

    }
}