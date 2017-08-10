package tech.chauncy.demo.spbevent;

import org.springframework.context.ApplicationEvent;

public class SampleEvent extends ApplicationEvent {
	private static final long serialVersionUID = -4207614552109313401L;

	private String msg;
	
	public SampleEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
