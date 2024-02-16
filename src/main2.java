import java.util.Scanner;
public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        String respuesta;
        Persona persona1;
        try {
            System.out.println("Dime tu nombre");
            String nombre = sc.next();
            System.out.println("Dime tu edad");
            int edad = sc.nextInt();
            System.out.println("Dime tu sexo (H para hombre, M para mujer)");
            char sexo = sc.next().charAt(0);
            System.out.println("Dime tu peso en kilogramos");
            float peso = sc.nextFloat();
            System.out.println("Dime tu altura en metros");
            float altura = sc.nextFloat();
            System.out.println("¿Quieres introducir tu DNI? Escribe Si o No");
            respuesta= sc.next();
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("Escribe tu DNI");
                String DNI = sc.next();
                persona1 = new Persona(nombre,edad,sexo,DNI,peso,altura);
            } else {
                persona1 = new Persona(nombre,edad,sexo,peso,altura);
            }
            System.out.println(persona1.toString());
            do {
                //Try catch para evitar que el programa termine si hay un error
                System.out.println("MENU DE OPCIONES:" +
                        "\n1.- Calcular IMC" +
                        "\n2.- Calcular si es mayor de edad" +
                        "\n3.- Generar DNI" +
                        "\n0.- Salir");
                System.out.println("Enter la opcion elegida: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        persona1.HoM(sexo);
                        break;
                    case 2:
                        persona1.calcular_mas_18();
                        break;
                    case 3:
                        persona1.generar_dni();
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
    }//main
}