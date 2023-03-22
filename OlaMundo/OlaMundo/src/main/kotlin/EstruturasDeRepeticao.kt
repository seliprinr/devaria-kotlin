fun main(argumentos : Array<String>) {

    // for subindo
    for(indice in argumentos.indices){ // de 0 até a quantidade dos meus argumentos
        println("Percorrendo os argumentos posição: $indice e valor: ${argumentos[indice]}")
    }


    // for descendo
    for(indiceDecrescente in argumentos.size-1 downTo 0){
        println("Percorrendo os argumentos de forma decrescente posição: $indiceDecrescente e valor: ${argumentos[indiceDecrescente]}")
    }


    // foreach
    for(argumento in argumentos){
        println("Percorrendo os argumentos com foreach valor: $argumento")
    }


    // while
    var contadorArgumentosLidos = 0
    while (contadorArgumentosLidos < argumentos.size){
        println("Percorrendo os argumentos com while com argumentos lidos:${++contadorArgumentosLidos} " +
            "valor lido: ${argumentos[contadorArgumentosLidos-1]}")
    }


    // do while
    var contadorLoopsEfetuados = 0
    do {
        println("Percorrendo os argumentos com do while, total de loops: $contadorLoopsEfetuados " +
                " e valor lido ${argumentos[contadorLoopsEfetuados]}")
        contadorLoopsEfetuados++
    }while(contadorLoopsEfetuados < argumentos.size)

}