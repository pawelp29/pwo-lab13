/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lab13;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pawelp
 */
public class ExcGenTest {

    @Test
    public void testgenExc1() {
        System.out.println("Test: IllegalStateException");
        ExcGen excGen = new ExcGen();
        Exception exception
                = assertThrows(IllegalStateException.class, () -> excGen.gen(0));
        assertTrue(exception.getMessage().contains(ExcGen.MESSAGE_1));
    }
    
    @Test
    public void testgenExc2() {
        System.out.println("Test: IllegalArgumentException");
        ExcGen excGen = new ExcGen();
        Exception exception
                = assertThrows(IllegalArgumentException.class, () -> excGen.gen(1));
        assertTrue(exception.getMessage().contains(ExcGen.MESSAGE_2));
    }
    
    @Test
    public void testgenExc3() {
        System.out.println("Test: NullPointerException");
        ExcGen excGen = new ExcGen();
        Exception exception
                = assertThrows(NullPointerException.class, () -> excGen.gen(3));
        assertTrue(exception.getMessage().contains(ExcGen.MESSAGE_3));
    }

}
