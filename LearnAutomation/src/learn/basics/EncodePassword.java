package learn.basics;

import java.util.Base64;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EncodePassword {
	 

	public static void main(String[] args) {
		String  password="dontgiveup";
		String encodedpass=new String (Base64.getEncoder().encode(password.getBytes()));
		System.out.println(encodedpass);
		
		
		
		String decodedpass= new String(Base64.getDecoder().decode(encodedpass.getBytes()));
		System.out.println(decodedpass);

	}

}
