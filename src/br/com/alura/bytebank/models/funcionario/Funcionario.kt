package br.com.alura.bytebank.models.funcionario

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {
    open val bonificacao: Double get() = salario * 0.1


}