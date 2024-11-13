package pack1;

import org.testng.annotations.Test;

public class CreateContactTest {
@Test(groups = "RegionalRegressionTesting")
public void createContactTest()
	{
	String Browser=System.getProperty("browser", "chrome");
	String url=System.getProperty("url", "http://localhost:8888");
	String username=System.getProperty("username", "admin");
	String password=System.getProperty("password", "admin");
	System.out.println("browser: "+Browser);
	System.out.println("url: "+url);
	System.out.println("username: "+username);
	System.out.println("password: "+password);

	System.out.println("execute createContactTest");
	}
@Test(groups = "SmokeTesting")
public void modifyContactTest()
	{
	String Browser=System.getProperty("browser", "chrome");
	String url=System.getProperty("url", "http://localhost:8888");
	String username=System.getProperty("username", "admin");
	String password=System.getProperty("password", "admin");
	System.out.println("browser: "+Browser);
	System.out.println("url: "+url);
	System.out.println("username: "+username);
	System.out.println("password: "+password);
	System.out.println("execute modifyContactTest");
	}
}
