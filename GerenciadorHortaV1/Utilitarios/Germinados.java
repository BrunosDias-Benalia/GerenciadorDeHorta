package Utilitarios;

public class Germinados {
	
	private String data;
	private String TipoPlanta;
	private int QuantGerminado;
	
	public Germinados()
	{
		
	}
	
	public Germinados(String data,String TipoPlanta, int QuantPlantado)
	{
		this.data = data;
		this.TipoPlanta = TipoPlanta;
		this.QuantGerminado = QuantPlantado;		
	}
	
	public String toString()
	{
		return "Data do Plantio:" + this.data
	+" Tipo de planta: " + this.TipoPlanta
	+ " Quantidade plantada: " + this.QuantGerminado +".";
	}


}
