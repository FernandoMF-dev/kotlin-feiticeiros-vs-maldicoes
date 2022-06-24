package entities

import kotlin.random.Random

class Shikigami {
	companion object Constants {
		const val ATK_MIN: Int = 1
		const val ATK_MAX: Int = 30
	}

	val ataque: Int = Random.nextInt(ATK_MIN, ATK_MAX + 1)
}
