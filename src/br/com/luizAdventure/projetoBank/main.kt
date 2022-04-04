import br.com.luizAdventure.projetoBank.modelo.Endereco


fun main() {

    val x = 10
    var y = x
    y++

    println(x)
    println(y)

    println("--------------------------------------")

    val p1 = Pessoa("Luiz")
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

class Pessoa(var nome: String)











    /*val endereco = Endereco(
        logradouro = "Rua Ventania",
        complemento = "impar",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        bairro = "Cidade Vento",
        numero = 2022,
        cep = "00000-000"

    )

    println(endereco.equals(enderecoNovo))
    println(endereco.equals(endereco))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())

    println("${endereco.javaClass}@${
        Integer.toHexString(endereco.hashCode())}")

    val objeto: Any = Any()
    imprime(objeto)

    imprime(Unit)
    imprime(Any())
    imprime(1)
    imprime(1.0)
    imprime(endereco)
    imprime(true)

    val teste: Any = imprime(endereco)
    println(teste)


}

fun imprime(valor: Any): Any {
    println(valor)
    return valor


}*/
