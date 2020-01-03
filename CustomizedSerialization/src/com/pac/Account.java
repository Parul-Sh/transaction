package com.pac;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
	String username = "durga";
	transient String pwd = "Password" ;
	private void writeObject(ObjectOutputStream oos ) throws Exception{
		oos.defaultWriteObject();
		String epwd = "123"+ pwd;
		oos.writeObject(epwd);
	}
	private void readObject(ObjectInputStream ois) throws Exception{
		ois.defaultReadObject();
		String epwd = (String)ois.readObject();
		pwd= epwd.substring(3);
	}
	
}
