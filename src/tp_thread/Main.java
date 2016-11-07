package tp_thread;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new MonThread().start();
//		new MonThread().start();
		
		new Thread(new MonRunnable()).start();
	}

}
