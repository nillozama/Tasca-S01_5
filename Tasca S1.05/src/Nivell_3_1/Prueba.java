package Nivell_3_1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import javax.crypto.spec.SecretKeySpec;

public class Prueba {
	
	static Encriptador encriptador=new Encriptador("92AE31A79FEEB2A3");
	
	public static void main (String[] args) throws Exception {

		SecretKeySpec key=encriptador.generateKey("AES");
		encriptarFichero("LlistaArchius.txt", key, "outputEncripted.txt");
		desencriptarFichero("outputEncripted.txt", key, "outputDesencripted.txt");

	}
	
	public static void encriptarFichero(String fileName, SecretKeySpec key, String fileOuputName) throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader(fileName));
        OutputStream fitxerSortida = new FileOutputStream(fileOuputName);
		String textoEncriptado;
        String linea = br.readLine();

        while (linea != null) {
            
    		textoEncriptado=(String) encriptador.encripta(key, "AES", linea);
    		fitxerSortida.write(textoEncriptado.getBytes());
            linea = br.readLine();
        }
		fitxerSortida.close();
        br.close();
	}
	
	public static void desencriptarFichero(String fileEncripted, SecretKeySpec key, String fileOuputName) throws Exception {
		

		BufferedReader br=new BufferedReader(new FileReader(fileEncripted));
        OutputStream fitxerSortida = new FileOutputStream(fileOuputName);
		String textoDesencriptado;
        String linea = br.readLine();

        while (linea != null) {
            
    		textoDesencriptado=encriptador.desencripta(key, "AES", fileEncripted);
    		fitxerSortida.write(textoDesencriptado.getBytes());
            linea = br.readLine();
        }
		fitxerSortida.close();
        br.close();
	}
}
