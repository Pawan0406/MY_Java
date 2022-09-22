package inheritance;

public class Bank_Of_America extends Banks {

	void Banklocation()           //override
	{
		   System.out.println("The BAnk Location IS Ulhasnagar");
	}
	void Bank_client_name()
	{
		super.Bank_client_name();
		System.out.println("Shreeyash, Pawan, Monika, Shivam");
		
	}
}
