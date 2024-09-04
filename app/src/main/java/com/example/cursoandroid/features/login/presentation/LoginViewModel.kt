package com.example.cursoandroid.features.login.presentation

import android.widget.EditText
import androidx.lifecycle.ViewModel
import com.example.cursoandroid.R
import android.os.Bundle
import com.example.cursoandroid.features.login.domain.SignInUseCase

//las clases las vamos a pasar por constructor, las dependencias

class LoginViewModel(private val singInUseCase:SignInUseCase) : ViewModel() {
//creo 1 método recogemos lo que ha pasado en la pantalla

    fun validateClicked(username: String, password:String): Boolean{
        return  singInUseCase.invoke(username, password)



    }




}