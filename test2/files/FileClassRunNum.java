1 package study17;
2 
3 import java.io.File;
4 import java.io.IOException;
5 import java.nio.charset.Charset;
6 
7 public class FileClassRun {
8 	public static void main(String[] args) 
9 		throws IOException{
10 		String path = "D:\\workspace01\\javastudy"
11 				+ "\\src\\study17\\files";
12 		File dir = new File(path);
13 		if(!dir.exists()) {
14 			dir.mkdir();
15 		}
16 		System.out.println(dir.exists());
17 		
18 		File file = new File(path+"\\TestFile.txt");
19 		if(!file.exists()) {
20 			file.createNewFile();
21 		}
22 		System.out.println(file.exists());
23 		
24 		File file2 = new File("D:\\workspace01\\javastudy\\"
25 				+ "src\\study17\\files\\TestFile.txt");
26 		File file3 = new File("D:/workspace01/javastudy/"
27 				+ "src/study17/files/TestFile.txt");
28 		File file4 = new File("D:"+File.separator+"workspace01"
29 				+File.separator+"javastudy"
30 				+File.separator+"src"+File.separator+"study17"
31 				+File.separator+"files"
32 				+File.separator+"TestFile.txt");
33 		System.out.println(file2.exists()+" "
34 				+file2.getAbsolutePath());
35 		System.out.println(file3.exists()+" "
36 				+file3.getAbsolutePath());
37 		System.out.println(file4.exists()+" "
38 				+file4.getAbsolutePath());
39 		
40 		System.out.println(System.getProperty("user.dir"));
41 		File file5 = new File("src/study17/files/TestFile.txt");
42 		File file6 = new File("src/study17/files/temp/TestFile.txt");
43 		System.out.println(file5.exists()+" "
44 				+file5.getAbsolutePath());
45 		System.out.println(file6.exists()+" "
46 				+file6.getAbsolutePath());
47 		
48 		System.out.println(dir.getName()+" "+dir.isDirectory()+" "
49 				+dir.getParent());
50 		System.out.println(file.getName()+" "+file.isFile()+" "
51 				+file.getParent());
52 		
53 		File dir2 = new File(path+"\\temp");
54 		System.out.println(dir2.mkdir());
55 		
56 		File[] files = dir.listFiles();
57 		for(File file7:files) {
58 			System.out.println(file7.getName()+" "
59 					+(file7.isFile()?">파일":">디렉토리"));
60 		}
61 		
62 		Charset cs = Charset.forName("UTF-8");
63 		Charset cs2 = Charset.defaultCharset();
64 		System.out.println(cs2);
65 		System.out.println(Charset.isSupported("EUC-KR"));
66 		
67 		byte[] arr1 = "재승".getBytes();
68 		byte[] arr2 = "현명".getBytes(Charset.defaultCharset());
69 		byte[] arr3 = "종호".getBytes(Charset.forName("MS949"));
70 		byte[] arr4 = "만수".getBytes("UTF-8");
71 		
72 		System.out.println(arr1.length);
73 		System.out.println(arr2.length);
74 		System.out.println(arr3.length);
75 		System.out.println(arr4.length);
76 		
77 		String str1 = new String(arr1);
78 		String str2 = new String(arr2,Charset.defaultCharset());
79 		String str3 = new String(arr3,Charset.forName("MS949"));
80 		String str4 = new String(arr4,"UTF-8");
81 		String str5 = new String(arr3,"UTF-8");
82 		String str6 = new String(arr4,"MS949");
83 		
84 		System.out.println(str1);
85 		System.out.println(str2);
86 		System.out.println(str3);
87 		System.out.println(str4);
88 		System.out.println(str5);
89 		System.out.println(str6);
90 	}
91 	
92 }
93 
94 
95 
96 
97 