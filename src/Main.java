import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        double cantidad;

        try {
            //creo el objeto para crear una cuenta corriente
            Cuenta cuenta1 = new Cuenta(300, "Ana Perez Lopez");
            System.out.println(cuenta1.toString());
            do {

                //Try catch para evitar que el programa termine si hay un error

                System.out.println("MENU DE OPCIONES:" +
                        "\n1.- Ingresar dinero en la cuenta" +
                        "\n2.- Retirar dinero de la cuenta" +
                        "\n3.- Saldo de la cuenta" +
                        "\n4.- Pedir un prestamo" +
                        "\n5.- Ver deuda" +
                        "\n0.- Salir");

                System.out.println("Enter la opcion elegida: ");

                opcion = sc.nextInt();

                //Ejemplo de switch case en Java
                switch (opcion) {

                    case 1:
                        System.out.println("Introduce la cantidad a Ingresar:");
                        cantidad = sc.nextDouble();
                        cuenta1.ingresardinero(cantidad);
                        break;
                    case 2:
                        System.out.println("Introduce la cantidad a Retirar:");
                        cantidad = sc.nextDouble();
                        cuenta1.retirardinero(cantidad);
                        break;
                    case 3:
                        cuenta1.ver_saldo();
                        break;
                    case 0:
                        System.out.println("Adios!");
                        break;
                    case 4:
                        System.out.println("Introduce la cantidad para pedir un prestamo");
                        cantidad = sc.nextDouble();
                        cuenta1.pedirprestamo(cantidad);
                    case 5:
                        cuenta1.ver_deuda();
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }//switch

                System.out.println("\n"); //Mostrar un salto de línea en Java



            } while (opcion != 0);//while
            System.out.println("Hasta pronto");
        } //try
        catch (Exception e) {
            System.out.println("Uoop! Error!");
        }//catch





    }//main
}