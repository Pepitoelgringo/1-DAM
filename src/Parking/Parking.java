package Parking;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Parking {
    Scanner reader = new Scanner(System.in);
    private String matricula;
    private int plaza;
    String nombreParking;
    int numPlazasParking;//numero de plazas del parking
    public Parking(String nombreParking, int numPlazasParking) {
        this.nombreParking = nombreParking;
        this.numPlazasParking = numPlazasParking;
        this.plazasParking = new String[numPlazasParking];
    }

    public void entradacoche() {
        System.out.println("Introduzca matrícula: ");
        this.matricula = reader.next();
        System.out.println("Introduzca la plaza: ");
        this.plaza = reader.nextInt();
        if (this.plazasParking[plaza] == null) {
            this.plazasParking[plaza] = this.matricula;
        } else {
            System.out.println("Plaza ocupada, por favor elija otra plaza");
        }
        int plazasocupadas = numPlazasParking - plazaslibres();
        System.out.println("Las plazas libres son: "+ plazaslibres());
        System.out.println("Las plazas totales son: "+ numPlazasParking);
        System.out.println("Las plazas ocupadas son: "+ plazasocupadas);

    }

    public void salidacoche() {
        System.out.println("Introduzca matrícula: ");
        matricula = reader.next();
        System.out.println("Introduzca la plaza : ");
        plaza = reader.nextInt();
        if ((this.plazasParking[plaza] != null) && (this.plazasParking[plaza].equals(this.matricula))) {
            this.plazasParking[plaza] = null;
            System.out.println("Hasta luego, buen viaje");
        } else {
            System.out.println("Esa plaza no esta ocupada actualmente, intentelo de nuevo");
        }
    }
    public int plazaslibres () {
        int contadorplazaslibres=0;
        for (String matricula : plazasParking) {
            if (matricula==null) {
                contadorplazaslibres++;
            }
        }
        return contadorplazaslibres;
    }
    String plazasParking[];

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }
}