package Parking;
import java.util.Scanner;
public class Mainparking {
    Scanner scanner;
    public static void main(String[] args) {
        Parking parking1;
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        String matricula="";
        int plaza=0;
        try {
            parking1 = new Parking("Parking.Parking Centro", 10);
            do {
                System.out.println("MENU DE OPCIONES:" +
                        "\n1.- Entrada de Coches" +
                        "\n2.- Salida de coche" +
                        "\n3-  Plazas Libres" +
                        "\n4-  Mostrar Parking.Parking" +
                        "\n0.- Salir");

                System.out.println("Enter la opcion elegida: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        parking1.entradacoche();
                        break;
                    case 2:
                        parking1.salidacoche();
                        break;
                    case 3:
                        System.out.println("Las plazas libres son: "+ parking1.plazaslibres());
                        break;
                    case 4:

                        break;
                    case 0:
                        System.out.println("Adios!");
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
    }// main
}
