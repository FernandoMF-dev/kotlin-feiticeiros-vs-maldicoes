package enums

import entities.Maldicao
import entities.maldicoes.Basico
import entities.maldicoes.Copiador
import entities.maldicoes.DedoSukuna
import entities.maldicoes.Resistente
import entities.maldicoes.Sukuna
import enums.interfaces.TipoMaldicaoEnumInterface

enum class TipoMaldicaoEnum(val id: Int, val ataque: Int = 0, val energia: Int = 200) : TipoMaldicaoEnumInterface {
	BASICO(1, 3, 50) {
		override fun novaMaldicao(nome: String, peso: Double, altura: Double, humano: String): Maldicao {
			return Basico(nome, peso, altura, humano)
		}
	},
	COPIADOR(2, 25, 400) {
		override fun novaMaldicao(nome: String, peso: Double, altura: Double, humano: String): Maldicao {
			return Copiador(nome, peso, altura, humano)
		}
	},
	RESISTENTE(3) {
		override fun novaMaldicao(nome: String, peso: Double, altura: Double, humano: String): Maldicao {
			return Resistente(nome, peso, altura, humano)
		}
	},
	DEDO_SUKUNA(4) {
		override fun novaMaldicao(nome: String, peso: Double, altura: Double, humano: String): Maldicao {
			return DedoSukuna(nome, peso, altura, humano)
		}
	},
	SUKUNA(5, 60) {
		override fun novaMaldicao(nome: String, peso: Double, altura: Double, humano: String): Maldicao {
			return Sukuna(nome, peso, altura, humano)
		}
	};

	companion object Static {
		private val map = TipoMaldicaoEnum.values().associateBy(TipoMaldicaoEnum::id)
		fun fromId(type: Int) = map[type] ?: throw IllegalArgumentException()
	}
}
