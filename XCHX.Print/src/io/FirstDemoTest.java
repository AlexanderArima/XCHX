package io;

import java.io.*;

public class FirstDemoTest {
	public static void main(String[] args) {
		FileInputStream stream = null;
		try {
			// 读取文件流
			stream = new FileInputStream("E://1.txt");
			int num = -1;
			StringBuilder builder = new StringBuilder();
			while((num = stream.read()) != -1) {
				// 将ASCI码转成字节码
				builder.append((char)num);
			}
			System.out.println(builder.toString());
			stream.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
