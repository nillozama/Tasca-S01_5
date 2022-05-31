package Nivell_1_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal54 {

	public static void main(String[] args) {

		boolean sortirMenu=false;
			
		do{
			sortirMenu=showMenu(sortirMenu);
				
		}while(!sortirMenu);
	}
	
	public static boolean showMenu(boolean sortirMenu) {

		String miRuta;
		byte indexSwitch;
		File ruta;
		
		System.out.println("Gestió fitxers.\n \n0- Sortir del programa. \n1- Guardar llista dels fitxers i directoris d'una ruta.\n2- Veure per pantalla contingut archiu .txt.");
		indexSwitch=requireByteNumber("Quina opció del menú vols triar?");
		
		switch(indexSwitch) {
		
			case 0:

				System.out.println("Gracies per utilitzar l'aplicació. Adeu!!");
				sortirMenu=true;

				break;

			case 1:
				
				miRuta=requireString("Introdueix la ruta del directori a llistar.");
				LlistaArbreDirectoriTxt directori=new LlistaArbreDirectoriTxt();
				
				try {
					
					directori.imprimirArbreDirectoris(miRuta, "");
					ruta=new File("LlistaArchius.txt");
					System.out.println("La llista de directoris s'ha guardat a: "+ruta.getAbsolutePath());
				}
				
				catch (IOException e){
					
					System.out.println(e.getMessage()+" Directori no trobat.");
				}
			
				break;
				
			case 2:
				
				
				try {
					veurFitxerPerPantalla(requireString("Introdueix el nom del fitxer .txt per mostrar."));
				} catch (IOException e) {

					//e.printStackTrace();
					System.out.println(e.getMessage()+" Directori no trobat.");
					
				}
				
				break;
	
			default:
				
				System.out.println("Has d'escollir un número de la llista.");
			}
			
			return sortirMenu;
		}
	
	public static void veurFitxerPerPantalla(String fileName) throws IOException{
		
		FileReader fr = new FileReader(new File(fileName));
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        
        while (linea != null) {
            
        	System.out.println(linea);
            linea = br.readLine();
        }
        
        br.close();
        fr.close();
	}
	
	public static String requireString(String message) {
		
		Scanner sc=new Scanner(System.in);
		String string;
		
		System.out.println(message);
		string=sc.nextLine();
		
		return string;
	}
	
	public static byte requireByteNumber(String message) {
		
		Scanner sc=new Scanner(System.in);
		byte num;
		
		System.out.println(message);
		num=sc.nextByte();
		
		return num;
	}

}
