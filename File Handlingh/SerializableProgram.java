package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	String name;
	int rollno;
	String branch;
	public Student(String name, int rollno, String branch) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
	}
	
	public void display()
	{
		System.out.println("name : "+name);
		System.out.println("rollno : "+rollno);
		System.out.println("branch : "+branch);
	}
}

public class SerializableProgram {

	public static void main(String[] args) {
		Student s1=new Student("gaurav", 1001, "CS");
		try {
			FileOutputStream fos=new FileOutputStream("D:\\JAVA_CLASS\\JAVA\\d.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			
		}
		
	}

}
