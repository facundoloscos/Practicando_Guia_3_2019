package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int op;
	String[] accion = new String[10];
	char control = 's';
	char seguir = 's';
	int hacer, depo, extra, i=0;
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


                //Inciso e

                while ((i < 10) && (seguir == 's' || seguir == 'S')){
                    do{
                        System.out.println("Que desea hacer: ");
                        System.out.println("1- Depositar");
                        System.out.println("2- Extraer");
                        System.out.println("0- Nada");
                        hacer = entry.nextInt();

                        if (hacer == 1){
                            System.out.print("Cuanto desea depositar: ");
                            depo = entry.nextInt();
                            cuentita.depositar(depo);
                            accion[i] = "El "+cuentita.getClientin().getNombre()+", deposito "+depo;
                            i++;
                        }else{
                            if (hacer == 2){
                                System.out.print("Cuanto desea extraer: ");
                                extra = entry.nextInt();
                                cuentita.extraer(extra);
                                if ((cuentita.getBalance() - extra) < -2000){
                                    accion[i] = "El "+cuentita.getClientin().getNombre()+", intento retirar "+extra+" pero no pudo";
                                }else{
                                    accion[i] = "El "+cuentita.getClientin().getNombre()+", retiro "+extra;
                                }
                                i++;
                            }
                        }
                        System.out.println("Continuar depositando o extrayendo? (s/n)");
                        seguir = entry.next().charAt(0);
                    }while (seguir == 's' || seguir == 'S');
                }
                for (int j=0; j<i; j++){   //Muestro el arreglo
                    System.out.println(accion[j]);
                }
                break;
            default:
                System.out.println("|Opcion incorrecta|");
                break;
        }

        System.out.println("Desea continuar en la guia? (s/n)");
        control = entry.next().charAt(0);

    }while (control == 's' || control == 'S');
    }
}
