package enums.interfaces

import entities.abstracts.Feiticeiro

interface TipoFeiticeiroEnumInterface {
	fun novoFeiticeiro(nome: String, peso: Double, altura: Double, armas: Int, regiao: String): Feiticeiro
}
