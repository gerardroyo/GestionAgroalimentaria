package com.GestionAgroalimentaria;

import com.sun.xml.internal.ws.util.xml.CDATA;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProductos {
    private static Scanner keyboard = new Scanner(System.in);

    private static ArrayList<Productos> Productos = new ArrayList<Productos>();
    private static boolean noRepeat = false;

    public static void productoAlta() {

        System.out.println("Codigo de producto: ");
        String codigo = keyboard.nextLine();
        for(Productos a: Productos) {
            if(a.getCodigo() == codigo) {
                noRepeat = true;
            }

        }
        if(noRepeat == false){
            System.out.println("Fecha de caducidad: ");
            String FechaCaducidad = keyboard.nextLine();

            System.out.println("Numero de lote: ");
            int lote = keyboard.nextInt();

            System.out.println("Fecha de envasado: ");
            String envasado = keyboard.nextLine();
            keyboard.nextLine();

            System.out.println("País de origen: ");
            String origen = keyboard.nextLine();

            System.out.println("Que tipo de producto es? (fresco, refrigerado o congelado)");
            String tipoProducto = keyboard.nextLine();
            int organismo;
            int tempMantenimiento;
            switch(tipoProducto){
                case "fresco":
                    Productos.add(new Fresco(codigo, FechaCaducidad, lote, envasado, origen));
                    System.out.println("Produto añadido correctamente.");
                    break;
                case "refrigerado":
                    System.out.println("Organismo Supervisor: ");
                    organismo = keyboard.nextInt();

                    System.out.println("Temperatura de Mantenimiento: ");
                    tempMantenimiento = keyboard.nextInt();

                    Productos.add(new Refrigerado(codigo, FechaCaducidad, lote, envasado, origen, organismo, tempMantenimiento));
                    System.out.println("Produto añadido correctamente.");

                    break;
                case "congelado":
                    System.out.println("Temperatura de Mantenimiento: ");
                    tempMantenimiento = keyboard.nextInt();
                    keyboard.nextLine();

                    System.out.println("Tipo de producto congelado? (aire, agua o nitrogeno)");
                    String tipoCongelado = keyboard.nextLine();

                    switch(tipoCongelado) {
                        case "aire":

                            System.out.println("% de Nitrogeno: ");
                            int nitro = keyboard.nextInt();

                            System.out.println("% de Oxigeno: ");
                            int oxigeno = keyboard.nextInt();

                            System.out.println("% de CO2");
                            int co2 = keyboard.nextInt();

                            System.out.println("% de Vapor de agua: ");
                            int vaporAgua = keyboard.nextInt();

                            Productos.add(new CAire(codigo, FechaCaducidad, lote, envasado, origen, tempMantenimiento, nitro, oxigeno, co2, vaporAgua));
                            System.out.println("Produto añadido correctamente.");

                            break;
                        case "agua":

                            System.out.println("Salinidad :");
                            Float salinidad = keyboard.nextFloat();

                            Productos.add(new CAgua(codigo, FechaCaducidad, lote, envasado, origen, tempMantenimiento, salinidad));
                            System.out.println("Produto añadido correctamente.");

                            break;
                        case "nitrogeno":

                            System.out.println("Metodo de congelación (1 o 2)");
                            int mCongelacion = keyboard.nextInt();

                            System.out.println("Tiempo de exposición al nitrogeno: ");
                            int tempExpo = keyboard.nextInt();

                            Productos.add(new CNitrogeno(codigo, FechaCaducidad, lote, envasado, origen, tempMantenimiento, mCongelacion, tempExpo));
                            System.out.println("Produto añadido correctamente.");

                            break;
                        default:
                            System.out.println("Has escrito mal el tipo de producto...");
                    }

                    break;
                default:
                    System.out.println("Has escrito mal el tipo de producto...");
            }
        } else {
            System.out.println("El articulo ya existe...");
        }

    }

    public static void verInfo() {
        int counter = 1;
        for(Productos a: Productos) {
            System.out.println(counter + ". " + a.toString());
            counter++;
        }

    }

}
