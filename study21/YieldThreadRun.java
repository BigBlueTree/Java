package study21;

class SharedClass{
	private int sum=0;
	public void add(int x) {
		Thread.yield();
		System.out.println(Thread.currentThread().getName()+"시작");
		sum+=x;
		System.out.println(Thread.currentThread().getName()+"끝");
	}
	public void getSum() {
		System.out.println(sum);
	}
}
public class YieldThreadRun {
	public static void main(String[] args) {
		SharedClass sc = new SharedClass();
		Thread t1=new Thread() {
			public void run() {
				sc.add(13);
				sc.getSum();
			};
		};
		Thread t2=new Thread() {
			public void run() {
				sc.add(10);
				sc.getSum();
			};
		};
		System.out.println("1"+Thread.currentThread().getName());
		t1.start();
		System.out.println("2"+Thread.currentThread().getName());
		t2.start();
		System.out.println("3"+Thread.currentThread().getName());
		sc.getSum();
		System.out.println(Thread.activeCount());
	}
}
