package com.example.cursoandroid.features.login

import androidx.lifecycle.ViewModel
import com.example.cursoandroid.features.login.data.LoginDataRepository
import com.example.cursoandroid.features.login.data.remote.LoginMockRemoteDataSource
import com.example.cursoandroid.features.login.domain.LoginRepository
import com.example.cursoandroid.features.login.domain.SignInUseCase
import com.example.cursoandroid.features.login.presentation.LoginViewModel

class LoginFactory {
    private val loginMockRemoteDataSource: LoginMockRemoteDataSource = provideLoginRemoteDataSource()
    private val loginRepository: LoginRepository = provideLoginDataRepository()
    private val signInUseCase: SignInUseCase = provideSignInUseCase()

    fun provideLoginViewModel(): LoginViewModel{
        return LoginViewModel(signInUseCase)

    }
    // sería así con kotlin directamente, fun provide2() = provideLoginViewModel()

    private fun provideLoginRemoteDataSource(): LoginMockRemoteDataSource {
         return LoginMockRemoteDataSource()
    }

    private fun provideLoginDataRepository():LoginDataRepository{
        return LoginDataRepository(loginMockRemoteDataSource)

    }

    fun provideSignInUseCase(): SignInUseCase{
        return SignInUseCase(loginRepository)

    }


}