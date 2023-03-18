package study17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerPrac {
	public static void main(String[] args) {
		File file = new File("src/study17/files/Input.txt");
		int sum =0;
		try(Scanner sc = new Scanner(file)){
			while(sc.hasNextInt()) {
				sum += sc.nextInt();
			}
			System.out.println(sum);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
