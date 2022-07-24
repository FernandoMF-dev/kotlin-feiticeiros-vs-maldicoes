package entities

import enums.TipoFeiticeiroEnum
import enums.TipoSerEnum

abstract class Feiticeiro(
	nome: String,
	peso: Double,
	altura: Double,
	tipo: TipoFeiticeiroEnum,
	armas: Int,
	regiao: String
) : Ser(TipoSerEnum.FEITICEIRO, nome, peso, altura, tipo.ataque, tipo.energia) {

	var tipo: TipoFeiticeiroEnum = tipo
	var armas: Int = armas
	var regiao: String = regiao

}
