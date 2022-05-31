package Nivel_1_1;

import java.io.IOException;
import java.util.Scanner;

public class Principal51 {

	public static void main(String[] args) {

		LlistaDirectori directori=new LlistaDirectori();
		try {
			directori.imprimirDirectoris("C:\\Carpeta prueba");
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