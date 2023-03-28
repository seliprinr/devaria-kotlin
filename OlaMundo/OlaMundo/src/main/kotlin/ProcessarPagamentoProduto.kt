import classes.FormaDePagamento
import classes.FormaPagamentoBoleto
import classes.FormaPagamentoEnum.Pix
import classes.FormaPagamentoEnum.Boleto
import classes.FormaPagamentoPix
import classes.Produto

/*

    -> Escrever um programa - OK
    -> Recebe os produtos a serem comprados - OK
    -> Receber a forma de pagamentos escolhido - OK
    -> De acordo com a forma de pagamento, efetua a compra utilizando o correto meio de pagamento - OK

 */


fun main(argumentos : Array<String>) {
    if(argumentos.isEmpty()){
        println("favor informar os produtos a serem comprados")
        return
    }

    val produtosDisponiveis = arrayOf(
        Produto("Tênis", 290.0),
        Produto("Bola", 220.0)
    )

    val produtosSelecionados = produtosDisponiveis.filter {
        argumentos.any { argumento -> it.nome.equals(argumento, ignoreCase = true) }
    }

    if (produtosSelecionados.isEmpty()){
        println("Os produtos selecionados não estão disponíveis")
        return
    }

    // -> Receber a forma de pagamento escolhida
    println("Favor informar a forma de pagamento desejada (Boleto, Pix)")
    val formaPagamentoSelecionada = readLine()

    if(formaPagamentoSelecionada.isNullOrEmpty() || formaPagamentoSelecionada.isNullOrEmpty()){
        println("Favor informar uma forma de pagamento válida")
        return
    }


    // -> De acordo com a forma de pagamento, efetua a compra utilizando o correto meio de pagamento
    val formaPagamento : FormaDePagamento = if(formaPagamentoSelecionada == Pix.toString()){
        FormaPagamentoPix()
    } else if (formaPagamentoSelecionada == Boleto.toString()){
        FormaPagamentoBoleto()
    } else {
        FormaDePagamento()
    }

    println("Seus produtos selecionados")
    produtosSelecionados.forEach { println(it.exibirDadosProduto()) }
    formaPagamento.efetuarPagamento()

}