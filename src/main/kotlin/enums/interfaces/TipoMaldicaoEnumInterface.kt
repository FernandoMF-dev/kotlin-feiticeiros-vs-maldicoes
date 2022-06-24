package enums.interfaces

import entities.abstracts.Maldicao

interface TipoMaldicaoEnumInterface {
	fun novaMaldicao(nome: String, peso: Double, altura: Double, humano: String): Maldicao
}
