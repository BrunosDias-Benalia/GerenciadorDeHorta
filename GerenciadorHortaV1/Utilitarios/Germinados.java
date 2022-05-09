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

public class Germinados {
	
	private Date data;
	private String TipoPlanta;
	private int QuantGerminado;
	private static Date hoje = new Date();
	
	public static void MenuGerminados(Scanner op) {
		
		Menus.germinados.add(new Germinados(op));
		GerarLogs(Menus.germinados);
		
	}
	
	public static void GerarLogs(List<Germinados> germinados)
	{
		try {
		FileWriter logs =  new FileWriter("LogGerminado/log Germinados "+hoje.toString()+".txt");
		PrintWriter print =	new	PrintWriter(logs);
		for(Germinados log: germinados)
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
	
	public Germinados(Scanner ler)// contrutor sem argumentos, recebe a variavel de scanner para evitar bugs
	{
		Date hoje = new Date();
		boolean valorInvalido;
		SimpleDateFormat dataPlantio = new SimpleDateFormat("dd/MM/yyyy");
		do { //Estrutura de repetição para inserção de valores de datas validos
			try {
				System.out.println("Coloque a data do plantio(formato: Dia(dd)/Mês(mm)/Ano(yyyy)):");
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
		do {//Estrutura de repetição para verificar se o valor é numérico
			try 
			{
				System.out.println("Coloque a quantidade germinada:");
				this.QuantGerminado = ler.nextInt();
				valorInvalido = false;
			}
			catch(InputMismatchException e){
				System.out.println("Valor invalido, Colocar um número inteiro!");
				valorInvalido = true;
				ler.next();
			}
		}while(valorInvalido);
	}
	
	public Germinados(Date data,String TipoPlanta, int QuantPlantado)
	{
		this.data = data;
		this.TipoPlanta = TipoPlanta;
		this.QuantGerminado = QuantPlantado;		
	}
	
	public String toString() // transforma o objeto em string para escrever dados na tela
	{
		return "Data do Plantio:" + this.data
	+" Tipo de planta: " + this.TipoPlanta
	+ " Quantidade plantada: " + this.QuantGerminado +".";
	}


}
