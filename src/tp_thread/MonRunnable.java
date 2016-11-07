package tp_thread;

public class MonRunnable implements Runnable {


	@Override
	public void run() {
		for (char i= 0x20; i <0x30; i++){
			System.out.println(i);
		}

	}

}
