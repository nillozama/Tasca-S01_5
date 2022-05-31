package Nivell_1_3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Principal53 {
	public static void main(String[] args) {
		
		String fitxerResultant="LlistaArchius.txt";
		String rutaDirectori;

		LlistaArbreDirectoriTxt directori=new LlistaArbreDirectoriTxt();
		String fitxerLectura=requireString("Escribe la ruta del directorio que quieres listar.");
		
		try {
			directori.imprimirArbreDirectoris(fitxerLectura, "", fitxerResultant);
			rutaDirectori=new File(fitxerResultant).getAbsolutePath();
			System.out.println("La llista de directoris s'ha guardat a: "+rutaDirectori);
		} catch (IOException e) {

			e.printStackTrace();
		}
    }
	
	public static String requireString(String message) {
		
		Scanner sc=new Scanner(System.in);
		String string;
		
		System.out.println(message);
		string=sc.nextLine();
		
		return string;
	}
}

