import modelo.Cliente
import modelo.Diretor
import modelo.Gerente
import modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Luiz",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretora = Diretor(
        nome = "Sara",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )
    val cliente = Cliente(
        nome = "Bryan",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 1234)
}