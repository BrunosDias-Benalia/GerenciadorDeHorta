package MenuPrincipal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import Utilitarios.Plantio;

public class Main {



	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		List<Plantio> plantios = new ArrayList<Plantio>();
		boolean A = true;
		Scanner op = new Scanner(System.in);
		while(A) 
		{
			System.out.println("Digite o número de algumas das opções para selecionalas");
			System.out.println("1 - Novo Platio");
			System.out.println("2 - Germinou uma semente");
			System.out.println("3 - Sair");
			int escolha = op.nextInt();
			switch (escolha) {
			case 1:
				System.out.println("Plantou");
				plantios.add(new Plantio(op));
				break;
			case 2:
				System.out.println("Germinou");
				System.out.println("Em implementação");
				break;
			case 3:
				A = false;
				GerarLogs(plantios);
				break;
			default:
				System.out.println("--Escolha uma opção valida!!");
				LimpaConsole();
				break;
			}
		}
		op.close();
	}
	
	static void GerarLogs(List<Plantio> plantios) throws IOException
	{
		FileWriter logs =  new FileWriter("log.txt");
		PrintWriter print =	new	PrintWriter(logs);
		for(Plantio log: plantios)
		{
			print.println(log.toString());
			print.println("----------------------");
		}
		print.close();
		logs.close();
	}
	
/*	static void menuPrincipal() throws IOException, InterruptedException 
	{
		boolean A = true;
		Scanner op = new Scanner(System.in);
		while(A) 
		{
			System.out.println("Digite o número de algumas das opções para selecionalas");
			System.out.println("1 - Novo Platio");
			System.out.println("2 - Germinou uma semente");
			System.out.println("3 - Sair");
			int escolha = op.nextInt();
			switch (escolha) {
			case 1:
				System.out.println("Plantou");
				Plantio.add(new Platio());
				break;
			case 2:
				System.out.println("Germinou");
				System.out.println("Em implementação");
				break;
			case 3:
				A = false;
				gerarLogs(Planta, B);
				break;
			default:
				System.out.println("--Escolha uma opção valida!!");
				LimpaConsole();
				break;
			}
		}
		op.close();
	
	}*/

	static void LimpaConsole() throws InterruptedException, IOException // codigo fonte em :https://dicasdejava.com.br/java-como-limpar-a-tela-do-console/
	{
		if (System.getProperty("os.name").contains("Windows"))
	        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    else
	        Runtime.getRuntime().exec("clear");
	}
}
