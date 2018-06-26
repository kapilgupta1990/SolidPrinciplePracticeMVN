package com.cdac.gist.dip.after.refactoring;

public class Manager {
	IWorker worker;



	public void setWorker(Worker w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}
