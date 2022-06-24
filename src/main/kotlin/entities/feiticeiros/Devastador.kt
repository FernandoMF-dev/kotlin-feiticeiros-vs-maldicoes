package entities.feiticeiros

import entities.Feiticeiro
import enums.TipoFeiticeiroEnum

class Devastador(
	nome: String,
	peso: Double,
	altura: Double,
	armas: Int,
	regiao: String
) : Feiticeiro(nome, peso, altura, TipoFeiticeiroEnum.DEVASTADOR, armas, regiao)
