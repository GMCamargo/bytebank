package models

interface Autenticacao {

    fun autentica(senha:String): Boolean
}