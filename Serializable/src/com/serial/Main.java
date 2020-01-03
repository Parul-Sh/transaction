package com.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		Integerr num = new Integerr();
		File file= new File("D:/a.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(num);
		oos.close();
	    fos.close();
 
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Integerr number = (Integerr) ois.readObject();
		System.out.println(number.i + "    " + number.j);

	}

}
