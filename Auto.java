package com.AlquilerDeAuto;

	public class Auto{
private String placa;
private String marca;
private String modelo;
private int anio;
private boolean disponible;

public Auto(String placa, String marca, String modelo, int anio) {
    this.placa = placa;
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
    this.disponible = true;
}

public boolean estaDisponible() {
    return disponible;
}

public void alquilar() {
    if (disponible) {
        disponible = false;
    }
}

public void devolver() {
    disponible = true;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getAnio() {
	return anio;
}

public void setAnio(int anio) {
	this.anio = anio;
}

public boolean isDisponible() {
	return disponible;
}

public void setDisponible(boolean disponible) {
	this.disponible = disponible;
}

public void setMatricula(String matricula, String placa) {
	this.placa = placa;
}

public String getMatricula() {
    return placa;
}
}