package org.elements;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnereClass2 {
	
	@Test
	public void demo() {
		
		Result r = JUnitCore.runClasses(JunitA.class , JunitB.class);
		
		int failurecount = r.getFailureCount();
		System.out.println("No of Failure="+failurecount);
		
		int ignorecount = r.getIgnoreCount();
		System.out.println("No of ignorecount="+ignorecount);
		
		int runcount = r.getRunCount();
		System.out.println("No of runcount="+runcount);
		
		List<Failure> f = r.getFailures();
		for (Failure failure : f) {
			System.out.println(failure);
		}
	}

}
