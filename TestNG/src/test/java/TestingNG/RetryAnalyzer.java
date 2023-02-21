package TestingNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

		int countRetryAttempts = 0;
		int maxRetryLimit = 3;
		
	public boolean retry(ITestResult result) {
		//if(!result.isSuccess()) {
			if(countRetryAttempts < maxRetryLimit) {
				countRetryAttempts = countRetryAttempts+1;	
				return true;
				}
		//}
		return false;
	}


}
