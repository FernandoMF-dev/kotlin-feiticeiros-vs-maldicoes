package entities

import enums.StatusEnum
import enums.TipoSerEnum
import exceptions.MortisException

abstract class Ser(tipoSer: TipoSerEnum, nome: String, peso: Double, altura: Double, ataque: Int, energiaBase: Int) {
	val tipoSer: TipoSerEnum = tipoSer
	var nome: String = nome
	var peso: Double = peso
	var altura: Double = altura
	var ataque: Int = ataque
	var energiaBase: Int = energiaBase
	var energia: Int = energiaBase

	var status: MutableList<StatusEnum> = mutableListOf()

	var postMortem: Boolean = false

	open fun isVivo(): Boolean {
		return energia > 0
	}

	fun addStatus(status: StatusEnum) {
		if (this.status.contains(status)) {
			return
		}
		this.status.add(status)
	}

	fun hasStatus(status: StatusEnum): Boolean {
		return this.status.contains(status)
	}

	open fun curar() {
		energia = energiaBase
	}

	open fun curar(cura: Int) {
		energia = energiaBase.coerceAtMost(energia + cura)
	}

	open fun danificar() {
		energia = energia.coerceAtLeast(0)
		this.finalizarDanificar()
	}

	open fun danificar(ataque: Int) {
		energia -= ataque
		this.finalizarDanificar()
	}

	open fun getEquipeAliada(inimigos: Equipe, aliados: Equipe): Equipe {
		return if (hasStatus(StatusEnum.CONFUSO)) inimigos else aliados
	}

	open fun getEquipeAlvo(inimigos: Equipe, aliados: Equipe): Equipe {
		return if (hasStatus(StatusEnum.CONFUSO)) aliados else inimigos
	}

	open fun getSerAlvo(inimigos: Equipe, aliados: Equipe): Ser {
		val equipeAlvo: Equipe = getEquipeAlvo(inimigos, aliados)

		if (this == equipeAlvo.getProximo()) {
			return equipeAlvo.getProximo(1)
		}
		return equipeAlvo.getProximo()
	}

	/**
	 * Ataque usado quando se é o primeiro a atacar num turno
	 */
	open fun atacarPrimario(inimigos: Equipe, aliados: Equipe) {
		getSerAlvo(inimigos, aliados).danificar(this.ataque)

		this.finalizarAtaque()
	}

	/**
	 * Ataque usado quando se é o segundo a atacar num turno
	 */
	open fun atacarSecundario(inimigos: Equipe, aliados: Equipe) {
		this.atacarPrimario(inimigos, aliados)
	}

	open fun ativarPostMortem(inimigos: Equipe, aliados: Equipe) {
		throw NotImplementedError("'Post Mortem' não implementado")
	}

	fun finalizarAtaque() {
		status.remove(StatusEnum.CONFUSO)
	}

	private fun finalizarDanificar() {
		if (!this.isVivo()) {
			throw MortisException(this)
		}
	}

}
