package entities.abstracts

import enums.MecanicaEnum
import enums.StatusEnum

abstract class Ser {
	private var nome: String? = null
	private var peso: Double? = null
	private var altura: Double? = null
	private var ataque: Int? = null
	private var energiaBase: Int? = null
	private var energia: Int? = null
	private var status: MutableList<StatusEnum> = mutableListOf()
	private var mecanicas: MutableList<MecanicaEnum> = mutableListOf()
}
