package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
WebDriver ldriver;

public login(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(id="email") WebElement uname;
@FindBy(id="password") WebElement pass;
@FindBy(id="loginButton") WebElement btn;



public void setusername(String name)
{
	uname.sendKeys(name);
}
public void setpassword(String pwd)
{
	pass.sendKeys(pwd);
}

public void clickbtn()
{
	btn.click();
}
}
