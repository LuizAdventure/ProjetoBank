import br.com.luizAdventure.projetoBank.modelo.Endereco
import kotlin.ClassCastException

fun main() {
    println("inicio main")
//    try {
//        10 / 0
//    } catch (e: ArithmeticException) {
//        println("ArithmeticException foi pega")
//    }
    funcao1()
    println("fim main")
}

fun funcao1() {
    println("inicio funcao1")
    try {
        funcao2()
    }catch (e: ClassCastException){
        println("ClassCastException foi pega")
    }

    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")

    //for dentro do try
    //try {
       // for (i in 1..5) {
          //  println(i)
            //exemplo provocando uma exception
            //val endereco = Any()
            //endereco as Endereco


       // }
    //} catch (e: ClassCastException) {
        //println(
           // "ClassCastException dentro do for para a excecucao, " +
                //    "\n porque o for nao sabe resolver o cast"
        //)
   // }
////////////////////////////////////////////////////////////
   // println("\n ///////////////////////////////////////////////////\n")
    for (i in 1..5) {
        println(i)

        //exemplo provocando uma exception
        val endereco = Any()

        // try fora do for
        //try {
            endereco as Endereco
        //} catch (e: ClassCastException) {
           // println(
//                "ClassCastException foi pega, " +
//                        "\n mais continua o for sempre pegando o cast"
//            )
        //}

    }
    println("fim funcao2")
}





















