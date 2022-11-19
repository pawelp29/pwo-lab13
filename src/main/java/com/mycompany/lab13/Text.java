/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab13;

/**
 *
 * @author pawelp
 */
public class Text {

    static boolean cont5Dig(String str) {
        return str.replaceAll("[^0-9]", "").length() == 5;
    }

    static int digitCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }

        }
        return count;
    }
    
    static boolean containsNoDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return false;
            }

        }
        return true;
    }
    
    static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }

        }
        return true;
    }
}
