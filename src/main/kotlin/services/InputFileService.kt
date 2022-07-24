package services

import entities.Equipe
import entities.Feiticeiro
import entities.Maldicao
import enums.TipoFeiticeiroEnum
import enums.TipoMaldicaoEnum
import java.io.File

class InputFileService {

	companion object Constants {
		const val INPUT_PATH: String = "./input/"
		const val INPUT_FEITICEIROS: String = "feiticeiros.txt"
		const val INPUT_MALDICOES: String = "maldicoes.txt"
		const val SEPARATOR: String = " "
	}

	fun preencherFeiticeiros(equipe: Equipe) {
		File(INPUT_PATH + INPUT_FEITICEIROS).forEachLine {
			val line: List<String> = breakLineApart(it)
			val ser: Feiticeiro = TipoFeiticeiroEnum.fromId(line[0].toInt()).novoFeiticeiro(line[1], line[2].toDouble(), line[3].toDouble(), line[4].toInt(), line[5])
			equipe.addReforco(ser)
		}
	}

	fun preencherMaldicoes(equipe: Equipe) {
		File(INPUT_PATH + INPUT_MALDICOES).forEachLine {
			val line: List<String> = breakLineApart(it)
			val ser: Maldicao = TipoMaldicaoEnum.fromId(line[0].toInt()).novaMaldicao(line[1], line[2].toDouble(), line[3].toDouble(), line[4])
			equipe.addReforco(ser)
		}
	}

	private fun breakLineApart(line: String): List<String> {
		return line.split(SEPARATOR)
	}
}
