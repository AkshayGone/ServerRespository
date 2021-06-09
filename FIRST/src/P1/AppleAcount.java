package P1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AppleAcount {
@Test
	
	public void T()
	//public static void main(String[] args) {
	{// TODO Auto-generated method stub
	System.out.println("hi prends");
		ChromeDriver a =new ChromeDriver();
		a.get("https://appleid.apple.com/account");
		a.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		a.findElementByXPath("(//input[@type='text'])[2]").sendKeys("Akshay");
		a.findElementByXPath("(//input[@type='text'])[3]").sendKeys("Gone");
		a.findElementByXPath("//input[@type='email']").sendKeys("vikasgoud.02@gmail.com");
		Select b=new Select(a.findElementByXPath("(//select[@aria-required='true'])[1]"));
		b.selectByVisibleText("India");
		a.findElementByXPath("(//input[@aria-required='true'])[3]").click();
		a.findElementByXPath("(//input[@aria-required='true'])[3]").sendKeys("09/06/1999");
		a.findElementByXPath("(//input[@aria-required='true'])[5]").sendKeys("viky298759");
		a.findElementByXPath("(//input[@aria-required='true'])[6]").sendKeys("viky298759");
		Select c=new Select(a.findElementByXPath("(//select[@aria-required='true'])[2]"));
		c.selectByVisibleText("+91 (India)");
		a.findElementByXPath("(//input[@aria-required='true'])[7]").click();
		a.findElementByXPath("(//input[@aria-required='true'])[7]").sendKeys("9515257489");
		
		
		
		
		
		
		
		
		
		
		

	}

}
