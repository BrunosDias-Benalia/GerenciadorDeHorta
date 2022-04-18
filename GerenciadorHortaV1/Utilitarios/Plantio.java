package Utilitarios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Telas.Menus;


public class Plantio {
	
	private Date data;
	private String TipoPlanta;
	private int QuantPlantado;
	private static Date hoje = new Date();
	
	static void GerarLogs(List<Plantio> plantios)
	{
		try {
		FileWriter logs =  new FileWriter("LogPlantio/log Plantio "+hoje.toString() +".txt");
		PrintWriter print =	new	PrintWriter(logs);
		for(Plantio log: plantios)
		{
			print.println(log.toString());
			print.println("----------------------");
		}
		print.close();
		logs.close();
		}
		catch(IOException e) {
			System.out.println("Erro em gerar o arquivo de Logs");
		}
	}
	
	public static void MenuPlantio(Scanner op) {
			
			Menus.plantios.add(new Plantio(op));
			GerarLogs(Menus.plantios);
		}
	
	public Plantio(Scanner ler) 
	{
		boolean valorInvalido;
		SimpleDateFormat dataPlantio = new SimpleDateFormat("dd/MM/yyyy");
		do {
			try {
				System.out.println("Coloque a data do plantio(formado dd/mm/ano):");
				this.data = dataPlantio.parse(ler.next());
				if(this.data.after(hoje)) 
				{
					throw new IllegalArgumentException("Datas futuras não são permitidas,colocar nova data!");
				}
				valorInvalido = false;
			}
			catch (ParseException e) {
				System.out.println("Insira uma data no formato valido");
				valorInvalido = true;
			}
			catch(IllegalArgumentException e)
			{
				System.out.println(e.getMessage());
				valorInvalido = true;
			}
		}while(valorInvalido);
		System.out.println("Coloque o tipo de planta:");
		this.TipoPlanta = ler.next();
		do {
			try 
			{
				System.out.println("Coloque a quantidade plantada:");
				this.QuantPlantado = ler.nextInt();
				valorInvalido = false;
			}
			catch(InputMismatchException e){
				System.out.println("Valor invalido, Colocar um número inteiro!");
				valorInvalido = true;
				ler.next();
			}
		}while(valorInvalido);
	}
	
	public Plantio(Date data,String TipoPlanta, int QuantPlantado)
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
