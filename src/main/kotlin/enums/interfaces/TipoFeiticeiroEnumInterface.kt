package enums.interfaces

import entities.Feiticeiro

interface TipoFeiticeiroEnumInterface {
	fun novoFeiticeiro(nome: String, peso: Double, altura: Double, armas: Int, regiao: String): Feiticeiro
}
