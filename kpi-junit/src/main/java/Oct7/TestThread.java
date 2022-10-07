package Oct7;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThread {
	public static void main(final String[]arguments)throws InterruptedException{
		//concurrent: many things happening in parallel:T1,T2...
		Executor executor = Executors.newCachedThreadPool();//when we want multiple things at one point
		executor.execute(new Task());//passing the constructor call for thread creations, threads with difference of duration 5min
		//repeat same task...:pool of tasks
		ThreadPoolExecutor pool = (ThreadPoolExecutor)executor;
		//pool of threads means many threads with difference=same=5mins
		pool.shutdown();

	}
//class xyz implements Runnable->xyz is eligible to become a thread ->process1
//class xyz extending thread-> xyz is eligible to become a thread->process2
 //nested class : static: to create threads with a difference of duration=5min
	public static class Task implements Runnable //task=thread by process1
{
	public void run() {
		try {
			long duration = (long)(Math.random()*5);
			System.out.println( "Running Task");
			TimeUnit.SECONDS.sleep(duration);//halting the thread,every thread will execute at 5min interval
			//t1..5min...t2...5min...sleep:takes only one and one argument:duration
			System.out.println("Task Completed");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}}