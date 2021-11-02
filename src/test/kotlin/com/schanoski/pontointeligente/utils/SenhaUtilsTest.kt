package com.schanoski.pontointeligente.utils

import org.junit.jupiter.api.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.junit.jupiter.api.Assertions


class SenhaUtilsTest {
    private val SENHA ="123456"
    private val bCryptPasswordEncoder = BCryptPasswordEncoder()

    @Test
    fun testeGerarHashSenha(){
        val hash = SenhaUtils().gerarBcrypt(SENHA)
        Assertions.assertTrue(bCryptPasswordEncoder.matches(SENHA, hash))
    }
}