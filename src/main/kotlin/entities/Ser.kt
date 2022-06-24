package entities

import enums.StatusEnum

abstract class Ser(nome: String, peso: Double, altura: Double, ataque: Int, energiaBase: Int) {
	var nome: String? = nome
	var peso: Double? = peso
	var altura: Double? = altura
	var ataque: Int? = ataque
	var energiaBase: Int? = energiaBase
	var energia: Int? = energiaBase

	var status: MutableList<StatusEnum> = mutableListOf()

	var postMortem: Boolean = false
}
