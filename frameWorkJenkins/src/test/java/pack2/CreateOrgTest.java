package pack2;

import org.testng.annotations.Test;

public class CreateOrgTest {
@Test(groups = "SmokeTesting")
public void createOrgTest()
	{
	System.out.println("execute createOrgTest");
	}

@Test(groups = {"RegressionTesting"})
public void modifyOrgTest()
	{
	System.out.println("execute modifyOrgTest");
	}
}
