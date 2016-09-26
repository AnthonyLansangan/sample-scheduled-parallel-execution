package com.anthony.sample.scheduled.parallel.execution;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.anthony.sample.scheduled.parallel.execution.task.Task1;
import com.anthony.sample.scheduled.parallel.execution.task.Task2;
import com.anthony.sample.scheduled.parallel.execution.task.Task3;

public class App {
	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecuter = Executors.newScheduledThreadPool(3);
		Task1 task1 = new Task1();
		Task2 task2 = new Task2();
		Task3 task3 = new Task3();
		scheduledExecuter.scheduleWithFixedDelay(task1, 0, 5, TimeUnit.SECONDS);
		scheduledExecuter.scheduleWithFixedDelay(task2, 0, 5, TimeUnit.SECONDS);
		scheduledExecuter.scheduleWithFixedDelay(task3, 0, 5, TimeUnit.SECONDS);
	}
}
