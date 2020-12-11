package com.hcl.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeDeserialDemo {
	public static void main(String[] args) {
		File ReadFile = new File(
				"C:\\Users\\user\\Downloads\\HCL_Mode1_Java\\src\\com\\hcl\\serialization\\CempSerial.ser");
		try {
			FileInputStream fis = new FileInputStream(ReadFile);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee e = (Employee) ois.readObject();
			System.out.println("Deserialized Employee name= " + e.getName());
			System.out.println("Deserialized Employee ID= " + e.getId());
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}