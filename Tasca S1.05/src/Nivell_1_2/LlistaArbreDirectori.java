package Nivell_1_2;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;



public class LlistaArbreDirectori {

	public void imprimirArbreDirectoris(String miRuta, String tabulador) throws IOException{
		File ruta=new File(miRuta);
		String[] listaArchivos=ruta.list();
		DateFormat dateFormat=new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
		
		File file;
		String newTabulador=tabulador+"  ";
	
		for(int i=0;i<listaArchivos.length;i++) {
		
			file= new File(miRuta, listaArchivos[i]);
		
			if(file.isDirectory()) {
				
				System.out.println(newTabulador+listaArchivos[i]+" (D) "+dateFormat.format(file.lastModified()));
				//System.out.println(file.getAbsolutePath().toString()+" (D) "+dateFormat.format(file.lastModified()));
				imprimirArbreDirectoris(miRuta+File.separator+listaArchivos[i], newTabulador);
			}
			else {
			
				System.out.println(newTabulador+listaArchivos[i]+" (F) "+dateFormat.format(file.lastModified()));
				//System.out.println(file.getAbsolutePath().toString()+" (F) "+dateFormat.format(file.lastModified()));
			}
		}
	}
}
