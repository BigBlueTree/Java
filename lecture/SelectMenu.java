package lecture;

import java.util.Scanner;

public class SelectMenu {
	Scanner scan = new Scanner(System.in);
	//유효성 검사 필요
	int readInt() {
		return scan.nextInt();
	}
	String readString() {
		return scan.nextLine();
	}
	
}
