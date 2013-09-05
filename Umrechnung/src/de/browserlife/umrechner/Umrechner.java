package de.browserlife.umrechner;

import java.util.Scanner;
import de.browserlife.umrechner.converter.*;

public class Umrechner {
	public static void main (String[] args)
	{
		
		System.out.println("Dieses Programm rechnet jede Zahl in Binaer, Oktal und Hexadezimal!");
		System.out.println("Welche Zahl moechtest du Umrechnen?");
		Scanner sc = new Scanner(System.in);
		int iDez = sc.nextInt();
		Converter conv = new Converter();
		
		conv.setBase(2);
		System.out.println("Binaer:");
		System.out.println(conv.convert(iDez));
		
		conv.setBase(8);
		System.out.println("Oktal:");
		System.out.println(conv.convert(iDez));
		
		conv.setBase(16);
		System.out.println("Hexadezimal:");
		System.out.println(conv.convert(iDez));
	}
}
