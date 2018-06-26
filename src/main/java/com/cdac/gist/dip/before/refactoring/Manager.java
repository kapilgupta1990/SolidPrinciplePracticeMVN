package com.cdac.gist.dip.before.refactoring;

public class Manager {
	Worker worker;



	public void setWorker(Worker w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}
