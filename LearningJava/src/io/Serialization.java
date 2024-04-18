package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
// Serialization is a mechanism of converting the state of an object into a byte stream.
	public static void main(String args[]) {
		try {
			// Creating the object
			Student s1 = new Student(212, "Mayur");
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			// closing the stream
			out.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}