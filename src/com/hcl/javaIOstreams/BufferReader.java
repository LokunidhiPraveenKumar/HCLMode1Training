package com.hcl.javaIOstreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
	public static void main(String[] args) {
		try {
			File fl = new File("C:\\Users\\user\\Downloads\\HCL_Mode1_Java\\src\\com\\hcl\\javaIOstreams\\input.txt");
			BufferedReader br = new BufferedReader(new FileReader(fl));
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}