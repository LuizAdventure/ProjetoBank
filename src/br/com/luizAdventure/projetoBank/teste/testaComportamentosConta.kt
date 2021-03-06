import br.com.luizAdventure.projetoBank.modelo.Cliente
import br.com.luizAdventure.projetoBank.modelo.ContaCorrente
import br.com.luizAdventure.projetoBank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val luiz = Cliente(nome= "Luiz", cpf= "", senha= 1)

    val contaLuiz = ContaCorrente(titular = luiz, numero = 1000)
    contaLuiz.deposita(200.0)

    val sara = Cliente(nome= "Sara", cpf= "", senha= 2)

    val contaSara = ContaPoupanca(numero = 1001, titular = sara)
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

    println("TransferĂȘncia da conta da Sara para o Luiz")

    if (contaSara.transfere(destino = contaLuiz, valor = 300.0)) {
        println("TransferĂȘncia sucedida")
    } else {
        println("Falha na transferĂȘncia")
    }

    println(contaLuiz.saldo)
    println(contaSara.saldo)
}