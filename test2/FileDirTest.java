package test2;

import java.io.File;

public class FileDirTest {
	public static void main(String[] args) {
		String path="D:\\workspace01\\javastudy\\src";
//		File src = new File(path);
//		//현재폴더의 하부 파일과 디렉토리를 구분하여 출력
//		File[] files = src.listFiles();
//		for(File file:files) {
//			System.out.print((file.isFile())?"파일:":"폴더:");
////			if(file.isDirectory()) { 
////				System.out.print("폴더:"); 
////			}else { 
////				System.out.print("파일:"); 
////			}
//			System.out.println(file.getName()+" \t "+file.getPath());
//		}
		showHierarchy(path);
	}
	
	static void showHierarchy(String path) {
		File target = new File(path);
		File[] subFiles = target.listFiles();
		for(File file:subFiles) {
			if(file.isDirectory()) { 
				System.out.println("폴더:"+file.getName()+" \t "
						+file.getPath());
				showHierarchy(file.getPath()); //재귀함수 호출 
			}else { 
				System.out.println("파일:"+file.getName()+" \t "
						+file.getPath());
				
			}
		}
	}
}
