package entities

import enums.TipoMaldicaoEnum

abstract class Maldicao(
	nome: String,
	peso: Double,
	altura: Double,
	tipo: TipoMaldicaoEnum,
	humano: String
) : Ser(nome, peso, altura, tipo.ataque, tipo.energia) {

	var tipo: TipoMaldicaoEnum = tipo
	var humano: String = humano

}
