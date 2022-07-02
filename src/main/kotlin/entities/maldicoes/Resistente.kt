package entities.maldicoes

import entities.Equipe
import entities.Maldicao
import enums.TipoMaldicaoEnum

class Resistente(
	nome: String,
	peso: Double,
	altura: Double,
	humano: String
) : Maldicao(nome, peso, altura, TipoMaldicaoEnum.RESISTENTE, humano) {

	companion object Constants {
		const val REGENERACAO: Int = 10
	}

	override fun atacarPrimario(inimigos: Equipe, aliados: Equipe) {
		this.curar(REGENERACAO)
		super.atacarPrimario(inimigos, aliados)
	}
}
