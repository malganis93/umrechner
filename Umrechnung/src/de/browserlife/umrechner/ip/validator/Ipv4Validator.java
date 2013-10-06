package de.browserlife.umrechner.ip.validator;


import de.browserlife.umrechner.ip.exceptions.IpInputException;

public class Ipv4Validator implements IpValidatorInterface {

	
	
	
	public boolean validate(String ip) throws IpInputException {
		// TODO Automatisch generierter Methodenstub
		if (!ip.matches("^(?:[0-9]{1,3}.){3}[0-9]{1,3}$"))
		{
			throw new IpInputException();
		} 
			
		return true;
			
		
	}
	public boolean validate(int[] ip) throws IpInputException {

		if (ip[0]==0)
		{
			throw new IpInputException("Eine IP darf nicht mit 0 beginnen!");
		}
		for (int i=0; i<ip.length;i++)
		{
			if (ip[i]>255)
			{
				throw new IpInputException("Kein Block darf groesser 255 sein!");
			}
		}
		return true; 
	
	}
	
}
