package com.jorge;

import java.util.Arrays;
import java.util.OptionalInt;

//El siguiente ejercicio es obtener el número mayor de un arreglo, pero utilizando
// programación funcional, implementando la expresión lambda Function<T, R>
// (que viene predefinida) con el api stream y operador reduce.
public class Exercise2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        OptionalInt max = Arrays.stream(array).reduce(Math::max);

        System.out.println("El numero mayor es " + max.getAsInt());
    }
}