package one_digital_inovation_collections

fun main() {
    val nomes = Array(3){""}

    nomes[0] = "Maria"
    nomes[1] = "Fermino"
    nomes[2] = "Papagaio"

    nomes.forEach{
        println(it)
    }
    println("**********")
    println("Ordenado :")
    println("**********")
    nomes.sort()
    nomes.forEach{
        println(it)
    }

    val nomes2 = arrayOf("Maria","Ana","Breno")
    println("**********")
    nomes2.sort()
    nomes2.forEach{
        println(it)
    }
}