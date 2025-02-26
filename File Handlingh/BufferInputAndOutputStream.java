package FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputAndOutputStream {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D:\\JAVA_CLASS\\JAVA\\a.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int i;
//		while((i=bis.read())!=-1)
//		{
//			System.out.print((char)i);
//		}


		FileOutputStream fos = new FileOutputStream("D:\\JAVA_CLASS\\JAVA\\c.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		while ((i = bis.read()) != -1) {
			bos.write(i);
		}
		System.out.println("successfully added data");
		bos.flush();
		fis.close();
		fos.close();
		bis.close();
		bos.close();

	}

}
