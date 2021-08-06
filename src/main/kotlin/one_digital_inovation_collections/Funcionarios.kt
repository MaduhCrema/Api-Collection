package one_digital_inovation_collections

data class funcionario(val nome:String, val salario:Double, val tipoContratacao:String) {
    override fun toString(): String =
        """
                nome: $nome
                salário: $salario  
                          
            """.trimIndent()
}