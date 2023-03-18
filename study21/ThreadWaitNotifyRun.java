package study21;

class SaveBox{
	String boxNeed="in";
	int num;
	synchronized void inputNum(int num) {
		if(boxNeed.equals("out")) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		this.num=num;
		boxNeed="out";
		System.out.println("input:"+num);
		notify();
	}
	synchronized void outputNum() {
		if(boxNeed.equals("in")) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		System.out.println("output:"+num);
		boxNeed="in";
		notify();
	}
}
public class ThreadWaitNotifyRun {
	public static void main(String[] args) {
		SaveBox sb = new SaveBox();
		Thread t1 = new Thread() {
			public void run() {
				for(int i=1;i<10;i++) {
					sb.inputNum(i);
				}
			};
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i=1;i<10;i++) {
					sb.outputNum();
				}
			};
		};
		t1.start();
		t2.start();
	}	
}
