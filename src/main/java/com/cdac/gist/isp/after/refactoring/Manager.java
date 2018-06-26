package com.cdac.gist.isp.after.refactoring;

public class Manager {

	private IWorkabale worker;

	public void setWorker(IWorkabale w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}
