package entities

class Equipe {
	private val vivos: MutableList<Ser> = mutableListOf()
	private val mortos: MutableList<Ser> = mutableListOf()

	fun size(): Int {
		return vivos.size
	}

	fun getProximo(): Ser {
		return this.getProximo(0)
	}

	fun getProximo(index: Int): Ser {
		return vivos[index]
	}

	fun isDerrotado(): Boolean {
		return vivos.isEmpty()
	}

	fun rotacionarEquipe() {
		if (vivos.isEmpty()) {
			return
		}

		vivos.add(0, vivos.removeLast())
	}

	fun removerMortos() {
		for (ser: Ser in vivos) {
			if (!ser.isVivo()) {
				mortos.add(ser)
				vivos.remove(ser)
			}
		}
	}

}
