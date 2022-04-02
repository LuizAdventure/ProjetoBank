package modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao Lsbb-bank")
        } else {
            println("Falha na autenticação")
        }
    }

}