/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab13.app;

import java.util.List;
import java.util.ArrayList;
import pwo.lab13.app.ProcessData.Action;

/**
 *
 * @author pawelp
 */
public class ProcessArgs {

    /*
        Wyszukuje w tablicy stringów pozycji, która może być
        zinterpretowana jako wartość typu ProcessData.Action.
        Wielkość czcionki nie ma znaczenia. Obowiązuje
        pierwsze dopasowanie. Jeżeli nie znajdzie to zwraca
        wartość UNDEFINE.
     */
    public static Action getAction(String[] args) {
        for (String arg : args) {
            try {
                return ProcessData.Action.valueOf(arg.toUpperCase());
            } catch (IllegalArgumentException e) {
            }
        }
        return ProcessData.Action.UNDEFINE;
    }

    /*
        Wyszukuje w tablicy stringów pozycje, które mogą być
        zinterpretowane jako liczby. Tworzy z tych liczb tablicę.
        Jeżeli nie ma liczb to zwraca pustą tablicę.
     */
    public static double[] getNumbers(String[] args) {
        List<Double> results = new ArrayList<>();
        for (String arg : args) {
            try {
                results.add(Double.valueOf(arg));
            } catch (NumberFormatException e) {
            }

        }
        return results.stream().mapToDouble(Double::doubleValue).toArray();
    }
}
