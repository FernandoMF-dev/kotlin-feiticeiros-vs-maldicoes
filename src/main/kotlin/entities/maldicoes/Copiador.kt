package entities.maldicoes

import entities.Equipe
import entities.Maldicao
import entities.Ser
import enums.TipoMaldicaoEnum

class Copiador(
	nome: String,
	peso: Double,
	altura: Double,
	humano: String
) : Maldicao(nome, peso, altura, TipoMaldicaoEnum.COPIADOR, humano) {

	override fun atacarPrimario(inimigos: Equipe, aliados: Equipe) {
		val equipeAlvo = getEquipeAlvo(inimigos, aliados)
		val quantidade = equipeAlvo.size()
		val pesoAltura = calcularPesoAlturaLacaios(equipeAlvo, quantidade)

		criarLacaios(quantidade, getEquipeAliada(inimigos, aliados), pesoAltura.first, pesoAltura.second)

		finalizarAtaque()
	}

	private fun calcularPesoAlturaLacaios(equipeAlvo: Equipe, quantidade: Int): Pair<Double, Double> {
		var peso = 0.0
		var altura = 0.0

		for (alvo: Ser in equipeAlvo.vivos) {
			peso += alvo.peso
			altura += alvo.altura
		}
		peso /= quantidade
		altura /= quantidade

		return Pair(peso, altura)
	}

	private fun criarLacaios(quantidade: Int, equipeAliada: Equipe, peso: Double, altura: Double) {
		var counter = 0

		while (counter < quantidade) {
			equipeAliada.addReforco(TipoMaldicaoEnum.BASICO.novaMaldicao("$nome (Lacaio $counter)", peso, altura))
			counter++
		}
	}
}
