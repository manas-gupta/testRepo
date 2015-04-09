package testRepo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class HelloWorld 
{
	static final Logger logger = LogManager.getLogger(testRepo.HelloWorld.class);
	public static void main(String[] args)
	{
		logger.info("Hello World!");

	}

}

