package models

class Funcionario(val nome: String, val cpf: String, var salario : Double) {
    fun bonificacao(): Double {
        return salario * 0.1
    }
}