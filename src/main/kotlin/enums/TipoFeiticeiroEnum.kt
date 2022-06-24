package enums

import entities.abstracts.Feiticeiro
import entities.feiticeiros.Armado
import entities.feiticeiros.Criador
import entities.feiticeiros.Devastador
import entities.feiticeiros.Trocador
import enums.interfaces.TipoFeiticeiroEnumInterface

enum class TipoFeiticeiroEnum(val id: Int, val ataque: Int = 0, val energia: Int = 100) : TipoFeiticeiroEnumInterface {
	TROCADOR(1, 20) {
		override fun novoFeiticeiro(nome: String, peso: Double, altura: Double, armas: Int, regiao: String): Feiticeiro {
			return Trocador(nome, peso, altura, armas, regiao)
		}
	},
	CRIADOR(2, 10) {
		override fun novoFeiticeiro(nome: String, peso: Double, altura: Double, armas: Int, regiao: String): Feiticeiro {
			return Criador(nome, peso, altura, armas, regiao)
		}
	},
	ARMADO(3, 5) {
		override fun novoFeiticeiro(nome: String, peso: Double, altura: Double, armas: Int, regiao: String): Feiticeiro {
			return Armado(nome, peso, altura, armas, regiao)
		}
	},
	DEVASTADOR(4, 50) {
		override fun novoFeiticeiro(nome: String, peso: Double, altura: Double, armas: Int, regiao: String): Feiticeiro {
			return Devastador(nome, peso, altura, armas, regiao)
		}
	}
}
