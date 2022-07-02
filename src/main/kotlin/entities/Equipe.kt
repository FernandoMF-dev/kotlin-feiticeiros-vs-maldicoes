package entities

class Equipe {
	val vivos: MutableList<Ser> = mutableListOf()
	val mortos: MutableList<Ser> = mutableListOf()

	fun rotacionarEquipe(): Unit {
		if (vivos.isEmpty()) {
			return
		}

		vivos.add(0, vivos.removeLast())
	}

	fun getProximo(): Ser {
		return vivos.first()
	}

	fun isDerrotado(): Boolean {
		return vivos.isEmpty()
	}

	fun removerMortos(): Unit {
		for (ser: Ser in vivos) {
			if (!ser.isVivo()) {
				mortos.add(ser)
				vivos.remove(ser)
			}
		}
	}

}
