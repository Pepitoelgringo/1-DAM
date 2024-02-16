package Hotel;
import java.util.Scanner;
import Validaciones.Validar;
public class Mainhotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        String dni;
        int numerohabitacion;
        try {
            Hotel hotel1 = new Hotel("Hotel Transilvania", 5);
            do {
                System.out.println("MENU DE OPCIONES:" +
                        "\n1.- Reservar Habitacion" +
                        "\n2.- Cancelar Reserva" +
                        "\n3.- Cargar servicios Hotel al Cliente(Comidas, Spa,bebidas,..) " +
                        "\n4-  Facturar habitacion al Cliente + servicios " +
                        "\n5-  Nº de habitaciones libres" +
                        "\n6-  Buscar Nº de Habitacion de un Cliente" +
                        "\n0.- Salir");
                System.out.println("Enter la opcion elegida: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        do {
                            System.out.println("Escriba su DNI");
                            dni = sc.next();
                            if (Validar.validaDNI_Exp(dni)) {
                                System.out.println("DNI valido");
                            } else {
                                System.out.println("DNI no valido");
                            }
                        } while (!Validar.validaDNI_Exp(dni));
                        hotel1.reservarHabitacion(dni);
                        break;
                    case 2:
                        do {
                            System.out.println("Escriba su DNI");
                            dni = sc.next();
                            if (Validar.validaDNI_Exp(dni)) {
                                System.out.println("DNI valido");
                            } else {
                                System.out.println("DNI no valido");
                            }
                        } while (!Validar.validaDNI_Exp(dni));
                        hotel1.cancelarReserva(dni);
                        break;
                    case 3:
                        System.out.println("Para cargar servicios por favor indique su numero de habitacion");
                        numerohabitacion = sc.nextInt();
                        hotel1.cargarServicios(numerohabitacion);
                        break;
                    case 4:
                        System.out.println("Escriba el numero de su habitacion por favor");
                        numerohabitacion = sc.nextInt();
                        hotel1.generarFactura(numerohabitacion);
                        break;
                    case 5:
                        System.out.println("Las habitaciones libres son: "+hotel1.habitacionesLibres());
                        break;
                    case 6:
                        do {
                            System.out.println("Escriba su DNI");
                            dni = sc.next();
                            if (Validar.validaDNI_Exp(dni)) {
                                System.out.println("DNI valido");
                            } else {
                                System.out.println("DNI no valido");
                            }
                        } while (!Validar.validaDNI_Exp(dni));
                        System.out.println("Este DNI esta registrado a la habitacion numero: "+hotel1.buscarhabitacion(dni));
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


    }
}