package com.pac;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomizedSerialization {
 public static void main(String[] args) throws Exception {
	 Account a1 = new Account();
	 System.out.println(a1.username +" "+a1.pwd);
	 FileOutputStream fos = new  FileOutputStream("D:/a.txt");
	 ObjectOutputStream oos = new ObjectOutputStream(fos);
	 oos.writeObject(a1);
	 FileInputStream fis = new  FileInputStream("D:/a.txt");
	 ObjectInputStream ois = new  ObjectInputStream(fis);
	 Account a2 = (Account)ois.readObject();
	 System.out.println(a2.username + "   "+a2.pwd);
 }
}
