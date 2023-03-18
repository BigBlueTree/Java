package study16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		Scanner sc =null;
		try {
			sc= new Scanner(
				new File("D:\\workspace01\\javastudy"
						+ "\\src\\study16\\input.txt"));
			System.out.println(sc.nextLine());
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(sc!=null) {
				sc.close();
			}
		}
		
	}
}
