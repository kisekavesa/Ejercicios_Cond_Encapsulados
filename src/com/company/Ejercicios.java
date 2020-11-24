package com.company;

import java.util.Scanner;

public class Ejercicios {

    public static boolean Ex1(int num) {

        boolean retorn;

        if (num < 0) {
            retorn = false;
        } else {
            retorn = true;
        }
        return retorn;
    }

    public static boolean Ex2(int num2) {

        boolean retorn;
        int mult = 2;
        int resto = num2 % mult;

        if (resto == 0) {
            retorn = true;
        } else {
            retorn = false;
        }
        return retorn;
    }

    public static int Ex3(int num3, int num4) {

        if (num3 < num4) {
            return num4;
        } else {
            return num3;
        }
    }

    public static String Ex4(int option) {

        String week[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        switch (option) {
            case 1:
                return week[0];
            case 2:
                return week[1];
            case 3:
                return week[2];
            case 4:
                return week[3];
            case 5:
                return week[4];
            case 6:
                return week[5];
            case 7:
                return week[6];
        }
        return "";
    }

    public static String Ex5(int hora) {

        if (hora > 0 & hora < 24) {
            if (hora < 8) {
                return "Es de madrugada";
            }
            if (hora > 8 & hora < 12) {
                return "Es por la mañana";
            }
            if (hora > 12 & hora < 17) {
                return "Es mediodía";
            }
            if (hora > 17 & hora < 20) {
                return "Es por la tarde";
            }
            if (hora > 20) {
                return "Es de noche";
            }
        }
        return "";
    }

    public static String Ex6(int nota) {

        if (nota >= 0 && nota < 10) {
            if (nota < 5) {
                return "Has suspendido";
            }
            if (nota == 5) {
                return "Suficiente";
            }
            if (nota == 6) {
                return "Bien";
            }
            if (nota == 7 || nota == 8) {
                return "Notable";
            }
            if (nota == 9 || nota == 10) {
                return "Sobresaliente";
            }
        }
        return "";
    }

    public static boolean Ex7(int day, int month, int year) {

        boolean tof;

        if (day > 0 && month > 0 && month > 0 && year > 0) {
            if (day < 30 && month <= 12 && year < 2021) {
                tof = true;
            }else {
                tof = false;
            }
        }else {
            tof = false;
        }
        return tof;
    }

    public static String Ex10(int edad){

        if (edad > 0){
            if (edad < 18){
                return "Es menor";
            }else {
                return "Es mayor";
            }
        }
        else {
            return "";
        }
    }

}