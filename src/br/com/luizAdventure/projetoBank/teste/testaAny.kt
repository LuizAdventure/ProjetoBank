package br.com.luizAdventure.projetoBank.teste

import br.com.luizAdventure.projetoBank.modelo.Endereco


fun testaAny(){

val endereco = Endereco(
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

}

