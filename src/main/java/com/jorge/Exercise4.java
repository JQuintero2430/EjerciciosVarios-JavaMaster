package com.jorge;

import java.util.Arrays;
import java.util.List;

//El siguiente requerimiento es para una lista de productos List<Producto>,
// de 3 a 5 elementos, se pide calcular el importe (precio por cantidad) y sumarlos.
// La clase Producto debe tener el atributo precio del tipo double y cantidad int,
// entonces utilizando stream convertir la lista de productos en el gran total del tipo double.
public class Exercise4 {
    public static void main(String[] args) {
        List<Producto> productosList = Arrays.asList(
                new Producto(101.0, 1),
                new Producto(123.3, 2),
                new Producto(63.0, 4)
        );

        double total = productosList.stream()
                .mapToDouble(p -> p.getPrecio() * p.getCantidad())
                .sum();

        System.out.println("Total: " + total);
    }
}