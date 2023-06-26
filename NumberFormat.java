package exeptionHandl;

public class NumberFormat {
	public static void main(String[] args) {
		String a="Java";
		try {
		int b=Integer.parseInt(a);
		}
		catch (NumberFormatException nf) {
			System.out.println(nf+"It is a NumbrformatException");
			nf.printStackTrace();
		}
		finally {
			System.out.println("Success");
		}
	}
}
