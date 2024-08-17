package com.AlquilerDeAuto;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private List<Auto> flota;
    private List<Cliente> clientes;
    private List<ContratoDeAlquiler> contratos;

    public Agencia() {
        this.flota = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.contratos = new ArrayList<>();
    }

    public void agregarAuto(Auto auto) {
        flota.add(auto);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void generarContrato(ContratoDeAlquiler contrato) {
        contratos.add(contrato);
        contrato.getAuto().alquilar();
    }

    public List<Auto> buscarAutosDisponibles() {
        List<Auto> disponibles = new ArrayList<>();
        for (Auto auto : flota) {
            if (auto.estaDisponible()) {
                disponibles.add(auto);
            }
        }
        return disponibles;
    }
}