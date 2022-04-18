package Services;

import java.io.File;

public class criardiretoriosdelogs {
	
	public static void criardiretórios(){
	File diretorioPlantio = new File("LogPlantio");	
	if (!diretorioPlantio.exists()){
		if (diretorioPlantio.mkdir())
			System.out.println("Diretório criado!");
		else
			System.out.println("Diretório não criado.");
	}
	File diretorioGerminado = new File("LogGerminado");	
	if (!diretorioGerminado.exists()){
		if (diretorioGerminado.mkdir())
			System.out.println("Diretório criado!");
		else
			System.out.println("Diretório não criado.");
	}
	}

}
