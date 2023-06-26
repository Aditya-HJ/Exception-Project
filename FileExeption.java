package exeptionHandl;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExeption {
	public static void main(String[] args) {
//		char a='A';
//		char b='B';
//		System.out.println(a+b);
		
		try {
		File file=new File("C:\\Users\\JavaText.txt");
		FileReader f=new FileReader(file);
		int temp=0;
		while((temp=f.read())!=-1) {
			System.out.println((char)(temp));
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
