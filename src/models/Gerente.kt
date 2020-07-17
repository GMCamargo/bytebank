package models

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val role: String = "ROLE_ADMIN",
    senha: String
) :
    FuncionarioAdmin(
        nome = nome,
        cpf = cpf,
        salario = salario,
        senha = senha
    ) {

    override val bonificacao: Double get() = super.bonificacao + salario


    override fun toString(): String {
        return "Gerente(nome='$nome', cpf='$cpf', salario=$salario, bonificação: $bonificacao,role='$role')"
    }
}