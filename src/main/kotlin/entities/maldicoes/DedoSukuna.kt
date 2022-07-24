package entities.maldicoes

import entities.Equipe
import entities.Maldicao
import enums.TipoMaldicaoEnum
import kotlin.random.Random

class DedoSukuna(
	nome: String,
	peso: Double,
	altura: Double,
	humano: String
) : Maldicao(nome, peso, altura, TipoMaldicaoEnum.DEDO_SUKUNA, humano) {

	override fun atacarPrimario(inimigos: Equipe, aliados: Equipe) {
		if (Random.nextBoolean()) {
			getSerAlvo(inimigos, aliados).danificar()
		} else {
			getSerAlvo(inimigos, aliados).curar()
		}

		this.finalizarAtaque()
	}

}
