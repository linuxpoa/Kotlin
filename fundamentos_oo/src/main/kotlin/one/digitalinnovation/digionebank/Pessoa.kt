package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Marco"
    var cpf: String = "123.456.789-10"
    private set
    /*inner class Endereco {
        var rua: String = "Rua Teste"
    }*/
}

fun main(){
    val Marco = Pessoa()
        
    println(Marco)
    println(Marco.nome)
    println(Marco.cpf)
    
    /*println(Marco.Endereco().rua)*/
}