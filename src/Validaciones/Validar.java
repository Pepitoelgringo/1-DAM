package Validaciones;

public class Validar {
    public static boolean validaNumeroEntero_Exp(String texto){

        return texto.matches("^-?[0-9]+$");
    }
    public static boolean validaDNI_Exp(String DNI){

        return DNI.matches("^[0-9]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");

    }
}
