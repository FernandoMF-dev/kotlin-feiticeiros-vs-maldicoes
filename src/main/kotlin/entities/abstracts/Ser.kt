package entities.abstracts

import enums.MecanicaEnum
import enums.StatusEnum

abstract class Ser {
	var nome: String? = null
	var peso: Double? = null
	var altura: Double? = null
	var ataque: Int? = null
	var energiaBase: Int? = null
	var energia: Int? = null
	var status: MutableList<StatusEnum> = mutableListOf()
	var mecanicas: MutableList<MecanicaEnum> = mutableListOf()
}
