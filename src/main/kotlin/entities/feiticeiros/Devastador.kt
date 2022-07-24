package entities.feiticeiros

import entities.Equipe
import entities.Feiticeiro
import enums.TipoFeiticeiroEnum

class Devastador(
	nome: String,
	peso: Double,
	altura: Double,
	armas: Int,
	regiao: String
) : Feiticeiro(nome, peso, altura, TipoFeiticeiroEnum.DEVASTADOR, armas, regiao) {

	companion object Constants {
		const val CARGA_MAX: Int = 3
		const val REGENERACAO: Int = 20
	}

	private var carga: Int = 0

	override fun atacarPrimario(inimigos: Equipe, aliados: Equipe) {
		this.curar(REGENERACAO)
		carga++

		if (carga < CARGA_MAX) {
			super.atacarPrimario(inimigos, aliados)
			return
		}
		getSerAlvo(inimigos, aliados).danificar()

		this.finalizarAtaque()
	}
}
