package study16;

public class ArithmaticRun {
	public static void main(String[] args) {
		try {
			byte[] list = {'a','b','c'};
			System.out.println(list[5]);	
			System.out.println(5/0);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("예외 원인:"+e.getMessage());
			System.out.println(e.toString());
		}finally {
			System.out.println("반드시 실행.");
		}
		

	}
}
