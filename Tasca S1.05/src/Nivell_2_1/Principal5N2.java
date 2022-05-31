package Nivell_2_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import Nivell_1_3.LlistaArbreDirectoriTxt;

public class Principal5N2 {
	
	public static void main(String[] args) {
		
		Properties properties = new Properties();
		try {
			properties.load(new BufferedReader(new FileReader("properties.properties")));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		String fitxerResultant=properties.getProperty("fitxerResultant");
		String rutaDirectori;

		LlistaArbreDirectoriTxt directori=new LlistaArbreDirectoriTxt();
		String fitxerLectura=properties.getProperty("fitxerLectura");
		
		try {
			directori.imprimirArbreDirectoris(fitxerLectura, "", fitxerResultant);
			rutaDirectori=new File(fitxerResultant).getAbsolutePath();
			System.out.println("La llista de directoris s'ha guardat a: "+rutaDirectori);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
