package entities.feiticeiros

import entities.Feiticeiro
import entities.Shikigami
import enums.TipoFeiticeiroEnum

class Criador(
	nome: String,
	peso: Double,
	altura: Double,
	armas: Int,
	regiao: String
) : Feiticeiro(nome, peso, altura, TipoFeiticeiroEnum.CRIADOR, armas, regiao) {
	var shikigamis: MutableList<Shikigami> = mutableListOf()
}
