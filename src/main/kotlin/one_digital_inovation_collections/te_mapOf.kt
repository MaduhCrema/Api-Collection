package one_digital_inovation_collections

fun main() {
// cria  parametros
    val pair: Pair<String, Double> = Pair("João", 1500.90)
//alocação de mapa de cada pair
    val map1 = mapOf(pair)
//inicialização com dois "it", onde tem o nome e o valor
    map1.forEach{(k, v) -> println("Chave: $k e valor: $v")}
//outra forma  de inicializar o mapa por infix
    val map2 = mapOf("pedro" to 2500.0, "maria" to 3450.90)
    map2.forEach{(k, v) -> println("Chave: $k e valor: $v")}
}