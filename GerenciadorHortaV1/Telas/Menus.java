package Telas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Utilitarios.Germinados;
import Utilitarios.Plantio;

public class Menus {
	
	public static List<Plantio> plantios = new ArrayList<Plantio>();
	public static List<Germinados> germinados = new ArrayList<Germinados>();
	
	public static void MenuPrincipal() {
		// TODO Auto-generated method stub
		boolean ligado = true;
		boolean valorInvalido;
		int escolha = 0;
		Scanner op = new Scanner(System.in);
		
		while(ligado) 
		{
			do {
			System.out.println("Digite o número de algumas das opções para selecionalas");
			System.out.println("1 - Novo Platio");
			System.out.println("2 - Germinou uma semente");
			System.out.println("3 - Sair");
			try {
				escolha = op.nextInt();
				valorInvalido = false;
			}
			catch (InputMismatchException e) {
				System.out.println("Valor invalido");
				op.next();
				valorInvalido = true;
			}
			}while(valorInvalido);
			switch (escolha) {
			case 1:
				Plantio.MenuPlantio(op);
				break;
			case 2:
				Germinados.MenuGerminados(op);
				break;
			case 3:
				ligado = false;
				break;
			default:
				System.out.println("--Escolha uma opção valida!!");
				break;
			}
		}
		op.close();
	}
	
	
	
	
	
	
}
