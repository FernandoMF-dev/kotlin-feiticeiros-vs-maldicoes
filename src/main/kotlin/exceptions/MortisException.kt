package exceptions

import entities.Ser

class MortisException(val ser: Ser) : Exception()
