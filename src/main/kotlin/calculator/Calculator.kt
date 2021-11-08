package calculator

import kotlin.math.pow

class Calculator {

    //Declaring calculator methods
    fun plus(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun minus(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiply(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun squareRoot(num1: Int): Double {
        return num1.toDouble().pow(2)
    }

    fun power(num1: Int, num2: Int): Double {
        return num1.toDouble().pow(num2)
    }
}
