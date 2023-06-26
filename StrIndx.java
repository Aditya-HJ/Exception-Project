package exeptionHandl;

public class StrIndx {
	public static void main(String[] args) {
		String a="java";
		try {
		System.out.println(a.charAt(4));
		}
		catch (ArrayIndexOutOfBoundsException a1) {
			System.out.println(a1+" is arrayIndx out of bounds");
			a1.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException b) {
			System.out.println(b+" is str indx out of bounds");
			b.printStackTrace();
		}
		catch(IndexOutOfBoundsException c) {
			System.out.println(c+" is indx out of bounds");
		}
		finally {
			System.out.println("Success");
		}
	}
}
