package org.fl.noodlecall.monitor.status.console.schedule;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {
		"classpath:org/fl/noodlecall/monitor/status/console/schedule/noodlecall-monitor-status-schedule-console.xml"
})
public class ConsoleStatusExecuterScheduleTest extends AbstractJUnit4SpringContextTests {

	@Test
	public void test() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
	}
}
