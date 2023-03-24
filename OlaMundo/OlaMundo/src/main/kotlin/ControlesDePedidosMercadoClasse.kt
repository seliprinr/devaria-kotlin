import classes.Produto

/*

    -> Escrever um programa - OK
    -> Que recebe alguns produtos como argumento - OK
    -> Validar se esses produtos estão na lista de itens disponíveis do mercado - OK
    -> Caso estejam, avisar o usuário quais produtos estão disponíveis - OK
    -> Quais não estão - OK
    -> Exibir a lista de produtos disponíveis ordenados por ordem alfabética - OK

 */

fun main(argumentos: Array<String>) {
    if(argumentos.isEmpty()) {
        println("Favor informar a lista de produtos que deseja comprar:")
        return
    }

    val itensDisponiveis = arrayOf(
        Produto(nome = "Arroz", preco = 35.10),
        Produto("Azeite", 16.98),
        Produto("Carne", 59.89),
        Produto("Açucar", 2.40)
    )

    // -> Validar se esses produtos estão na lista de itens disponíveis do mercado - OK
    val itensSelecionadosDisponiveis = itensDisponiveis.filter {
            produto -> argumentos.any { argumento ->
                argumento.equals(produto.nome, ignoreCase = true)
            }
    }

    // -> Caso estejam, avisar o usuário quais produtos estão disponíveis - OK
    for(itenSelecionadoDisponivel in itensSelecionadosDisponiveis) {
        println(itenSelecionadoDisponivel.exibirDadosProduto())
    }

    // -> Quais não estão - OK
    val argumentosSelecionadosNaoDisponiveis = argumentos.filter {
        argumento -> !itensDisponiveis.any {
            produto -> produto.nome.equals(argumento, ignoreCase = true)
        }
    }

    argumentosSelecionadosNaoDisponiveis.forEach {
        println("Este produto nós não temos infelizmente: $it")
    }

    // -> Exibir a lista de produtos disponíveis ordenados por ordem alfabética - OK
    itensDisponiveis.sortBy { it.nome }
    itensDisponiveis.forEach { println("Confira este produto disponível: ${it.exibirDadosProduto()}") }
}