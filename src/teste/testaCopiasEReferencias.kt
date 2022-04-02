import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaBryan = ContaCorrente("Bryan", 1002)
    contaBryan.titular = "Bryan"
    var contaBrandon = ContaPoupanca("Brandon", 1003)
    contaBrandon.titular = "Brandon"
    contaBryan.titular = "Bryan"

    println("titular conta Bryan: ${contaBryan.titular}")
    println("titular conta Brandon: ${contaBrandon.titular}")

    println(contaBryan)
    println(contaBrandon)
}