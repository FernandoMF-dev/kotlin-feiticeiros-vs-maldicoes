package entities.maldicoes

import entities.Maldicao
import enums.TipoMaldicaoEnum

class Resistente(
	nome: String,
	peso: Double,
	altura: Double,
	humano: String
) : Maldicao(nome, peso, altura, TipoMaldicaoEnum.RESISTENTE, humano)
