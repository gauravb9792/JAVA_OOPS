package FileHandling;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadOneFileAndWriteAnother {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("D:\\JAVA_CLASS\\JAVA\\a.txt");
			FileOutputStream fos = new FileOutputStream("D:\\JAVA_CLASS\\JAVA\\b.txt");

			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			fis.close();
		}

	}

}
