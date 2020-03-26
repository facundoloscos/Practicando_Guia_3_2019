package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int op;
	char control = 's';
	Scanner entry = new Scanner(System.in);

	do{
        System.out.println("\t\t\t\t---Guia 3 - Año 2019---\n");
        System.out.println("Elija ejercicio:");
        System.out.println("||1----------2||");
        op = entry.nextInt();

        switch (op){
            case 1:
                //Inciso a
                Autor firstAutor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');

                //Inciso b
                System.out.println(firstAutor.toString());

                //Inciso c
                Libro librin = new Libro("Effective Java", 450, 150, firstAutor);

                //Inciso d
                System.out.println(librin.toString());

                //Inciso e
                librin.setPrecio(500);
                librin.setStock(50+librin.getStock());
                System.out.println(librin.toString());

                //Inciso f
                System.out.println(librin.getAutor());

                //Inciso g
                System.out.println(librin.mostrarCool());
                break;
            case 2:
                //Inciso a
                Cliente firstClient = new Cliente(1, "Pepe", 'M');
                System.out.println(firstClient.toString());

                //Inciso b
                Cuenta cuentita = new Cuenta(1, 10000, firstClient);
                System.out.println(cuentita.toString());

                //Inciso c
                cuentita.depositar(1000);
                cuentita.extraer(2000);
                cuentita.extraer(30000);
                System.out.println(cuentita.toString());

                //Inciso d
                cuentita.extraer(9700);
                System.out.println(cuentita.toString());
                cuentita.extraer(26544);
                break;

            default:
                System.out.println("|Opcion incorrecta|");
        }

        System.out.println("Desea continuar? (s/n)");
        control = entry.next().charAt(0);

    }while (control == 's' || control == 'S');
    }
}
