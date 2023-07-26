package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombrePortador;
        String apellidoPortador;
        byte edad;
        int numeroDeUsosTarjetaUltimoMes;
        int montoEnPesosDeComprasDeProductosAseoConLaTarjeta;
        String montoProductosAlimenticiosConLaTarjeta;
        int montoDeOtrosProductosConLaTarjeta;

        //Inicializar las variables
        Scanner teclado=new Scanner(System.in);

        System.out.print("****Le damos la bienvenida a almacenes exito****");

        System.out.print("señor usuario por favor digite su nombre: ");
        nombrePortador=teclado.nextLine();

        System.out.print("señor usuario por favor digite su apellido: ");
        apellidoPortador=teclado.nextLine();

        System.out.print("señor usuario por favor digite su edad: ");
        edad=teclado.nextByte();

        System.out.print("señor usuario por favor digite cuantas veces a utilizado su tarjeta durante el ultimo mes: ");
        numeroDeUsosTarjetaUltimoMes=teclado.nextInt();

        System.out.print("señor usuario por favor digite el monto en pesos de compras en productos de aseo comprados con la tarjeta: ");
         montoEnPesosDeComprasDeProductosAseoConLaTarjeta=teclado.nextInt();

        System.out.print("señor usuario por favor digite monto en pesos de compras de productos alimenticios comprados con la tarjeta: ");
        montoProductosAlimenticiosConLaTarjeta=teclado.nextLine();

        System.out.print("señor usuario por favor digite el monto de otros productos comprados con la tarjeta: ");
        montoDeOtrosProductosConLaTarjeta=teclado.nextInt();

        //Prcesando las entradas

         //Proceso
        double puntaje1=25%;
        if (puntaje1>0.25%){
            System.out.println("Usted aplica para el auxilio de la deuda TOTAL");
        }else {
            System.out.println("Usted no aplica para el auxilio de la deuda TOTAL");
        }

    }
}