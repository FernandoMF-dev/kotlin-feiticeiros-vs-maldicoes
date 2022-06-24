package enums.interfaces

import entities.Maldicao

interface TipoMaldicaoEnumInterface {
	fun novaMaldicao(nome: String, peso: Double, altura: Double, humano: String): Maldicao
}
