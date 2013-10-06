package de.browserlife.umrechner.ip.validator;

import de.browserlife.umrechner.ip.entity.IpAdressInterface; 
import de.browserlife.umrechner.ip.exceptions.IpInputException;


public interface IpValidatorInterface {
	
	public boolean validate(String ip) throws IpInputException; 

}
