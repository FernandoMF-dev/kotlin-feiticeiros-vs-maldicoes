package entities

import enums.TipoSerEnum

class Turno(val ordem: Int, val iniciativa: TipoSerEnum) {
	val historico = mutableListOf<String>()

	fun imprimirHistorico() {
		historico.forEach { println(it) }
	}

	fun addHistorico(novoHistorico: List<String>) {
		historico.addAll(novoHistorico)
	}
}
