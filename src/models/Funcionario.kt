package models

open class Funcionario(val nome: String,
                       val cpf: String,
                       var salario : Double
) {
    open val bonificacao:Double get() = salario*0.1



    override fun toString(): String {
        return "Funcionario(nome='$nome', cpf='$cpf', salario=$salario)"
    }


}