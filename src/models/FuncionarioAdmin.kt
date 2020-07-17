package models

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha:String
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticacao{

    override fun autentica(senha: String): Boolean {
        return this.senha==senha
    }

}