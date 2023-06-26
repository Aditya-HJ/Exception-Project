package exeptionHandl;

public class NullPointr {
	public static void main(String[] args) {
		String value=null;
		try {
			System.out.println(value.toUpperCase());
		}
		catch(ArithmeticException a) {
			System.out.println(a+" divided by zero");
			a.printStackTrace();
		}
		catch(NumberFormatException b) {
			System.out.println(b+" convert string to integer");
			b.printStackTrace();
		}
		catch(NullPointerException c) {
			System.out.println(c+" is null value");
			c.printStackTrace();
		}
		catch(Exception d) {
			System.out.println(d+" some exception");
			d.printStackTrace();
		}
		finally {
			System.out.println("Success");
		}
		
	}
}
