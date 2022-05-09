package MenuPrincipal;



import Services.Diretorios;
import Telas.Menus;


public class Main {



	public static void main(String[] args) {
		
		Diretorios.DirLogs(); //verifica se há um diretório de logs e o cria caso não tenha.
		Menus.MenuPrincipal(); //inicia menu principal da aplicação
	}
		
}
