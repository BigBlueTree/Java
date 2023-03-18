package study21;

class DelayThread extends Thread{
	@Override
	public void run() {
		try {Thread.sleep(1500);}catch(InterruptedException e) {};
		System.out.println(getName()+"||Priority"+getPriority());
	}
}
public class ThreadInfoRun {
	public static void main(String[] args) {
//		Thread cut = Thread.currentThread();
//		System.out.println(cut.getName());
//		System.out.println(Thread.activeCount());
//		System.out.println(cut.getState());
//		
//		for(int i=0;i<5;i++) {
//			Thread th = new Thread();
//			System.out.println(th.getName());
//			System.out.println(Thread.activeCount());
//			th.start();
//			System.out.println(Thread.activeCount());
//		}
//		
//		Thread thread = new Thread();
//		thread.setName("직접 만든 이름 쓰레드");
//		thread.start();
//		System.out.println(thread.getName());
//		System.out.println(Thread.activeCount());
//		Thread thread2 = new Thread("생성자 이름");
//		System.out.println(thread2.getName());
		
		for(int i=0;i<3;i++) {
			Thread dth = new DelayThread();
			dth.start();
		}
		System.out.println(Thread.activeCount());
		for(int i=0;i<3;i++) {
			Thread dth = new DelayThread();
			dth.setName("직접지정10 "+i+"thread");
			dth.setPriority(10);
			dth.start();
		}
		System.out.println(Thread.activeCount());
		for(int i=0;i<3;i++) {
			Thread dth = new DelayThread();
			dth.setName("직접지정1 "+i+"thread");
			dth.setPriority(1);
			dth.start();
		}
		System.out.println(Thread.activeCount());

	}
}






