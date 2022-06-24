package entities.feiticeiros

import entities.abstracts.Feiticeiro
import enums.TipoFeiticeiroEnum

class Devastador(
	nome: String,
	peso: Double,
	altura: Double,
	armas: Int,
	regiao: String
) : Feiticeiro(nome, peso, altura, TipoFeiticeiroEnum.DEVASTADOR, armas, regiao)
