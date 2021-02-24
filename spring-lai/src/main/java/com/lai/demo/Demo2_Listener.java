package com.lai.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo2_Listener implements ApplicationListener<ApplicationEvent> {
	/**
	 * Handle an application event.
	 * 
	 * @param event the event to respond to
	 */
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("TulingApplicationListener 接受到了一个事件"+event);
	}

}
