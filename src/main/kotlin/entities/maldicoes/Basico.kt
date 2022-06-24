package entities.maldicoes

import entities.Maldicao
import enums.TipoMaldicaoEnum

class Basico(
	nome: String,
	peso: Double,
	altura: Double,
	humano: String
) : Maldicao(nome, peso, altura, TipoMaldicaoEnum.BASICO, humano)
