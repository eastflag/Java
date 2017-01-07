package $jmx;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class SimpleAgent2 {
	private MBeanServer mbs = null;

	public SimpleAgent2() {
	 
	      // Get the platform MBeanServer
	       mbs = ManagementFactory.getPlatformMBeanServer();
	 
	      // Unique identification of MBeans
	      Hello helloBean = new Hello();
	      helloBean.setMessage("HELLO - HELLO - HELLO");
	      ObjectName helloName = null;
	 
	      try {
	         // Uniquely identify the MBeans and register them with the platform MBeanServer 
	         helloName = new ObjectName("SimpleAgent:name=SwingHelloThere");
	         mbs.registerMBean(helloBean, helloName);
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	   }

	public static void main(String argv[]) {
		SimpleAgent2 agent = new SimpleAgent2();
		System.out.println("SimpleAgent is running...");
		new PingPong("ping", 2000, 1000).start();
		new PingPong("  pong", 5000, 500).start();
		new PingPong(" ding", 4000, 500).start();
		new PingPong("   dong", 3000, 500).start();
		new PingPong("PONG", 2800, 500).start();
	}
}
