package enums

import entities.abstracts.Feiticeiro
import enums.interfaces.TipoFeiticeiroEnumInterface

enum class TipoFeiticeiroEnum(val id: Int, val ataque: Int = 0, val energia: Int = 100) : TipoFeiticeiroEnumInterface {
	TROCADOR(1, 20) {
		override fun novoFeiticeiro(): Feiticeiro {
			TODO("Not yet implemented")
		}
	},
	CRIADOR(2, 10) {
		override fun novoFeiticeiro(): Feiticeiro {
			TODO("Not yet implemented")
		}
	},
	ARMADO(3, 5) {
		override fun novoFeiticeiro(): Feiticeiro {
			TODO("Not yet implemented")
		}
	},
	DEVASTADOR(4, 50) {
		override fun novoFeiticeiro(): Feiticeiro {
			TODO("Not yet implemented")
		}
	}
}
