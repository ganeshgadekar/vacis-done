package testpack;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.add_emp;
import pageobjects.login;
import utility.confo_uti;

public class testclass extends baseclass{
	confo_uti ut;
	
	@BeforeMethod
	public void getstart()
	{
		driver.get("https://develop.vacisautomation.com/");
	}
@Test
	public void logtest() throws IOException
{
	ut=new confo_uti();
	login log =new login(driver);
	log.setusername(ut.getusername());
	log.setpassword(ut.getpassword());
	log.clickbtn();
	
	add_emp ad=new add_emp(driver);
	ad.click_emp();
	ad.click_add();	
	}
}
