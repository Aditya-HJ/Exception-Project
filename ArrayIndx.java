package exeptionHandl;

public class ArrayIndx {
	public static void main(String[] args) {
		String[] a={"java","python","C++"};
		try {
		System.out.println(a[7]);
		}
		catch(StringIndexOutOfBoundsException a1) {
			System.out.println(a1+" is Str Indx out");
			a1.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println(b+" is Array indx out");
			b.printStackTrace();
		}
		catch(IndexOutOfBoundsException c) {
			System.out.println(c+" is indx out of bounds");
			c.printStackTrace();
		}
		finally {
			System.out.println("Sucess");
		}
		System.out.println("Rest of the code");
	}
}
