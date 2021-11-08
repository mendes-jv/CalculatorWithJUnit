import calculator.Calculator
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculatorTest {

    private val calculator = Calculator()

    @Test //Tests plus function
    fun plus() {
        assertEquals(9, calculator.plus(6, 3))
    }

    @Test //Tests minus function
    fun minus() {
        assertEquals(3, calculator.minus(6, 3))
    }

    @Test //Tests multiply function
    fun multiply() {
        assertEquals(18, calculator.multiply(6, 3))
    }

    @Test //Tests divide function
    fun divide() {
        assertEquals(2, calculator.divide(6, 3))
    }

    @Test //Tests function that need to output a square root of a number
    fun squareRoot() {
        assertEquals(36.0, calculator.squareRoot(6))
    }

    @Test //Tests power function
    fun power() {
        assertEquals(1.0, calculator.power(6, 0))
    }
}
