package de.browserlife.umrechner.interfaces;

public interface IPFormatHandlerInterface {

	public int[] splitIp(String ip);
	public String mergeIp (int[] ip);
	public String mergeIp (String[] ip);
	
	
}
