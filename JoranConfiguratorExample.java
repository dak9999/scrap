package daq;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

public class JoranConfiguratorExample {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	private void setLogLevel2Debug() {
		try {
			LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
			JoranConfigurator configurator = new JoranConfigurator();
			configurator.setContext(context);
			context.reset();
			configurator.doConfigure("logback.xml 절대경로");
			StatusPrinter.printInCaseOfErrorsOrWarnings(context);		
		} catch (JoranException e) {
			//nothing to do...
		}
	}
	
	public void action {
		
		//악마의 장난... ===> 디버깅 레벨을 조정
		setLogLevel2Debug();
	}

}
