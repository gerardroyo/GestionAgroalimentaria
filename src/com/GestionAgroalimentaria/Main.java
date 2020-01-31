package com.GestionAgroalimentaria;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        boolean exit = false;
        int optionUser;

        while(exit == false) {
            System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
            System.out.println("█                                                             █");
            System.out.println("█                  1.Dar de alta un producto                  █");
            System.out.println("█                                                             █");
            System.out.println("█                  2.Ver productos                            █");
            System.out.println("█                                                             █");
            System.out.println("█                  3.Salir                                    █");
            System.out.println("█                                                             █");
            System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");

            optionUser = keyboard.nextInt();

            switch(optionUser) {
                case 1:
                    GestionProductos.productoAlta();
                    break;
                case 2:
                    GestionProductos.verInfo();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("No has introducido uo de los numeros solicitados...");
            }

        }

    }
}
