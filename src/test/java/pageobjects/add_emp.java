package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class add_emp {
WebDriver ldriver;

@FindBy(xpath="(//span[text()='Employees'])[2]") WebElement emp;
@FindBy(xpath="//a[@data-bs-target=\"#add_employee\"]") WebElement add;

public add_emp(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}


public void click_emp()
{
	emp.click();
}
public void click_add()
{
	add.click();
}


}
