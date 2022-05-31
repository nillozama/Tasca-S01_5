package Nivel_1_1;

import java.io.File;
import java.io.IOException;

public class LlistaDirectori {
	
	public void imprimirDirectoris(String ruta) throws IOException{
		
		File file=new File(ruta);
		String[] listaArchivos=file.list();

		for(int i=0;i<listaArchivos.length;i++) {
		
			System.out.println(listaArchivos[i]);
		}
	}
}
