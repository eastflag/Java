package $jmx;

public class PingPong extends Thread {
	String word; // what word to print
	int delay; // how long to pause
	int count; // number of iterations

	PingPong(String What, int Time, int number) {
		word = What;
		delay = Time;
		count = number;
		setName(What);
	}

	public void run() {
		try {
			for (int i = 0; i < count; i++) {
				System.out.println(i + ": " + word + ":" + activeCount());
				sleep(delay); // wait until next time
			}
		} catch (InterruptedException e) {
			return; // end this thread
		}
	}
}
