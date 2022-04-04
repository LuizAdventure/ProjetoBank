package br.com.luizAdventure.projetoBank.teste

import br.com.luizAdventure.projetoBank.modelo.*

fun testaObjects() {
    val sara = object : Autenticavel {
        val nome: String = "Sara"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(sara, 1000)

    println("nome do cliente ${sara.nome}")


    val luiz = Cliente(nome = "Luiz", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = luiz, numero = 1000)
    val contaCorrente = ContaCorrente(titular = luiz, numero = 1001)


    println("Total de contas: ${Conta.total}")
}