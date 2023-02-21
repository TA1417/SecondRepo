package TestingNG;

import org.testng.annotations.Test;

public class parallelTest {
	@Test
	public void test1 () {
		System.out.println("This is test 1| "+Thread.currentThread().getId());
	}
	
	@Test
	public void test2 () {
		System.out.println("This is test 2 |"+Thread.currentThread().getId());
	}
}
