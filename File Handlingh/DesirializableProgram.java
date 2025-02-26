package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesirializableProgram {

	public static void main(String[] args) {
	try {
		FileInputStream fis=new FileInputStream("D:\\JAVA_CLASS\\JAVA\\d.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student sc=(Student)ois.readObject();
		sc.display();
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}

	}

}
