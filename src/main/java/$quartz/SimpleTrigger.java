package $quartz;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class SimpleTrigger {
	
	public static void main(String[] args) throws Exception {
		// Quartz 1.6.3
		// JobDetail job = new JobDetail();
		// job.setName("dummyJobName");
		// job.setJobClass(HelloJob.class);
		JobDetail job = JobBuilder.newJob(HelloJob.class)
				.withIdentity("dummyJobName", "group1")
				.build();
		
        //Quartz 1.6.3
	// SimpleTrigger trigger = new SimpleTrigger();
	// trigger.setStartTime(new Date(System.currentTimeMillis() + 1000));
	// trigger.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
	// trigger.setRepeatInterval(30000);
		Trigger trigger =TriggerBuilder.newTrigger()
				.withIdentity("dummyTriggerName", "group1")
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever()).build();
		
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.start();
		scheduler.scheduleJob(job, trigger);
	}
}
