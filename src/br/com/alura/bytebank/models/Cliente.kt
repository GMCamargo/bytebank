package br.com.alura.bytebank.models

class Cliente(
    val nome:String,
    val cpf:String,
    val senha:String
):Autenticacao {
    override fun autentica(senha: String): Boolean {
        return this.senha == senha
    }
}