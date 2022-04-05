package br.com.luizAdventure.projetoBank.teste

fun testaImpressoes(){

    val x = 10
    var y = x
    y++

    println(x)
    println(y)

    println("--------------------------------------")

    val p1 = PessoaSimples("Luiz")
    val p2 = p1
    p2.nome = "Sara"

    println(p1.nome)
    println(p2.nome)

    println("--------------------------------------")

    val palavra = "palavra"
    var palavraNova = palavra
    palavraNova= "palavraNova"
    val subString = palavra.substring(4)

    println(palavra)
    println(palavraNova)
    println(subString)

    println("--------------------------------------")

    for(c in palavra)
        println(c)

    println("--------------------------------------")

    for(c in palavra)
        println(c =='a')
}

class PessoaSimples(var nome: String)