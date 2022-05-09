package Services;

import java.io.File;

public class Diretorios {
	
	public static void DirLogs(){ //Rotina de criação do diretório de Logs
	File diretorioPlantio = new File("LogPlantio");	
	File diretorioGerminado = new File("LogGerminado");	
	if (!diretorioPlantio.exists() && !diretorioGerminado.exists()){
		if (diretorioPlantio.mkdir() && diretorioGerminado.mkdir())
			System.out.println("Diretório criado!");
		else
			System.out.println("Diretório não criado.");
	}
	}

}
