package TestingNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailTestCase {
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1 () {
		Assert.assertTrue(false);
	}
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test2 () {
		Assert.assertTrue(false);
	}
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test3 () {
		Assert.assertTrue(true);
	}
}
	

