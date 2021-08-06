package one_digital_inovation_collections

fun main(){
    val joao = funcionario("joao", 1200.0, "CLT")
    val pedro = funcionario("pedro", 1100.90,"PJ")
    val maria = funcionario("maria", 1250.45,"CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    println("------------------")
    //novo funcionario na lista mutável
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}
    println("------------------")
   // exclui funcionaio
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("---------SET---------")
    val funcionarioset = mutableSetOf(joao)
    funcionarioset.forEach{println(it)}

    println("------------------")
    //adicionou mais funcionario ao setOf mutável
    funcionarioset.add(maria)
    funcionarioset.add(pedro)
    funcionarioset.forEach{println(it)}
    println("------------------")
    //removeu maria do setOf
    funcionarioset.remove(maria)
    funcionarioset.forEach{println(it)}

}