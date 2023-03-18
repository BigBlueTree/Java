package test2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MakeSomethingNew {
	public static void main(String[] args) throws IOException {
		//test2.files 아래로 폴더명과 파일명을 입력 받아서 새로 생성
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.print("생성할 폴더명 입력:");
		String folderName = scan.nextLine();
		System.out.print("생성할 파일명(확장자) 입력:");
		String fileName = scan.nextLine();
		//폴더 생성
		String path=System.getProperty("user.dir")+"/src/test2/files";
		String folderPath = path+"/"+folderName;
		File dir = new File(folderPath);
		if(!dir.exists()) {
			dir.mkdir();
		}
		//파일 생성
		String filePath = folderPath+"/"+fileName;
		File file = new File(filePath);
		if(!file.exists()) {
			file.createNewFile();
		}
		if(dir.exists()&&file.exists()) {
			System.out.println("success");
		}else {
			System.out.println("fail");
		}
	}
}
