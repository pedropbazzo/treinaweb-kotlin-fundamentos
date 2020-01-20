package main

import java.util.*

fun main() {
    println("Olá, mundo!!")
    println("Curso de Kotlin da TreinaWeb");
    var opcao: Int? = 0
    while (opcao == 0) {
        var nomeContato: String? = null // Safe Call Operator
        val emailContato: String
        var idadeContato: Int? = null
        println("Digite o nome do contato")
        nomeContato = readLine().toString()
        println("Digite o email do contato")
        emailContato = readLine().toString()
        println("Digite a idade do contato")
        idadeContato = readLine()?.toInt()

        println("O nome do contato é: $nomeContato que possui ${nomeContato?.length} caracteres")
        println("O email do contato é: $emailContato")
        println("A idade do contato é: $idadeContato")

        if (idadeContato != null) {
            when (idadeContato) {
                in 1..17 -> println("O contato é menor de idade")
                in 18..60 -> {
                    println("o contato já pode ser preso")
                    println("O contato é adulto")
                }
                else -> println("O contato é idoso")
            }
        }

        println(nomeContato.equals("Maria"))
        println(nomeContato?.reversed())
        println(nomeContato?.slice(1..3))
        println(nomeContato?.get(3))

        println("Deseja continuar? 0 - SIM / 1 - NÃO")
        opcao = readLine()?.toInt()
    }

    println("Obrigado por utilizar nosso gerenciamento de contatos")

}