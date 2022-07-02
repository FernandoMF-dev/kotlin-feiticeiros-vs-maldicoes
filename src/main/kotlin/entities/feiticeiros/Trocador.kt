package entities.feiticeiros

import entities.Equipe
import entities.Feiticeiro
import enums.StatusEnum
import enums.TipoFeiticeiroEnum

class Trocador(
	nome: String,
	peso: Double,
	altura: Double,
	armas: Int,
	regiao: String
) : Feiticeiro(nome, peso, altura, TipoFeiticeiroEnum.TROCADOR, armas, regiao) {

	override fun atacarPrimario(inimigos: Equipe, aliados: Equipe) {
		if (getEquipeAlvo(inimigos, aliados).size() <= 1) {
			this.atacarSecundario(inimigos, aliados)
			return
		}

		getAlvo(inimigos, aliados).addStatus(StatusEnum.CONFUSO)
		this.finalizarAtaque()
	}

	override fun atacarSecundario(inimigos: Equipe, aliados: Equipe) {
		super.atacarPrimario(inimigos, aliados)
	}
}
