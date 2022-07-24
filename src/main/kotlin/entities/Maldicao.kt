package entities

import enums.TipoMaldicaoEnum
import enums.TipoSerEnum

abstract class Maldicao(
	nome: String,
	peso: Double,
	altura: Double,
	tipo: TipoMaldicaoEnum,
	humano: String
) : Ser(TipoSerEnum.MALDICAO, nome, peso, altura, tipo.ataque, tipo.energia) {

	var tipo: TipoMaldicaoEnum = tipo
	var humano: String = humano

}
