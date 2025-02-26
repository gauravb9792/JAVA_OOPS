package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class FileInputStreamProgram1 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("D:\\JAVA_CLASS\\JAVA\\a.txt");
			int i;
			while((i=fis.read())!=-1)
					{
				System.out.print((char)i);
					}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	

	}

}
