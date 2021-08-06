package one_digital_inovation_collections

fun main() {
    val joao = funcionario("joao", 1200.0, "CLT")
    val pedro = funcionario("pedro", 1100.90,"PJ")
    val maria = funcionario("maria", 1250.45,"CLT")

    //inicializar a lista
    val funcionarios = listOf(joao, pedro, maria)
        funcionarios.forEach{
            println(it)
       }
    println("-------------------------")
    println(funcionarios.find{it.nome == "maria"})
    println("------------------------")
    //ordenar qual parametro, no caso salario e imprime
    funcionarios.sortedBy{it.salario}.forEach{println(it)}
    println("------------------------")
    //agrupa por parametro, no caso  e imprime
    funcionarios.groupBy{it.tipoContratacao}.forEach{println(it)}
}
