package com.AlquilerDeAuto;

public class Cliente {
    private String nombre;
    private String dpi;
    private String direccion;
    private String telefono;

    public Cliente(String nombre, String dpi, String direccion, String telefono) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void registrarCliente() {
        // Lógica para registrar el cliente en el sistema
    }

    public void actualizarDatos(String direccion, String telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

	public String getDni() {
		return dpi;
	}

	public void setDni(String dpi) {
		this.dpi = dpi;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}