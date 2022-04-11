package Utilitarios;

import java.util.Scanner;

public class Plantio {
	
	private String data;
	private String TipoPlanta;
	private int QuantPlantado;
	
	public Plantio(Scanner ler)
	{
		System.out.println("Coloque a data do plantio(formado dd/mm/ano):");
		this.data = ler.next();
		System.out.println("Coloque o tipo de planta:");
		this.TipoPlanta = ler.next();
		System.out.println("Coloque a quantidade plantada:");
		this.QuantPlantado = ler.nextInt();
	}
	
	public Plantio(String data,String TipoPlanta, int QuantPlantado)
	{
		this.data = data;
		this.TipoPlanta = TipoPlanta;
		this.QuantPlantado = QuantPlantado;		
	}
	
	public String toString()
	{
		return "Data do Plantio:" + this.data 
	+" Tipo de planta: " + this.TipoPlanta
	+ " Quantidade plantada: " + this.QuantPlantado +".";
	}

}
