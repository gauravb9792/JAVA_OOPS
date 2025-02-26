package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " my name is java exception";
		try {
			FileOutputStream fos = new FileOutputStream("D:\\JAVA_CLASS\\JAVA\\a.txt");
			byte[] b = str.getBytes();
			fos.write(b);
			System.out.println("successfull ");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
