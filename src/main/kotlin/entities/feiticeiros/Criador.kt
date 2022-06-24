package entities.feiticeiros

import entities.abstracts.Feiticeiro
import enums.TipoFeiticeiroEnum

class Criador(
	nome: String,
	peso: Double,
	altura: Double,
	armas: Int,
	regiao: String
) : Feiticeiro(nome, peso, altura, TipoFeiticeiroEnum.CRIADOR, armas, regiao)
