package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Elige el ejercicio que quieras: ");
        int opcion = sc.nextInt();
        switch (opcion) {

            case 1:
                System.out.print("Escribe un número");
                int num = sc.nextInt();
                Ejercicios.Ex1(num);
                break;
            case 2 :
                System.out.print("Escribe un número");
                int num2 = sc.nextInt();
                Ejercicios.Ex2(num2);
                break;
            case 3:
                System.out.print("Escribe un número");
                int num3 = sc.nextInt();
                System.out.print("Escribe un número");
                int num4 = sc.nextInt();
                Ejercicios.Ex3(num3,num4);
                break;
            case 4:
                System.out.print("Escribe un número");
                int option = sc.nextInt();
                Ejercicios.Ex4(option);
                break;
            case 5:
                System.out.print("Escribe la hora");
                int hora = sc.nextInt();
                Ejercicios.Ex5(hora);
                break;
            case 6:
                System.out.print("Introduzca la nota: ");
                int nota = sc.nextInt();
                Ejercicios.Ex6(nota);
                break;
            case 7:
                System.out.print("Introduzca el dia: ");
                int day = sc.nextInt();
                System.out.print("Introduzca el mes ");
                int month = sc.nextInt();
                System.out.print("Introduzca el año ");
                int year = sc.nextInt();
                Ejercicios.Ex7(day, month, year);
                break;
            case 8:
                System.out.print("Introduzca la edad: ");
                int edad = sc.nextInt();
                Ejercicios.Ex10(edad);
                break;
        }
    }
}
