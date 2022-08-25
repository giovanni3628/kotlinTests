import Cliente
import java.lang.Exception

fun main() {

    try {

        println("Digite o seu nome: ")
        val nome = readln()

        println("Digite seu endereço: ")
        val end = readln()

        println("Digite o seu telefone: ")
        val tel = readln()

        val cliente = Cliente(nome, end, tel)

        while (true){
            println()
            println("**Menu**")
            println("1 - Adicionar produto")
            println("2 - Remover produto")
            println("3 - Exibir produtos")
            println("4 - Sair")

            print("Opção: ")
            val opcao = readln().toInt()
            println()

            when(opcao){

                1 -> {
                    println("Digite o produto que deseja adicionar: ")
                    val prod = readln()
                    cliente.addCompra(prod)
                }
                2 -> {
                    println("Digite o produto que deseja remover: ")
                    val prod = readln()
                    cliente.removerCompra(prod)
                }
                3 -> {
                    cliente.exibirCompra()
                }
                4 -> break
                else -> print("Opção inválida")
            }
        }
    }catch (e: Exception){
        println(e.message)
    }
}