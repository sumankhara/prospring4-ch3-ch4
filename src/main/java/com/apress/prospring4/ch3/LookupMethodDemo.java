package com.apress.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class LookupMethodDemo {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:method-injection.xml");
		
		DemoBean standardBean = ctx.getBean(StandardLookupDemoBean.class);
		DemoBean abstractBean = ctx.getBean(AbstractLookupDemoBean.class);
		
		displayInfo(standardBean);
		displayInfo(abstractBean);
	}

	public static void displayInfo(DemoBean bean) {
		if(bean instanceof StandardLookupDemoBean) {
			System.out.println("StandardLookupDemoBean -- setter injection");
		}
		else {
			System.out.println("AbstractLookupDemoBean -- method injection");
		}
		
		MyHelper helper1 = bean.getMyHelper();
		MyHelper helper2 = bean.getMyHelper();
		
		System.out.println("Helper instances the same? : " + (helper1 == helper2));
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start("lookupDemo");
		
		for (int i = 0; i < 100000; i++) {
			MyHelper helper = bean.getMyHelper();
			helper.doSomethingHelpful();
		}
		
		stopWatch.stop();
		
		System.out.println("100000 gets took " + stopWatch.getTotalTimeMillis() + " ms");
	}
}
