package entities.feiticeiros

import entities.Equipe
import entities.Feiticeiro
import entities.Ser
import entities.Shikigami
import enums.TipoFeiticeiroEnum

class Criador(
	nome: String,
	peso: Double,
	altura: Double,
	armas: Int,
	regiao: String
) : Feiticeiro(nome, peso, altura, TipoFeiticeiroEnum.CRIADOR, armas, regiao) {
	private var shikigamis: MutableList<Shikigami> = mutableListOf()

	override fun atacarPrimario(inimigos: Equipe, aliados: Equipe) {
		val alvo: Ser = getAlvo(inimigos, aliados)

		super.atacarPrimario(inimigos, aliados)

		criarShikigami()
		for (shikigami: Shikigami in shikigamis) {
			alvo.danificar(shikigami.ataque)
		}

		this.finalizarAtaque()
	}

	private fun criarShikigami() {
		shikigamis.add(Shikigami())
	}

}
