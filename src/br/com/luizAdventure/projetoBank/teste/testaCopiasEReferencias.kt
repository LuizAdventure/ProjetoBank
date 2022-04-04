import br.com.luizAdventure.projetoBank.modelo.Cliente
import br.com.luizAdventure.projetoBank.modelo.ContaCorrente
import br.com.luizAdventure.projetoBank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    //exemplo 1
    val bryan = Cliente(nome = "Bryan", cpf = "", senha = 1)
    val contaBryan = ContaCorrente(bryan, 1002)
    contaBryan.titular.nome = "Bryan"

    //exemplo 2
    var contaBrandon = ContaPoupanca(
        Cliente(
            nome = "Brandon",
            cpf = "",
            senha = 2
        ), 1003
    )
    contaBrandon.titular.nome = "Brandon"

    contaBryan.titular.nome = "Bryan"

    println("titular conta Bryan: ${contaBryan.titular}")
    println("titular conta Brandon: ${contaBrandon.titular}")

    println(contaBryan)
    println(contaBrandon)
}