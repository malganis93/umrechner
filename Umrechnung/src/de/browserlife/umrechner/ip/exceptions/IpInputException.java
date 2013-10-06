package de.browserlife.umrechner.ip.exceptions;

public class IpInputException extends Exception {

	public IpInputException(String string) {
		// TODO Automatisch generierter Konstruktorstub
		super("Du hast einen Eingabefehler gemacht: "+string);
	}
	public IpInputException() {
		// TODO Automatisch generierter Konstruktorstub
		super("Das ist keine gueltige IP!");
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = -1746728616170578878L;
	
	

}
