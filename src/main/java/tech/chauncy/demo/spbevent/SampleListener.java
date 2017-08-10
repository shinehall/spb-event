package tech.chauncy.demo.spbevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener implements ApplicationListener<SampleEvent> {

	@Override
	public void onApplicationEvent(SampleEvent event) {
		String msg = event.getMsg();
		System.out.println("我接收到了一条消息：" + msg);
	}

}
