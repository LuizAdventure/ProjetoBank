import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaComportamentosConta() {
    val contaLuiz = ContaCorrente(titular = "Luiz", numero = 1000)
    contaLuiz.deposita(200.0)

    val contaSara = ContaPoupanca(numero = 1001, titular = "Sara")
    contaSara.deposita(300.0)

    println(contaSara.titular)
    println(contaSara.numero)
    println(contaSara.saldo)

    println(contaLuiz.titular)
    println(contaLuiz.numero)
    println(contaLuiz.saldo)

    println("depositando na conta do Luiz")
    contaLuiz.deposita(50.0)
    println(contaLuiz.saldo)

    println("depositando na conta da Sara")
    contaSara.deposita(70.0)
    println(contaSara.saldo)

    println("sacando na conta do Luiz")
    contaLuiz.saca(250.0)
    println(contaLuiz.saldo)

    println("sacando na conta da Sara")
    contaSara.saca(100.0)
    println(contaSara.saldo)

    println("saque em excesso na conta do Luiz")
    contaLuiz.saca(100.0)
    println(contaLuiz.saldo)

    println("saque em excesso na conta da Sara")
    contaSara.saca(500.0)
    println(contaSara.saldo)

    println("Transferência da conta da Sara para o Luiz")

    if (contaSara.transfere(destino = contaLuiz, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaLuiz.saldo)
    println(contaSara.saldo)
}