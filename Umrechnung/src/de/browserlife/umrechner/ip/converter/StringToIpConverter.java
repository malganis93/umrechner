package de.browserlife.umrechner.ip.converter;

import de.browserlife.umrechner.ip.entity.Ipv4Adress;
import de.browserlife.umrechner.ip.exceptions.IpInputException;
import de.browserlife.umrechner.ip.validator.Ipv4Validator;

public class StringToIpConverter {

	public Ipv4Adress stringToIpv4 (String ipstring) throws IpInputException
	{
		Ipv4Validator validator= new Ipv4Validator();
		validator.validate(ipstring);
		int[] ip = new int[4];
		int pos=0;
		String cache="";
		for (int i=0; i<ipstring.length();i++)
		{
			char c = ipstring.charAt(i);
			if (c=='.')
			{
				
				ip[pos] = Integer.parseInt(cache);
				cache = "";
				pos++;
				continue;
			}
			try
			{
				//String.valueOf(c);
				int ziffer = Integer.parseInt(String.valueOf(c));
				cache+=ziffer;
				
			} catch (Exception e)
			{
				throw new IpInputException();
			}

						
		}
		ip[pos] = Integer.parseInt(cache);
		validator.validate(ip);
		Ipv4Adress ipadresse = new Ipv4Adress(ip);
		return ipadresse;
	}


}
