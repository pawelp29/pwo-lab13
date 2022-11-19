/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pwo.lab13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.math.BigDecimal;

/**
 *
 * @author pawelp
 */
public class TextTest {

    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5", "xx12x12x1x"})
    void cont5DigTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xx1x12x1x"})
    void cont5DigTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.cont5Dig(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd"})
    void digitCountTest(String str) {
        System.out.println("Test pozytywny dla: " + str);
        BigDecimal expResult = BigDecimal.valueOf(5);
        BigDecimal result = BigDecimal.valueOf(Text.digitCount(str));
        assertEquals(expResult, result);
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aartgbbASsd", "* % T & @", "xxxxx"})
    void containsNoDigitsTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.containsNoDigits(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5", "xx12x12x1x"})
    void containsNoDigitsTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.containsNoDigits(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"127836845", "0000", "999999999"})
    void containsOnlyDigitsTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.containsOnlyDigits(str));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5", "xx12x12x1x"})
    void containsOnlyDigitsTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.containsOnlyDigits(str));
    }

}
