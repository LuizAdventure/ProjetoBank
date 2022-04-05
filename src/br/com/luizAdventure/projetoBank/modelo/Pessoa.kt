package br.com.luizAdventure.projetoBank.modelo

data class Pessoa( val nome: String, val idade: Int){

    fun fala(){
        println("emite som")
    }
}