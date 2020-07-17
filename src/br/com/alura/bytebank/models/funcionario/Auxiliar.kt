package br.com.alura.bytebank.models.funcionario

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome,
    cpf,
    salario
) {


    override fun toString(): String {
        return "Auxiliar(nome='$nome', cpf='$cpf', salario=$salario, bonificação: $bonificacao)"
    }
}