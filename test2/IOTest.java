package test2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class IOTest {
	public static void main(String[] args) {
		//FileOutputStream OutputStreamWriter를 활용 a.txt 파일 출력
		//자바공부 열심히.
		//try with resources
		try (
			OutputStream file =	
				new FileOutputStream("src/test2/files/a.txt");
			OutputStreamWriter output = new OutputStreamWriter(file);
		){
			output.write("자바공부 열심히.");
			//output.flush();
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			//output.close();
		}
		System.out.println("완료");
	}
}
