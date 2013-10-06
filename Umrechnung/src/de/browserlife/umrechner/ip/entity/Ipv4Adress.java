package de.browserlife.umrechner.ip.entity;

import de.browserlife.umrechner.converter.DezimalConverter;



public class Ipv4Adress implements IpAdressInterface {
	
	private int ip[] = new int[4];

	
	public Ipv4Adress (int[] ipadress)
	{
		this.ip = ipadress;
	}

	public int[] getIp() {
		return ip;
	}

	public void setIp(int ip[]) {
		this.ip = ip;
	}
	public String toString()
	{
		return ip[0]+"."+ip[1]+"."+ip[2]+"."+ip[0];
		
	}
	public String toBinaryString()
	{
		
		DezimalConverter conv = new DezimalConverter();
		conv.setBase(2);
		
		return conv.convert(ip[0])+"."+conv.convert(ip[1])+"."+conv.convert(ip[2])+"."+conv.convert(ip[3]);
		
	}

	
}
