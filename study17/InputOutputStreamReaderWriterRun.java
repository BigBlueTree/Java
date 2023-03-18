package study17;

import java.io.*;
import java.util.Arrays;

public class InputOutputStreamReaderWriterRun {
	public static void main(String[] args) throws IOException {
		File file = new File("src/study17/files/FileReadWriter.txt");
		
		OutputStream os = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		osw.write("aaa".toCharArray());
		osw.write("sdfad");
		osw.flush();
		osw.close();os.close();
		
		InputStream is = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(is);
		int data = 0;
		char[] buffer = new char[1024];
		while((data=isr.read(buffer))!=-1) {
			System.out.println(Arrays.toString(buffer));
		}
		isr.close();is.close();
		
		OutputStreamWriter osw2 = new OutputStreamWriter(System.out);
		osw2.write("콘솔 출력을 위한 입력");
		osw2.write(buffer,0,buffer.length);
		osw2.flush();
		osw2.close();
	}
}
