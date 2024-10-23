package com.ana.franco.model;

public class VentaModel {
	public String TipoMaterial;
	public double Cantidad;
	public double  cuenta;
	public double cuenta1;
	public double cuenta2;
	
	public String calcularVenta() {
		double totalPagar=0;	
		if(Cantidad<=100) {
			switch(TipoMaterial) {
			case "Acero Inoxidable":
				totalPagar=Cantidad*1.50;
				break;
			case "Acero Bicromantado":
				totalPagar=Cantidad*2.0;
				break;
			case "Latón":
				totalPagar=Cantidad*3;
				break;
			} 
			
		}else if(Cantidad<=250) {
			switch(TipoMaterial) {
			case "Acero Inoxidable":
				cuenta=Cantidad-100;
				cuenta1=cuenta*1.20;
				cuenta2=100*1.50;
				totalPagar=cuenta1+cuenta2;
				break;
			case "Acero Bicromantado":
				cuenta=Cantidad-100;
				cuenta1=cuenta*1.50;
				cuenta2=100*2.0;
				totalPagar=cuenta1+cuenta2;
				break;
			case "Latón":
				cuenta=Cantidad-100;
				cuenta1=cuenta*2.50;
				cuenta2=100*3;
				totalPagar=cuenta1+cuenta2;
				break;
			}
			
		}else if(Cantidad>=250) {
			switch(TipoMaterial) {
			case "Acero Inoxidable":
				cuenta=Cantidad-250;
				cuenta1=cuenta*0.80;
				cuenta2=250*1.50;
				totalPagar=cuenta1+cuenta2;
				break;
			case "Acero Bicromantado":
				cuenta=Cantidad-250;
				cuenta1=cuenta*1.0;
				cuenta2=250*2.0;
				totalPagar=cuenta1+cuenta2;
				break;
			case "Latón":
				cuenta=Cantidad-250;
				cuenta1=cuenta*2.0;
				cuenta2=250*3;
				totalPagar=cuenta1+cuenta2;
			
			}
			
		}
		
		return "Total a Pagar: " + totalPagar;
	}

}

