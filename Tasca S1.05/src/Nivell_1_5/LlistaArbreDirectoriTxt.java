package Nivell_1_5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class LlistaArbreDirectoriTxt {
	
	ArrayList <String> listaFicheros=new ArrayList<String>();
	
	public void imprimirArbreDirectoris(String miRuta, String tabulador) throws IOException{
		
        FileWriter fw = new FileWriter("LlistaArchius.txt", true);
        PrintWriter pw=new PrintWriter(fw);

		addToList(miRuta, tabulador);
		
		for(int i=0;i<listaFicheros.size();i++) {
			
			pw.println(listaFicheros.get(i));
		}
        pw.close();
        fw.close();
	}

	public void addToList(String miRuta, String tabulador) throws IOException{
		File ruta=new File(miRuta);
		String[] listaArchivos=ruta.list();
		DateFormat dateFormat=new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
		
		File file; 
		
		String newTabulador=tabulador+"  ";
	
		for(int i=0;i<listaArchivos.length;i++) {
			
			file=new File(miRuta, listaArchivos[i]);
		
			if(file.isDirectory()) {
				
				listaFicheros.add(newTabulador+listaArchivos[i]+" (D) "+dateFormat.format(file.lastModified()));
				addToList(miRuta+File.separator+listaArchivos[i], newTabulador);
			}
			else {
			
				listaFicheros.add(newTabulador+listaArchivos[i]+" (F) "+dateFormat.format(file.lastModified()));
			}
		}
	}
}
