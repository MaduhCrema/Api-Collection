package one_digital_inovation_collections

fun main() {
    val salarios = arrayOf("2000".toBigDecimal(),"4500".toBigDecimal(),"1290".toBigDecimal())

    println("Soma = ${salarios.somatoria()}")
    println("Média = ${salarios.media()}")
}