package prog2.ha1.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Retro calculator")
class CalculatorTest {

    @Test
    @DisplayName("should display correct number after pressing digit keys")
    void testDigitInput() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(4);
        calc.pressDigitKey(2);

        String expected = "42";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should display result after adding two positive numbers")
    void testPositiveAddition() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(2);
        calc.pressBinaryOperationKey("+");
        calc.pressDigitKey(2);
        calc.pressEqualsKey();

        String expected = "4";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }

    //TODO hier weitere Tests erstellen
    @Test
    @DisplayName("Display the multiplication between numbers.")
    void testMultiplikation() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(8);
        calc.pressBinaryOperationKey("x");
        calc.pressDigitKey(8);
        calc.pressEqualsKey();

        String expected = "64";
        String actual = calc.readScreen();

        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Squareroot Test")
    void testSquereroot() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(9);
        calc.pressUnaryOperationKey("Wurzel");


        String expected = "3";
        String actual = calc.readScreen();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Division with Zero Test.")
    void DivisionWithZero() {
        Calculator calc = new Calculator();

        calc.pressDigitKey(1);
        calc.pressBinaryOperationKey("/");
        calc.pressDigitKey(0);
        calc.pressEqualsKey();

        String expected = "Error";
        String actual = calc.readScreen();
        assertEquals(expected, actual);

    }
}

