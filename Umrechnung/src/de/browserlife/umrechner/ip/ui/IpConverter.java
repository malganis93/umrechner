package de.browserlife.umrechner.ip.ui;

import java.util.Scanner;

import de.browserlife.umrechner.ip.converter.StringToIpConverter;
import de.browserlife.umrechner.ip.entity.Ipv4Adress;
import de.browserlife.umrechner.ip.exceptions.IpInputException;

public class IpConverter {
	
	public static void main (String args[])
	{
		
		System.out.println("Dieses Programm rechnet jede Zahl in Binaer, Oktal und Hexadezimal!");
		System.out.println("Welche Zahl moechtest du Umrechnen?");
		Scanner sc = new Scanner(System.in);	
		
		String input = sc.next();
		StringToIpConverter ipconv = new StringToIpConverter();
		Ipv4Adress ip = null;
		try {
			ip = ipconv.stringToIpv4(input);
		} catch (IpInputException e) {
			e.getMessage();
		}
		System.out.println(ip.toBinaryString());
		
			
	}
	

}
