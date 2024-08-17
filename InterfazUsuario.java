package com.AlquilerDeAuto;
import java.util.List;

import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class InterfazUsuario {
    private Agencia agencia;

    public InterfazUsuario(Agencia agencia) {
        this.agencia = agencia;
    }

    public void mostrarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Mostrar autos disponibles");
            System.out.println("2. Gestionar alquiler");
            System.out.println("3. Gestionar devolución");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarAutosDisponibles();
                    break;
                case 2:
                    gestionarAlquiler();
                    break;
                case 3:
                    gestionarDevolucion();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        scanner.close();
    }

    public void mostrarAutosDisponibles() {
        List<Auto> disponibles = agencia.buscarAutosDisponibles();
        for (Auto auto : disponibles) {
            System.out.println(auto.getMatricula() + " - " + auto.getMarca() + " " + auto.getModelo());
        }
    }

    public void gestionarAlquiler() {
        
        System.out.println("Gestión de alquiler no implementada.");
    }

    public void gestionarDevolucion() {
       
        System.out.println("Gestión de devolución no implementada.");
    }
}