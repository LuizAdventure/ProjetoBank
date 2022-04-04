package br.com.luizAdventure.projetoBank.modelo

class Endereco (
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = ""

){
    //sobreescrevendo toString 1 exemplo
    //override fun toString(): String {
       // return "logradouro: $logradouro"
    //}

    //sobreescrevendo toString 2 exemplo inline
    //override fun toString(): String {
        //return "Endereco(logradouro='$logradouro', numero=$numero, bairro='$bairro', cidade='$cidade', estado='$estado', cep='$cep', complemento='$complemento')"
    //}

    //sobreescrevendo toString 3 exemplo quebrando linha
    override fun toString(): String {
        return """
            Endereco(logradouro='$logradouro', 
            numero=$numero, 
            bairro='$bairro', 
            cidade='$cidade', 
            estado='$estado', 
            cep='$cep', 
            complemento='$complemento')
            """.trimIndent() // retira os espacos em branco
    }

    // sobreescrevendo o equals para fazer comparacao entre objetos com 1 property igual
    //override fun equals(other: Any?): Boolean {
    //  if(other != null && other is Endereco){
    //     return this.cep == other.cep
    //  }
    // return false
    //}

    // sobreescrevendo o hashcode para ser o mesmo no objeto com 1 property igual
    //override fun hashCode(): Int {
    //  return cep.hashCode()
    // }

    // sobreescrevendo o equals para fazer comparacao entre objetos com todas property igual

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (logradouro != other.logradouro) return false
        if (numero != other.numero) return false
        if (bairro != other.bairro) return false
        if (cidade != other.cidade) return false
        if (estado != other.estado) return false
        if (cep != other.cep) return false
        if (complemento != other.complemento) return false

        return true
    }
    // sobreescrevendo o hashcode para ser o mesmo no objeto com property iguais

    override fun hashCode(): Int {
        var result = logradouro.hashCode()
        result = 31 * result + numero
        result = 31 * result + bairro.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + estado.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + complemento.hashCode()
        return result
    }




}
