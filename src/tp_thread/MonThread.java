package tp_thread;


public class MonThread extends Thread{

	public MonThread() {
		
	}

	public void run(){
		for (int i=0; i<100; i++){
			System.out.println(i);
		}
	}
}
