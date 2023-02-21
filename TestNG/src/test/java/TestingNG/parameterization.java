package TestingNG;

import org.testng.annotations.*;

public class parameterization {
	 
	@Test
	@Parameters({"i","j"})
	public void add(int a, int b) {
		System.out.println("add:" + (a+b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void sub (int a, int b) {
		System.out.println("subs:" + (a-b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void mul(int a, int b) {
		System.out.println("multiply:" + (a*b));
	}
	
	@Test
	@Parameters({"carCompany"})
	public void car (String name) {
		System.out.println("Car Company:" + name);
	}
	@Test
	@Parameters({"mobCompany"})
	public void mobile (String name) {
		System.out.println("Mobile Company:" + name);
	}
}
