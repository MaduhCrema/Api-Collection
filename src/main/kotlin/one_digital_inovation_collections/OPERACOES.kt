package one_digital_inovation_collections

fun main(){
    val salarios = doubleArrayOf(1560.90,1345.75,4450.25)

    for(salario in salarios){
        println(salario)
    }
    println("====================")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    val salmaiorque2500 = salarios.filter{it > 2500}
    println("====================")
    salmaiorque2500.forEach{
        println(it)
    }
    println("====================")
//se a expressão for verdadeira(boleana), imprime a quantidade de elementos
    println(salarios.count{it in 2500.0..5000.0})
    println("====================")
//acha o que eu procuro, no caso o valor 1345.75
    println(salarios.find{it == 1345.75})
    println("====================")
//caso que eu n tenho o varlo
    println(salarios.find{it == 1145.75})
    println("====================")
//vai procurar dentro da lista um elemento que corresponda com a expressão
    println(salarios.any{it == 1345.75})
    println(salarios.any{it == 11345.75})

}