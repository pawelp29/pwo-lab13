/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab13;

/**
 *
 * @author pawelp
 */
public class Number {

    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static boolean isEven(int i) {
        return !isOdd(i);
    }
}
