package edu.auto.modelo;

public class VentaModel {
	private String Origen;
	private double costoProduccion;
	
	public String getOrigen() {
		return Origen;
	}

	public void setOrigen(String origen) {
		Origen = origen;
	}

	public double getCostoProduccion() {
		return costoProduccion;
	}

	public void setCostoProduccion(double costoProduccion) {
		this.costoProduccion = costoProduccion;
	}

	public String CalcularVenta() {
		double precioVenta=0;
		precioVenta=(costoProduccion*1.75);
		
		switch(Origen) {
		case "Alemania":
			precioVenta=precioVenta*1.20;
			break;
		case "Japón":
			precioVenta=precioVenta*1.30;
			break;
		case "Italia":
			precioVenta=precioVenta*1.15;
			break;
		case "Estados Unidos":
			precioVenta=precioVenta*1.08;
			break;
		}
		
		return "Precio Venta: "+ "$" + precioVenta;
	}

}
