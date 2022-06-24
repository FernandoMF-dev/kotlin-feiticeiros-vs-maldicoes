package enums

import entities.Maldicao
import enums.interfaces.TipoMaldicaoEnumInterface

enum class TipoMaldicaoEnum(val id: Int, val ataque: Int = 0, val energia: Int = 200) : TipoMaldicaoEnumInterface {
	BASICO(1, 3, 50) {
		override fun novaMaldicao(nome: String, peso: Double, altura: Double, humano: String): Maldicao {
			TODO("Not yet implemented")
		}
	},
	COPIADOR(2, 25, 400) {
		override fun novaMaldicao(nome: String, peso: Double, altura: Double, humano: String): Maldicao {
			TODO("Not yet implemented")
		}
	},
	RESISTENTE(3) {
		override fun novaMaldicao(nome: String, peso: Double, altura: Double, humano: String): Maldicao {
			TODO("Not yet implemented")
		}
	},
	DEDO_SUKUNA(4) {
		override fun novaMaldicao(nome: String, peso: Double, altura: Double, humano: String): Maldicao {
			TODO("Not yet implemented")
		}
	},
	SUKUNA(5, 60) {
		override fun novaMaldicao(nome: String, peso: Double, altura: Double, humano: String): Maldicao {
			TODO("Not yet implemented")
		}
	}
}
