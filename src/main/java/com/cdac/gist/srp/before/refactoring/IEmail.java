package com.cdac.gist.srp.before.refactoring;

import com.cdac.gist.srp.after.refactoring.IContent;

public interface IEmail {
	public void setSender(String sender);

	public void setReceiver(String receiver);

	public void setContent(IContent content);
}
