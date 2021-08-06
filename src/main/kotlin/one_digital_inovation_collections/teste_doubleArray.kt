package one_digital_inovation_collections

fun main(){
    val valores = DoubleArray(3)
    valores[0]=1233.54
    valores[1]=1200.78
    valores[2]=1500.80
    valores.forEach{
        println(it)
    }
    println("-----------------------")
//mexe com cada indice separadamente
    valores.forEachIndexed{ index, valor ->
        valores[index] = valor*1.1
    }

    valores.forEach{
        println(it)
    }
    println("------------------")
    val valores2 = doubleArrayOf(1500.0, 1340.2, 3343.43)

    valores2.sort()
    valores2.forEach {
        println(it)
    }

}