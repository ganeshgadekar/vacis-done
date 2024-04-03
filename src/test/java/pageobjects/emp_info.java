package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class emp_info {
WebDriver ldriver;

public emp_info(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

@FindBy(xpath="(//input[@name=\"full_name\"])[1]") WebElement fname;
@FindBy(xpath="(//input[@name=\"email\"])[1]") WebElement e_mail;


public void enter_name(String firstname)
{
	fname.sendKeys(firstname);
}
public void enter_email(String mail)
{
	e_mail.sendKeys(mail);
}

}
