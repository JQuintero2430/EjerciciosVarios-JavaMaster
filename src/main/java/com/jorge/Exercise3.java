package com.jorge;

import java.util.Arrays;

//El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel y eliminar repetidos usando el api stream.
//        Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el arreglo de primer nivel.
//        Por ejemplo, para el arreglo:
//        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
//        debería quedar:
//        {"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};
public class Exercise3 {
    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        String[] result = Arrays.stream(lenguajes)
                .flatMap(Arrays::stream)
                .distinct()
                .toArray(String[]::new);

        System.out.println(Arrays.toString(result));
    }
}