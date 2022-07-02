package entities

import enums.TipoFeiticeiroEnum

abstract class Feiticeiro(
	nome: String,
	peso: Double,
	altura: Double,
	tipo: TipoFeiticeiroEnum,
	armas: Int,
	regiao: String
) : Ser(nome, peso, altura, tipo.ataque, tipo.energia) {

	var tipo: TipoFeiticeiroEnum = tipo
	var armas: Int = armas
	var regiao: String = regiao

}
