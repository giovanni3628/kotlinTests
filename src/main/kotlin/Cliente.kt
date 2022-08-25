
class Cliente(
    var nome: String,
    var endereco: String,
    var telefone: String
) {

    private val listaDeCompras = mutableListOf<String>()
    val listaCompras: List<String> = listaDeCompras



    fun addCompra(compra: String){
        if (compra.isNotBlank()){
            listaDeCompras.add(compra)
            println("Produto adicionado com sucesso!")
        }else{
            println("Produto inválido!")
        }
    }

    fun removerCompra(compra: String){
        if (listaDeCompras.contains(compra)){
            listaDeCompras.remove(compra)
            println("Produto excluído com sucesso!")
        }else{
            println("O produto $compra não existe na lista!")
        }

    }

    fun exibirCompra(){
        println("**Listas de compras**")
        println("$listaDeCompras, ")
    }

    private fun checarDados(){
        if (nome.isBlank()){
            throw Exception("O cadastro foi preenchido incorretamente!")
        }
    }
}
