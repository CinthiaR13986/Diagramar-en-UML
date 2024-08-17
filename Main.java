package com.AlquilerDeAuto;

public class Main {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();
        InterfazUsuario interfaz = new InterfazUsuario(agencia);

        // Agregar algunos autos y clientes para iniciar
        Auto auto1 = new Auto("ABC123", "Toyota", "Corolla", 2020);
        Auto auto2 = new Auto("XYZ789", "Honda", "Civic", 2019);

        Cliente cliente1 = new Cliente("Juan Perez", "12345678", "Calle Falsa 123", "555-1234");

        agencia.agregarAuto(auto1);
        agencia.agregarAuto(auto2);
        agencia.registrarCliente(cliente1);

        // Mostrar el menú principal
        interfaz.mostrarMenuPrincipal();
    }
}