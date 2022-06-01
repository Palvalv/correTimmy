package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean fin = false;
        int iPos = 1;
        int jPos = 1;
        int tamanho = 20;
        while(iPos >= 1 && iPos <=18 && jPos >= 1 && jPos <= 18) {

            // 1. Codigo para imprimir el tablero del juego, utilizar bucles. Necesitara comprobar los indices
            // para saber que debe imprimir

            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    if (i == 0 || j == 0 || i == 19 || j == 19) {
                        System.out.print("*");
                    } else if (i == iPos && j == jPos) {
                        System.out.print("T");
                    } else if (i == 18 && j == 18) {
                        System.out.print("H");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            // 2. Codigo para leer siguiente paso y actualizar posicion de Timmy segun la direccion
            // introducida. STOP debe parar el juego.

            System.out.println("¿Siguiente paso?: ");
            String movimiento = scan.nextLine();
            if (movimiento.equalsIgnoreCase("N")) {
                iPos--;
            } else if (movimiento.equalsIgnoreCase("S")) {
                iPos++;
            } else if (movimiento.equalsIgnoreCase("O")) {
                jPos--;
            } else if (movimiento.equalsIgnoreCase("E")) {
                jPos++;
            } else if (movimiento.equalsIgnoreCase("STOP")) {
                System.out.println("El juego ha finalizado");
                break;
            } else {
                jPos--;
            }

            // 3. Codigo para comprobar si fin de juego. El juego termina si Timmy se ha movido a una
            // posicion donde hay obstaculo o si se ha movido a la posicion donde se encuentra la llegada.

            if (iPos == 0 || jPos == 19 || iPos == 19 || jPos == 0) {
                System.out.println("Timmy la ha cascado");
                break;
            }
            if (iPos == 18 && jPos == 18) {
                System.out.println("Timmy ha escapado con exito");
                break;
            }
        }

    }
}