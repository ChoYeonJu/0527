package fileex;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis = new FileInputStream("C:/Users/Administrator/eclipse-workspace/0527/src/fileex/FileInputStreamExample.java");
			
			int data;
			
			while((data = fis.read()) != -1) {
				System.out.println(data);
			}
			fis.close();
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

}
