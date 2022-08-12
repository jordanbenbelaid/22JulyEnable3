package com.qa.entity;

import com.qa.interfaces.JobDescription;
import com.qa.interfaces.WorkHours;

//we implement interfaces at the highest level, so that all subclasses (children classes) will be forced to implement
//the methods, but are not needed specifically in this class
public abstract class Job implements JobDescription, WorkHours{

	//method implementation will be different for EACH job
	public abstract void doJob();
	
	//method is used throughout, but will not change (likely to not change)
	public void work() {
		System.out.println("I like working in my job!");
	}
}
