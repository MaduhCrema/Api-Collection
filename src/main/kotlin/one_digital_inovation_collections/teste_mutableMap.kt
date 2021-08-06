package one_digital_inovation_collections

fun main() {
    val joao = funcionario("joao", 1200.0, "CLT")
    val pedro = funcionario("pedro", 1100.90,"PJ")
    val maria = funcionario("maria", 1250.45,"CLT")

    val repositorio = repositorio<funcionario>()

    repositorio.create(joao.nome,joao)
    repositorio.create(maria.nome,maria)
    repositorio.create(pedro.nome,pedro)

    println(repositorio.findById(joao.nome))
    println("-----------------------------")
    repositorio.findAll().forEach{println(it)}

    println("-----------------------------")
    println("Removida: ${repositorio.remove(maria.nome)}")

}