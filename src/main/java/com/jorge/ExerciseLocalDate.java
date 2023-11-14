package com.jorge;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
// convertirla a una fecha del tipo LocalDate y calcular la edad de la persona
// de acuerdo a la fecha actual.
public class ExerciseLocalDate {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce una fecha de nacimiento en formato dd-mm-yyyy: ");
        String dato = keyboard.next();

        LocalDate fechaNacimiento = LocalDate.parse(dato, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();

        System.out.println("La edad de la persona es: " + edad + " años.");
    }
}
