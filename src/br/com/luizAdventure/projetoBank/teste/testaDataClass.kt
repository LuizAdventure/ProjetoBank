package br.com.luizAdventure.projetoBank.teste

import br.com.luizAdventure.projetoBank.modelo.Documento
import br.com.luizAdventure.projetoBank.modelo.Pessoa

fun testaDataClass() {

    val luiz = Pessoa(
        nome = "Luiz",
        idade = 39
    )
    luiz.fala()
    println(luiz)


    // copy data class destructring declaration
    val luiz2 = luiz.copy()
    println(luiz2)


    val documento = Documento(
        rg = "11111111-1",
        cpf = "222.222.222-22"
    )
    println(documento)


    //component function data class destructring declaration
    val (rg ,cpf) = documento
    println("rg: $rg e cpf: $cpf")


}




