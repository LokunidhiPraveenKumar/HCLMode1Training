package com.hcl.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerialDemo {
	public static void main(String[] args) {
		Employee c = new Employee("Suresh", "E123");
		File outFile = new File(
				"C:\\Users\\user\\Downloads\\HCL_Mode1_Java\\src\\com\\hcl\\serialization\\CempSerial.ser");
		try {
			FileOutputStream fs = new FileOutputStream(outFile);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(c);
			System.out.println("Serialization successfull!!!");
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}