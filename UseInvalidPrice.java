package exeptionHandl;

public class UseInvalidPrice {
	public static void main(String[] args)throws InvalidPriceException {
		int price=-35;
		try {
		if(price>=0) {
			System.out.println("Valid Price");
		}
		else {
			throw new InvalidPriceException();
		}
		}
		catch(InvalidPriceException a) {
			System.out.println(a+"Invalid Price");
			a.printStackTrace();
			
		}
		finally {
			System.out.println("Success");
		}
		System.out.println("I can manipulate using this price");
		
	}
}
