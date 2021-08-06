package one_digital_inovation_collections

import java.math.BigDecimal
// chama array, pois a lista é de arrayOf, bigDecimal o Tipo
//.somatoria() o nome da função
//this.reduce acumula os elementos na somatoria, acc é onde acumular e soma o valor
fun Array<BigDecimal>.somatoria()= this.reduce{
    acc,valor -> acc + valor
}
//.media() nome da função
//se a media estiver vazia o bigDecimal recebe zero
//se não ocorre a somatoria / pelo tamanho do Array e convertido para bigDecimal
fun Array<BigDecimal>.media()=
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()