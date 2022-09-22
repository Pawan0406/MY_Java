package inheritance;

public class Bob extends Banks {
	
	void Banklocation()           
	{
		   System.out.println("The Bank Location IS Ulhasnagar");
	}
	void Bank_client_name()
	{
		super.Bank_client_name();
		System.out.println("Shreeyash, Pawan, Monika, Shivam");
		
	}

}
