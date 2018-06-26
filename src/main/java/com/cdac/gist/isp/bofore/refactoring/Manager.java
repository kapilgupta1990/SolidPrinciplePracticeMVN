package com.cdac.gist.isp.bofore.refactoring;

public class Manager {

	private IWorker worker;

	public void setWorker(IWorker w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}
