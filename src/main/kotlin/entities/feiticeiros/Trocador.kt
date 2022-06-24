package entities.feiticeiros

import entities.abstracts.Feiticeiro
import enums.TipoFeiticeiroEnum

class Trocador(
	nome: String,
	peso: Double,
	altura: Double,
	armas: Int,
	regiao: String
) : Feiticeiro(nome, peso, altura, TipoFeiticeiroEnum.TROCADOR, armas, regiao)
