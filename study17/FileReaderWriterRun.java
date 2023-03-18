package study17;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriterRun {
	public static void main(String[] args) {
		File file = new File("src\\study17\\files\\"+
							"FileReaderWriter.txt");
		try(
			Writer writer = new FileWriter(file);
			Reader reader = new FileReader(file);
		){
			writer.write("Korea army\n".toCharArray());
			writer.write(123);
			writer.write("come to my home",3,8);
			writer.flush();
			
			int data;
			while((data=reader.read())!=-1) {
				System.out.print((char)data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}











