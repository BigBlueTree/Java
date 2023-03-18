package study16;

public class MultiExceptionRun {
	public static void main(String[] args) {
		CalTest cal = new CalTest();
		cal.exceptionProc(1, 2);
		cal.exceptionProc(2, 0);
		cal.exceptionProc(4, 2);
	}
}
class CalTest{
	private int[] arr = new int[3];
	CalTest() {
		arr[0]=0;
		arr[1]=100;
		arr[2]=10;
	}
	public void exceptionProc(int first,int second) {
		try {
			System.out.println(arr[first]/arr[second]);
			System.out.println(">>>>><<<<<<<");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("finally");
		}
	}
}




