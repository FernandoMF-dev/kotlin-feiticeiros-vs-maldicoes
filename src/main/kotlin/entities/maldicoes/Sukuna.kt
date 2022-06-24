package entities.maldicoes

import entities.Maldicao
import enums.TipoMaldicaoEnum

class Sukuna(
	nome: String,
	peso: Double,
	altura: Double,
	humano: String
) : Maldicao(nome, peso, altura, TipoMaldicaoEnum.SUKUNA, humano)
