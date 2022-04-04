package br.com.luizAdventure.projetoBank.modelo

class CalculadoraBonificacaoAny {

    var total: Double = 0.0
        private set

    // chamada incorreta
    //fun registra(funcionario: Any){
       // funcionario as Funcionario
       // this.total += funcionario.bonificacao
   // }


    //smart cast
    //fun registra(funcionario: Any) {
       // if (funcionario is Funcionario) {
           // this.total += funcionario.bonificacao
       // }
   // }


}