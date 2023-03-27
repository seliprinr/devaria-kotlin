import classes.Ave
import classes.Mamifero
import classes.Peixe
import classes.Reptil

/*

    -> Escrever um programa - OK
    -> Recebe um nome de animal vertebrado - OK
    -> De acordo com um filtro - OK
    -> Identifica qual dos grupos ele pertence (Mamífero, Réptil, Ave e Peixe) - OK
    -> Exibir os dados genéricos de cada animal - OK

 */

fun main() {
    println("Favor informar qual animal você deseja saber mais: ")
    val animalInformado = readLine()

    if(animalInformado.isNullOrBlank() || animalInformado.isNullOrEmpty()) {
        println("Animal informado não é válido.")
        return
    }

    val listaDeAnimaisBancoDados = arrayOf(
        Peixe("Tubarão", qtdNadadeiras = 2),
        Mamifero("Leão", 4),
        Ave("Gavião", 500,  consegueFazerMigracao = true),
        Reptil("Serpente", 8.0)
    )

    val animalSelecionado = listaDeAnimaisBancoDados.find { it.nome.equals(animalInformado , ignoreCase = true) }
    if(animalSelecionado == null){
        println("Animal selecionado não está na nossa base, tente novamente.")
        return
    }

    when (animalSelecionado){
        is Mamifero -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um Mamífero " +
                "e tem as seguintes características: é aquático ${animalSelecionado.isMamiferoAquatico}" +
                " pode botar ovo ${animalSelecionado.consegueBotarOvo}")
        is Reptil -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um Réptil " +
                "e tem as seguintes características: é terreste ${animalSelecionado.isReptilTerrestre}" +
                " quantidade de patas ${animalSelecionado.qtdPatas}")
        is Ave -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é uma Ave " +
                "e tem as seguintes características: sabe voar ${animalSelecionado.consegueVoar}" +
                " consegue fazer migração ${animalSelecionado.consegueFazerMigracao}")
        is Peixe -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um Peixe " +
                "e tem as seguintes características: de água salgada ${animalSelecionado.isPeixeAguaSalgada}" +
                " e carnívoro ${animalSelecionado.isCarnivoro}")
        else -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um animal não identificado ainda")
    }
}