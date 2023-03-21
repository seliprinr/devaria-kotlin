fun main() {

    println("Favor informar o nome do convidado:")
    val nome = readLine()

    if(nome.isNullOrEmpty() || nome.isNullOrBlank()) {      // Nome vazio OU em branco?
        println("Nome informado não é válido")
        return
    }

    println("Favor informar a idade do convidado")
    val idade = readLine()?.toIntOrNull()

    if (idade == null || idade <= 0){
        println("A idade informada não é válida!")
        return
    }

    var estaConvidado = false
    when(nome){
        "Kaique" -> estaConvidado = true
        "Ale" -> estaConvidado = true
        "Rodrigo" -> estaConvidado = true
        "Alan" -> estaConvidado = true
        "Aldo" -> estaConvidado = true
        else -> estaConvidado = false
    }

    if(estaConvidado && idade >= 18){
        println("Bem vindo a festa Kotlin Devaria 2023")
    }else if(!estaConvidado){
        println("Você não está na lista de convidados, verifique com a pessoa que te chamou")
    } else{
        println("Você não tem 18 anos para entrar na festa")
    }
}