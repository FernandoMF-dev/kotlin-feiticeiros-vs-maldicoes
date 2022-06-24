package entities.maldicoes

import entities.Maldicao
import enums.TipoMaldicaoEnum

class DedoSukuna(
	nome: String,
	peso: Double,
	altura: Double,
	humano: String
) : Maldicao(nome, peso, altura, TipoMaldicaoEnum.DEDO_SUKUNA, humano)
