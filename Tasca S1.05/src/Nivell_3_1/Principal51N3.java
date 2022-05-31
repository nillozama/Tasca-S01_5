package Nivell_3_1;


import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import javax.crypto.spec.SecretKeySpec;

public class Principal51N3 {
	
	static Encriptador encriptador=new Encriptador("92AE31A79FEEB2A3");
	
	public static void main (String[] args) throws Exception {
		

        OutputStream fitxerSortida0 = new FileOutputStream("outputEncripted1.txt", true);
		String plainText="Hola";
		String textoEncriptado;
		String textoDesencriptado;
		SecretKeySpec key;
        OutputStream fitxerSortida1 = new FileOutputStream("outputEncripted2.txt", true);
        OutputStream fitxerSortida2 = new FileOutputStream("outputDesencripted1.txt", true);
        OutputStream fitxerSortida3 = new FileOutputStream("outputDesencripted2.txt", true);
        
		BufferedReader br=new BufferedReader(new FileReader("LlistaArchius.txt"));
  
		key=encriptador.generateKey( "AES");
		
        String linea = br.readLine();
		 while (linea != null) {
	            
	    		textoEncriptado=(String) encriptador.encripta(key, "AES", linea);
	    		fitxerSortida0.write(textoEncriptado.getBytes((StandardCharsets.UTF_8)));
	    		textoDesencriptado=encriptador.desencripta(key, "AES", textoEncriptado);

	    		fitxerSortida2.write(textoDesencriptado.getBytes((StandardCharsets.UTF_8)));
	    		
	            linea = br.readLine();
	        }
			fitxerSortida0.close();
			fitxerSortida2.close();
	        br.close();
		
		key=encriptador.generateKey( "AES");
	
		textoEncriptado=(String) encriptador.encripta(key, "AES", plainText);
		System.out.println(textoEncriptado);
		textoDesencriptado=encriptador.desencripta(key, "AES", textoEncriptado);
		fitxerSortida1.write(textoEncriptado.getBytes());
		fitxerSortida1.close();
		System.out.println(textoDesencriptado);
		fitxerSortida3.write(textoDesencriptado.getBytes());
		fitxerSortida3.close();
	}


	
	public static void encriptarFichero(String fileName, SecretKeySpec key, String fileOuputName) throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader(fileName));
        OutputStream fitxerSortida = new FileOutputStream(fileOuputName, true);
		String textoEncriptado;
        String linea = br.readLine();

        while (linea != null) {
            
    		textoEncriptado=(String) encriptador.encripta(key, "AES", linea);
    		fitxerSortida.write(textoEncriptado.getBytes(StandardCharsets.UTF_8));
            linea = br.readLine();
        }
		fitxerSortida.close();
        br.close();
	}
	
	public static void desencriptarFichero(String fileEncripted, SecretKeySpec key, String fileOuputName) throws Exception {
		

		BufferedReader br=new BufferedReader(new FileReader(fileEncripted));
        OutputStream fitxerSortida2 = new FileOutputStream(fileOuputName, true);
		String textoDesencriptado;
        String linea = br.readLine();

        while (linea != null) {
            
    		textoDesencriptado=encriptador.desencripta(key, "AES", fileEncripted);
    		fitxerSortida2.write(textoDesencriptado.getBytes(StandardCharsets.UTF_8));
            linea = br.readLine();
        }
		fitxerSortida2.close();
        br.close();
	}
	
	/*import java.io.BufferedReader;
	import java.io.FileOutputStream;
	import java.io.FileReader;
	import java.io.OutputStream;
	import java.nio.charset.StandardCharsets;

	import javax.crypto.spec.SecretKeySpec;

	public class Principal51N3 {
		
		static Encriptador encriptador=new Encriptador("92AE31A7901EB2A3");
		
		public static void main (String[] args) throws Exception {

			SecretKeySpec key=encriptador.generateKey("AES");
			encriptarFichero("outagain.txt", key, "ouputEncripted.txt");
			desencriptarFichero("ouputEncripted.txt", key, "outputDesencripted.txt");

		}*/
}



