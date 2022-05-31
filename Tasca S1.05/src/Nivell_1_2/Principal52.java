package Nivell_1_2;

import java.io.IOException;
import java.util.Scanner;

public class Principal52 {
	public static void main(String[] args) {

		LlistaArbreDirectori directori=new LlistaArbreDirectori();
		try {
			directori.imprimirArbreDirectoris("C:\\Carpeta prueba", "");
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
