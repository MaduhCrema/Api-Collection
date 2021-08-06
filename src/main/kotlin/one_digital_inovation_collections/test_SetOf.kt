package one_digital_inovation_collections

fun main() {
    val pedro = funcionario("pedro",1500.0,"PJ")
    val marcia = funcionario("marcia", 1340.80,"CLT")
    val gabriel = funcionario("gabriel",1230.90,"PJ")
// setOf serve para criar um conjunto com os elementos que você quer
    val  funcionarios1= setOf(pedro,gabriel)
    val funcionarios2 = setOf(marcia)
    //uniao dos dois conjuntos
    val result = funcionarios1.union(funcionarios2)
    result.forEach{println(it)}
// subtração de conjuntos
    println("-----------------")
    val  funcionarios3= setOf(pedro,gabriel,marcia)
    val resultsub = funcionarios3.subtract(funcionarios2)
    resultsub.forEach{println(it)}
    //mostra a intersecção dos dois conjuntos
    println("------------------")
    val resultinter = funcionarios3.intersect(funcionarios2)
    resultinter.forEach{println(it)}
}