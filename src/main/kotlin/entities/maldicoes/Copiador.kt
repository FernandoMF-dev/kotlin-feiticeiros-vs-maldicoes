package entities.maldicoes

import entities.Maldicao
import enums.TipoMaldicaoEnum

class Copiador(
	nome: String,
	peso: Double,
	altura: Double,
	humano: String
) : Maldicao(nome, peso, altura, TipoMaldicaoEnum.COPIADOR, humano)
