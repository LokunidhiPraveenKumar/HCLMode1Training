package com.hcl.javaIOstreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
	public static void main(String[] args) {
		try {
			File fl = new File(
					"C:\\Users\\user\\Downloads\\HCL_Mode1_Java\\src\\com\\hcl\\javaIOstreams\\\\myfile.txt");
			String str = "Write this string to my file";
			FileWriter fw = new FileWriter(fl);
			System.out.println("File Created with conctent");
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
