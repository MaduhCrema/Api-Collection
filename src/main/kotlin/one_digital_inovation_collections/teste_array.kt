package one_digital_inovation_collections

fun main(){
    val values = IntArray(5)

    values[0]= 1
    values[1]= 3
    values[2]= 2
    values[3]= 6
    values[4]= 5

    values.forEach{
        println(it)
    }

    values.sort()

    println("******")

    for(contador in values){
        println(contador)
    }
}