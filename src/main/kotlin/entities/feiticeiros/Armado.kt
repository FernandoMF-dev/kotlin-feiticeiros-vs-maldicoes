package entities.feiticeiros

import entities.Equipe
import entities.Feiticeiro
import enums.TipoFeiticeiroEnum

class Armado(
	nome: String,
	peso: Double,
	altura: Double,
	armas: Int,
	regiao: String
) : Feiticeiro(nome, peso, altura, TipoFeiticeiroEnum.ARMADO, armas, regiao) {

	override fun atacarPrimario(inimigos: Equipe, aliados: Equipe) {
		getAlvo(inimigos, aliados).danificar(this.ataque * this.armas)

		this.finalizarAtaque()
	}
}
