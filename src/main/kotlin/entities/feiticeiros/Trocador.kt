package entities.feiticeiros

import entities.Feiticeiro
import enums.TipoFeiticeiroEnum

class Trocador(
	nome: String,
	peso: Double,
	altura: Double,
	armas: Int,
	regiao: String
) : Feiticeiro(nome, peso, altura, TipoFeiticeiroEnum.TROCADOR, armas, regiao)
