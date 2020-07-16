package models

class Gerente(nome: String, cpf: String, salario: Double, val role:String = "ROLE_ADMIN") : Funcionario(nome, cpf, salario) {
    override val bonificacao: Double get() = super.bonificacao + salario


    override fun toString(): String {
        return "Gerente(nome='$nome', cpf='$cpf', salario=$salario,role='$role')"
    }
}