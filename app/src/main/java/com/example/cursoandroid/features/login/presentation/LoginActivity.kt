package com.example.cursoandroid.features.login.presentation

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cursoandroid.R
import com.example.cursoandroid.features.login.LoginFactory
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    //crep atributos una única vez
    private lateinit var loginFactory: LoginFactory
    private lateinit var loginViewModel: LoginViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inicializo loginFactory
        loginFactory = LoginFactory()
        loginViewModel= loginFactory.provideLoginViewModel()
        //provideLoginViewModel()
        setContentView(R.layout.activity_login)
        //crear  la funcion
        setupView()

    }

    private fun setupView() {
        //Kotlin defino una variable val inmutable
        val actionValidate = findViewById<Button>(R.id.action_validate)

        //variable mutable, no deseado en moviles
        //var actionValidate2=findViewById<Button>(R.id.action_validate)
        //Un evento voy a crear. recibe x parametro yn objeto que viene de una interfaz (instanciamos una
        //clase sin guardar, te pide metodo. Pulsar en la palabra roja y eliges

    // actionValidate.setOnClickListener(object : OnClickListener {
          //si tiene solo un método no se hace así, se pulsa convertir a lamda
            //override fun onClick(p0: View?)
            //TODO("Not yet implemented")

    //    }

       actionValidate.setOnClickListener{
           Log.d("@dev", "Clicked!!")

           val username = findViewById<EditText>(R.id.input_username).text.toString()
           val password = findViewById<EditText>(R.id.input_password).text.toString()
           //pasar parámetros
           //loginViewModel.validateClicked(username,password)
            //val isValid = loginViewModel.validateClicked(username,password)
           if (loginViewModel.validateClicked(username,password)){
               Snackbar.make(
                   findViewById(R.id.main), R.string.messaGe_login_ok,Snackbar.LENGTH_SHORT).show()
           }else {
               Snackbar.make(
                   findViewById(R.id.main), R.string.message_login_false,Snackbar.LENGTH_SHORT).show()
           }
       }

        }




    }
