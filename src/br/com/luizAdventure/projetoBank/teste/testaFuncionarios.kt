import br.com.luizAdventure.projetoBank.modelo.*

fun testaFuncionarios() {
    val luiz = Analista(
        nome = "Luiz",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${luiz.nome}")
    println("cpf ${luiz.cpf}")
    println("salario ${luiz.salario}")
    println("bonificação ${luiz.bonificacao}")

    val sara = Gerente(
        nome = "Sara",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${sara.nome}")
    println("cpf ${sara.cpf}")
    println("salario ${sara.salario}")
    println("bonificação ${sara.bonificacao}")

    if (sara.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val bryan = Diretor(
        nome = "Bryan",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${bryan.nome}")
    println("cpf ${bryan.cpf}")
    println("salario ${bryan.salario}")
    println("bonificação ${bryan.bonificacao}")
    println("plr ${bryan.plr}")

    if (bryan.autentica(4000)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val brandon = Analista(
        nome = "Brandon",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(luiz)
    calculadora.registra(sara)
    calculadora.registra(bryan)
    calculadora.registra(brandon)
    //calculadora.registra(1)

    //chamada utilizando any
    //val calculadoraAny = CalculadoraBonificacaoAny()
    //calculadoraAny.registra(luiz)
   // calculadoraAny.registra(sara)
   // calculadoraAny.registra(bryan)
    //calculadoraAny.registra(brandon)
    //calculadoraAny.registra(1)

    println("total de bonificação: ${calculadora.total}")
}