package br.com.alura.bytebank.models

interface Autenticacao {

    fun autentica(senha:String): Boolean
}