package entities.maldicoes

import entities.Equipe
import entities.Maldicao
import enums.TipoMaldicaoEnum

class Sukuna(
	nome: String,
	peso: Double,
	altura: Double,
	humano: String
) : Maldicao(nome, peso, altura, TipoMaldicaoEnum.SUKUNA, humano) {

	companion object Constants {
		const val DEDOS: Int = 10
	}

	init {
		this.postMortem = true
	}

	override fun ativarPostMortem(inimigos: Equipe, aliados: Equipe) {
		var counter = 0

		while (counter < DEDOS) {
			aliados.addReforco(TipoMaldicaoEnum.DEDO_SUKUNA.novaMaldicao("$nome (Lacaio $counter)", peso, altura))
			counter++
		}
	}
}
