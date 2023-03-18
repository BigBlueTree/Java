package test2;

import java.io.*;

public class FileCopyTest {
	public static void main(String[] args) {
        int data;
		int num=1; //줄 번호
		//불러올 파일 경로 + 이름
		String target = "src/study17/FileClassRun.java";
		// 새로 만들 파일 경로 + 이름
		String dest = "src/test2/files/FileClassRunNum.java";
		try {
			FileInputStream fis = new FileInputStream(target);
			FileOutputStream fos = new FileOutputStream(dest);
			InputStreamReader isr = new InputStreamReader(fis);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			
			while((data=isr.read())!=-1) {
				char c=(char)data;
				if(num==1) {
					osw.write(String.valueOf(num++)+" ");
				}
				osw.write(c);
				if(c=='\n') {
					osw.write(num+++" ");
				}
			}
			osw.flush();
			
			osw.close();isr.close();
			fos.close();fis.close();
			System.out.println("파일 생성");
		} catch(FileNotFoundException e) {
			System.err.println("다음 파일이 없습니다. : "+target);
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
