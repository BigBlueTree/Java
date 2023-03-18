package study17;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileClassRun {
	public static void main(String[] args) 
		throws IOException{
		String path = "D:\\workspace01\\javastudy"
				+ "\\src\\study17\\files";
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdir();
		}
		System.out.println(dir.exists());
		
		File file = new File(path+"\\TestFile.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		System.out.println(file.exists());
		
		File file2 = new File("D:\\workspace01\\javastudy\\"
				+ "src\\study17\\files\\TestFile.txt");
		File file3 = new File("D:/workspace01/javastudy/"
				+ "src/study17/files/TestFile.txt");
		File file4 = new File("D:"+File.separator+"workspace01"
				+File.separator+"javastudy"
				+File.separator+"src"+File.separator+"study17"
				+File.separator+"files"
				+File.separator+"TestFile.txt");
		System.out.println(file2.exists()+" "
				+file2.getAbsolutePath());
		System.out.println(file3.exists()+" "
				+file3.getAbsolutePath());
		System.out.println(file4.exists()+" "
				+file4.getAbsolutePath());
		
		System.out.println(System.getProperty("user.dir"));
		File file5 = new File("src/study17/files/TestFile.txt");
		File file6 = new File("src/study17/files/temp/TestFile.txt");
		System.out.println(file5.exists()+" "
				+file5.getAbsolutePath());
		System.out.println(file6.exists()+" "
				+file6.getAbsolutePath());
		
		System.out.println(dir.getName()+" "+dir.isDirectory()+" "
				+dir.getParent());
		System.out.println(file.getName()+" "+file.isFile()+" "
				+file.getParent());
		
		File dir2 = new File(path+"\\temp");
		System.out.println(dir2.mkdir());
		
		File[] files = dir.listFiles();
		for(File file7:files) {
			System.out.println(file7.getName()+" "
					+(file7.isFile()?">파일":">디렉토리"));
		}
		
		Charset cs = Charset.forName("UTF-8");
		Charset cs2 = Charset.defaultCharset();
		System.out.println(cs2);
		System.out.println(Charset.isSupported("EUC-KR"));
		
		byte[] arr1 = "재승".getBytes();
		byte[] arr2 = "현명".getBytes(Charset.defaultCharset());
		byte[] arr3 = "종호".getBytes(Charset.forName("MS949"));
		byte[] arr4 = "만수".getBytes("UTF-8");
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		System.out.println(arr4.length);
		
		String str1 = new String(arr1);
		String str2 = new String(arr2,Charset.defaultCharset());
		String str3 = new String(arr3,Charset.forName("MS949"));
		String str4 = new String(arr4,"UTF-8");
		String str5 = new String(arr3,"UTF-8");
		String str6 = new String(arr4,"MS949");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}
	
}




