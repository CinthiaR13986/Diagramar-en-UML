package com.AlquilerDeAuto;

import java.util.Date;

public class ContratoDeAlquiler {
    private Auto auto;
    private Cliente cliente;
    private Date fechaInicio;
    private Date fechaFin;
    public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	private double precio;

    public ContratoDeAlquiler(Auto auto, Cliente cliente, Date fechaInicio, Date fechaFin, double precio) {
        this.auto = auto;
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public void crearContrato() {
        // Lógica para crear el contrato de alquiler
    }

    public void calcularPrecio() {
        // Lógica para calcular el precio del alquiler
    }

    public Auto getAuto() {
        return auto;
    }

    public Cliente getCliente() {
        return cliente;
    }
}