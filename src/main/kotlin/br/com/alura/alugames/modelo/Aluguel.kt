package br.com.alura.alugames.modelo

import java.time.LocalDate
import java.time.Period

data class Aluguel(
    val gamer: Gamer,
    val jogo: Jogo,
    val periodo: Periodo
){
    val valorDoAluguel = jogo.preco * periodo.emDias
    override fun toString(): String {
        return "Aluguel do : ${jogo.titulo} \n por :${gamer.nome}\n Pelo valor de :$valorDoAluguel"
    }

}
