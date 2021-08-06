package one_digital_inovation_collections

class repositorio<T> {
    //T = valor generico
    private val map = mutableMapOf<String, T>()

    fun create(id:String,value:T){
        //put
        map[id] = value
    }
//retornar o valor de acordo com o  Id
    fun findById(id:String) = map[id]

    //traz todos os valores de T, ou seja todos os funcionarios
    fun findAll() = map.values
    //exclui os elementos
    fun remove(id:String) = map.remove(id)

}