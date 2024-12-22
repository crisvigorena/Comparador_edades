package com.inforcap.main;

import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fecha1,fecha2;
        System.out.println("Comparador de edades de java");
        System.out.println("Ingrese la primera fecha a comparar en formato [dd/mm/aaaa]: ");
        fecha1 = sc.next();
        System.out.println("Ingrese la segunda fecha a comparar en formato [dd/mm/aaaa]: ");
        fecha2 = sc.next();
        int dia1,dia2,mes1,mes2,year1,year2;
        dia1 = Integer.parseInt(fecha1.substring(0,2));
        mes1=Integer.parseInt(fecha1.substring(3,5));
        year1=Integer.parseInt(fecha1.substring(6));
        dia2=Integer.parseInt(fecha2.substring(0,2));
        mes2=Integer.parseInt(fecha2.substring(3,5));
        year2=Integer.parseInt(fecha2.substring(6));
        if (year1 < year2) {
            System.out.println("La persona1 es mayor que la persona2");
        } else if (year1 > year2) {
            System.out.println("La persona2 es mayor que la persona1");
        } else if (mes1 < mes2) {
            System.out.println("La persona1 es mayor que la persona2");
        } else if (mes1 > mes2) {
            System.out.println("La persona2 es mayor que la persona1");
        } else if (dia1 < dia2) {
            System.out.println("La persona1 es mayor que la persona2");
        } else if (dia1 > dia2) {
            System.out.println("La persona2 es mayor que la persona1");
        } else System.out.println("Las dos personas nacieron el mismo dia");
    }
}

