package Nivell_3_1;

/*import javax.crypto.Cipher;
import java.util.Base64;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Encriptador {
	
	String key;
	
	public Encriptador(String key) {
		
		this.key=key;
	}
	
	public SecretKeySpec generateKey (String algorithm) {
		
	    SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), algorithm);
	    
	    return keySpec;
	}
	
	public String encripta (SecretKeySpec keySpec, String algorithm, String text) throws Exception {

		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, keySpec, new IvParameterSpec(new byte[16]));
		byte[] encriptado = cipher.doFinal(text.getBytes());
		String cadenaCodificada = Base64.getEncoder().encodeToString(encriptado);
		
	    return  cadenaCodificada;
	}
	
	public String desencripta (SecretKeySpec keySpec, String algorithm, String textoEncriptado) throws Exception {

		Cipher cipher= Cipher.getInstance("AES/CBC/PKCS5Padding");
		byte[] bytesDecodificados = Base64.getDecoder().decode(textoEncriptado);

		cipher.init(Cipher.DECRYPT_MODE, keySpec, new IvParameterSpec(new byte[16]));
		byte[] descifrado = cipher.doFinal(bytesDecodificados);

		return new String (descifrado);
	}
}*/

import javax.crypto.Cipher;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Encriptador {
	
	String key;
	
	public Encriptador(String key) {
		
		this.key=key;
	}
	
	public SecretKeySpec generateKey (String algorithm) {
		
	    SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), algorithm);
	    
	    return keySpec;
	}
	
	public String encripta (SecretKeySpec keySpec, String algorithm, String text) throws Exception {

		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, keySpec, new IvParameterSpec(new byte[16]));
		byte[] encriptado = cipher.doFinal(text.getBytes((StandardCharsets.UTF_8)));
		String cadenaCodificada = new String (Base64.getEncoder().encode(encriptado));
		
	    return  cadenaCodificada;
	}
	
	public String desencripta (SecretKeySpec keySpec, String algorithm, String textoEncriptado) throws Exception {

		Cipher cipher= Cipher.getInstance("AES/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, keySpec, new IvParameterSpec(new byte[16]));
		byte[] descifrado = cipher.doFinal(Base64.getDecoder().decode(textoEncriptado));

		return new String (descifrado);
	}
}


