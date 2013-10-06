package de.browserlife.umrechner.converter;


public class DezimalConverter implements NumberSystemConverterInterface {
	protected int base;

	@Override
	public String convert(int dez) {
		// TODO Auto-generated method stub
		int gzr = dez;
		String modulo = "";
		do 
		{
			//System.out.println(gzr);
			if (this.base>=10)
			{
				int mod = gzr%this.base;
				if (mod>=10) // wenn >= 10 dann nehme entsprechenden ASCII buchstaben
				{
					mod+=55; // 55+10 = A (ASCII)
					modulo=(char) mod+ modulo;	
				}
				else
				{
					modulo= mod+ modulo;
				}
	
			} 
			else
			{
				modulo = (gzr%this.base) + modulo;
			}
			gzr = gzr/this.base;
					
		} while (gzr>0);
		
		
		
		return modulo;
	}

	@Override
	public void setBase(int dez) {
		this.base = dez;
		
	}

}
