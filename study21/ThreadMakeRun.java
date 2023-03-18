package study21;

//Thread 클래스를 상속
class DdukThread extends Thread{
	@Override
	public void run() {
		String[] lman = {"짝","떡","짝","떡","짝","떡"};
		for(int i=0;i<lman.length;i++) {
			System.out.println("왼쪽 떡방아:"+lman[i]);
			try {
				Thread.sleep(300);
			}catch(InterruptedException e){};
		}
	}
}
//Runnable interface를 구현
class DdukRunnable implements Runnable{
	@Override
	public void run() {
		String[] rman = {"쿵","쿵","쿵","쿵","쿵","쿵"};
		for(int i=0;i<rman.length;i++) {
			System.out.println("오른쪽 떡방아:"+rman[i]);
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {};
		}
	}
}

public class ThreadMakeRun {
	public static void main(String[] args) {
		//Thread 객체 생성
		Thread ldduk = new DdukThread();
		ldduk.start();
		
		Runnable rman = new DdukRunnable();
		Thread rdduk = new Thread(rman); 
		//Thread rdduk = new Thread(new DdukRunnable());
		rdduk.start();
		
		Thread tdduk = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] tman = {"핫","핫","핫","핫","핫","핫"};
				for(int i=0;i<tman.length;i++) {
					System.out.println("떡 마는 사람:"+tman[i]);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {};
				}
			}
		});
		tdduk.start();
	}
}


