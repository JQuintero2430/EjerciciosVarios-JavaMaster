package com.jorge;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

//Como desafió consiste en un arreglo de 100 elementos del 1 al 100,
// del tipo int, utilizando el api stream se pide eliminar los divisibles en 10,
// luego convertir los elementos restante del flujo en tipo double y dividirlos en 2,
// para finalmente devolver la suma total de todos ellos usando el operador terminal reduce.
// El resultado debería ser 2250.0
public class Exercise1 {
    public static void main(String[] args) {
        int[] array = IntStream.rangeClosed(1,100).toArray();


        OptionalDouble result = Arrays.stream(array).filter(n ->n % 10 != 0)
                .mapToDouble(n -> (double) n / 2)
                .reduce(Double::sum);

        if(result.isPresent()) {
            System.out.println(result.getAsDouble());
        }else {
            System.out.println("No result");
        }
    }
}