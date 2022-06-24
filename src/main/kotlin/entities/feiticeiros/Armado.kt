package entities.feiticeiros

import entities.Feiticeiro
import enums.TipoFeiticeiroEnum

class Armado(
	nome: String,
	peso: Double,
	altura: Double,
	armas: Int,
	regiao: String
) : Feiticeiro(nome, peso, altura, TipoFeiticeiroEnum.ARMADO, armas, regiao)
