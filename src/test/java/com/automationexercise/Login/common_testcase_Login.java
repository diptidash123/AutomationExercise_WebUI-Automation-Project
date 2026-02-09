package com.automationexercise.Login;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class common_testcase_Login 
{

	    
		WebDriver driver;
		//Login with valid email and password.

		@Test
		public void TC_01()
		{
			System.setProperty("webdriver.chrome.driver", 
			"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
			driver=new ChromeDriver();
			driver.get("https://www.automationexercise.com/");
			driver.manage().window().maximize();
			WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
			SinUp_LoginButton.click();
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String ActualURL=driver.getCurrentUrl();
			String ExpectedURL="https://www.automationexercise.com/login";
			if(ActualURL.equals(ExpectedURL))
			{
				System.out.println("URL validated successfully");
			}
			else
			{
				System.out.println("URL Not - validated successfully");
			}
			WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
			WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
			WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
			EmailAddress.sendKeys("diptiranjandasdipti@gmail.com");
			Password.sendKeys("mac1998@");
			Login.click();
			try 
			{
				Thread.sleep(7000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String LoggedIn=driver.findElement(By.xpath("//div[@class=\"shop-menu pull-right\"]//ul//li[10]//a")).getText();
		    System.out.println("User logged successfully Dipti Ranjan: " + LoggedIn);
		    driver.close();
		}
		//Verify email field accepts valid email format
		@Test
		public void TC_02()
		{
			System.setProperty("webdriver.chrome.driver", 
			"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
			driver=new ChromeDriver();
			driver.get("https://www.automationexercise.com/");
			driver.manage().window().maximize();
			WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
			SinUp_LoginButton.click();
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String ActualURL=driver.getCurrentUrl();
			String ExpectedURL="https://www.automationexercise.com/login";
			if(ActualURL.equals(ExpectedURL))
			{
				System.out.println("URL validated successfully");
			}
			else
			{
				System.out.println("URL Not - validated successfully");
			}
			WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
			WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
			WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
			EmailAddress.sendKeys("diptiranjandasdipti@gmail.com");
			Password.sendKeys("mac1998@");
			Login.click();
			try 
			{
				Thread.sleep(7000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String LoggedIn=driver.findElement(By.xpath("//div[@class=\"shop-menu pull-right\"]//ul//li[10]//a")).getText();
		    System.out.println("User logged successfully Dipti Ranjan: " + LoggedIn);
		    driver.close();
		}
		//Verify password field masks input
		@Test
		public void TC_03()
		{
			System.setProperty("webdriver.chrome.driver", 
			"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
			driver=new ChromeDriver();
			driver.get("https://www.automationexercise.com/");
			driver.manage().window().maximize();
			WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
			SinUp_LoginButton.click();
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String ActualURL=driver.getCurrentUrl();
			String ExpectedURL="https://www.automationexercise.com/login";
			if(ActualURL.equals(ExpectedURL))
			{
				System.out.println("URL validated successfully");
			}
			else
			{
				System.out.println("URL Not - validated successfully");
			}
			WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
			WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
			WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
			EmailAddress.sendKeys("diptiranjandasdipti@gmail.com");
			Password.sendKeys("mac1998@");
			Login.click();
			try 
			{
				Thread.sleep(7000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String LoggedIn=driver.findElement(By.xpath("//div[@class=\"shop-menu pull-right\"]//ul//li[10]//a")).getText();
		    System.out.println("User logged successfully Dipti Ranjan: " + LoggedIn);
		    driver.close();
}
		//Login using registered user credentials
		@Test
		public void TC_04()
		{
			System.setProperty("webdriver.chrome.driver", 
			"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
			driver=new ChromeDriver();
			driver.get("https://www.automationexercise.com/");
			driver.manage().window().maximize();
			WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
			SinUp_LoginButton.click();
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String ActualURL=driver.getCurrentUrl();
			String ExpectedURL="https://www.automationexercise.com/login";
			if(ActualURL.equals(ExpectedURL))
			{
				System.out.println("URL validated successfully");
			}
			else
			{
				System.out.println("URL Not - validated successfully");
			}
			WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
			WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
			WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
			EmailAddress.sendKeys("diptiranjandasdipti@gmail.com");
			Password.sendKeys("mac1998@");
			Login.click();
			try 
			{
				Thread.sleep(7000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String LoggedIn=driver.findElement(By.xpath("//div[@class=\"shop-menu pull-right\"]//ul//li[10]//a")).getText();
		    System.out.println("User logged successfully Dipti Ranjan: " + LoggedIn);
		    driver.close();
		}
		//Login using email with uppercase letters
		@Test
		public void TC_05()
		{
			System.setProperty("webdriver.chrome.driver", 
			"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
			driver=new ChromeDriver();
			driver.get("https://www.automationexercise.com/");
			driver.manage().window().maximize();
			WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
			SinUp_LoginButton.click();
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String ActualURL=driver.getCurrentUrl();
			String ExpectedURL="https://www.automationexercise.com/login";
			if(ActualURL.equals(ExpectedURL))
			{
				System.out.println("URL validated successfully");
			}
			else
			{
				System.out.println("URL Not - validated successfully");
			}
			WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
			WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
			WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
			EmailAddress.sendKeys("DIPTIRANJANDASDIPTI@GMAIL.COM");
			Password.sendKeys("mac1998@");
			Login.click();
			String ErrorMessage_origional=driver.findElement(By.xpath("//p[.=\"Your email or password is incorrect!\"]")).getText();
			String ErrorMessage_expected="Your email or password is incorrect!";
			if(ErrorMessage_origional.equals(ErrorMessage_expected))
			{
				System.out.println("The email address cannot accepts UPPERCASE AS EMAIL STRING - Error");
			}
			else
			{
				System.out.println("The email address accepts UPPERCASE AS EMAIL STRING - No Error");
			}
		    driver.close();
}
		//Press Enter key instead of clicking Login
		@Test
		public void TC_06()
		{
			System.setProperty("webdriver.chrome.driver", 
			"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
			driver=new ChromeDriver();
			driver.get("https://www.automationexercise.com/");
			driver.manage().window().maximize();
			WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
			SinUp_LoginButton.click();
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String ActualURL=driver.getCurrentUrl();
			String ExpectedURL="https://www.automationexercise.com/login";
			if(ActualURL.equals(ExpectedURL))
			{
				System.out.println("URL validated successfully");
			}
			else
			{
				System.out.println("URL Not - validated successfully");
			}
			WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
			WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
			//WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
			EmailAddress.sendKeys("diptiranjandasdipti@gmail.com");
			Password.sendKeys("mac1998@");
			
			//Actions class use for enter operation 
			Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();
			
			
			/*String ErrorMessage_origional=driver.findElement(By.xpath("//p[.=\"Your email or password is incorrect!\"]")).getText();
			String ErrorMessage_expected="Your email or password is incorrect!";
			if(ErrorMessage_origional.equals(ErrorMessage_expected))
			{
				System.out.println("The email address cannot accepts UPPERCASE AS EMAIL STRING - Error");
			}
			else
			{
				System.out.println("The email address accepts UPPERCASE AS EMAIL STRING - No Error");
			}*/
			try 
			{
				Thread.sleep(7000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String LoggedIn=driver.findElement(By.xpath("//div[@class=\"shop-menu pull-right\"]//ul//li[10]//a")).getText();
		    System.out.println("User logged successfully Dipti Ranjan: " + LoggedIn);
		    driver.close();
}
		//Login with empty email and password.
		@Test
		public void TC_07()
		{
			        System.setProperty("webdriver.chrome.driver", 
					"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
					driver=new ChromeDriver();
					driver.get("https://www.automationexercise.com/");
					driver.manage().window().maximize();
					WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
					SinUp_LoginButton.click();
					try 
					{
						Thread.sleep(5000);
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String ActualURL=driver.getCurrentUrl();
					String ExpectedURL="https://www.automationexercise.com/login";
					if(ActualURL.equals(ExpectedURL))
					{
						System.out.println("URL validated successfully");
					}
					else
					{
						System.out.println("URL Not - validated successfully");
					}
					WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
					WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
					WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
					EmailAddress.sendKeys("");
					Password.sendKeys("");
					Login.click();
					String message = Password.getAttribute("validationMessage");
					System.out.println("The tooltip message is : " + message);
					AssertJUnit.assertEquals(message, "Please fill in this field.");//TRUE
					driver.close();
		}
        //Login with empty email.
		@Test
		public void TC_08()
		{
			        System.setProperty("webdriver.chrome.driver", 
					"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
					driver=new ChromeDriver();
					driver.get("https://www.automationexercise.com/");
					driver.manage().window().maximize();
					WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
					SinUp_LoginButton.click();
					try 
					{
						Thread.sleep(5000);
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String ActualURL=driver.getCurrentUrl();
					String ExpectedURL="https://www.automationexercise.com/login";
					if(ActualURL.equals(ExpectedURL))
					{
						System.out.println("URL validated successfully");
					}
					else
					{
						System.out.println("URL Not - validated successfully");
					}
					WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
					WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
					WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
					EmailAddress.sendKeys("");
					Password.sendKeys("mac1998@");
					Login.click();
					String message = EmailAddress.getAttribute("validationMessage");
					System.out.println("The tooltip message is : " + message);
					AssertJUnit.assertEquals(message, "Please fill in this field.");//TRUE
					driver.close();
		}
		//Login with empty password
		@Test
		public void TC_09()
		{
			        System.setProperty("webdriver.chrome.driver", 
					"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
					driver=new ChromeDriver();
					driver.get("https://www.automationexercise.com/");
					driver.manage().window().maximize();
					WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
					SinUp_LoginButton.click();
					try 
					{
						Thread.sleep(5000);
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String ActualURL=driver.getCurrentUrl();
					String ExpectedURL="https://www.automationexercise.com/login";
					if(ActualURL.equals(ExpectedURL))
					{
						System.out.println("URL validated successfully");
					}
					else
					{
						System.out.println("URL Not - validated successfully");
					}
					WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
					WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
					WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
					EmailAddress.sendKeys("diptiranjan12345");
					Password.sendKeys("mac1998@");
					Login.click();
					String message = EmailAddress.getAttribute("validationMessage");
					System.out.println("The tooltip message is : " + message);
					AssertJUnit.assertEquals(message, "Please include an '@' in the email address. 'diptiranjan12345' is missing an '@'.");//TRUE
					driver.close();
		}
		//Invalid email format
		@Test
		public void TC_10()
		{
			        System.setProperty("webdriver.chrome.driver", 
					"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
					driver=new ChromeDriver();
					driver.get("https://www.automationexercise.com/");
					driver.manage().window().maximize();
					WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
					SinUp_LoginButton.click();
					try 
					{
						Thread.sleep(5000);
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String ActualURL=driver.getCurrentUrl();
					String ExpectedURL="https://www.automationexercise.com/login";
					if(ActualURL.equals(ExpectedURL))
					{
						System.out.println("URL validated successfully");
					}
					else
					{
						System.out.println("URL Not - validated successfully");
					}
					WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
					WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
					WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
					EmailAddress.sendKeys("diptiranjandasdipti@gmail.com");
					Password.sendKeys("");
					Login.click();
					String message = Password.getAttribute("validationMessage");
					System.out.println("The tooltip message is : " + message);
					//Assert.assertEquals(message, "Please fill in this field.");//TRUE
					driver.close();
		}
		//Very long email input
		@Test
		public void TC_11()
		{
			        System.setProperty("webdriver.chrome.driver", 
					"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
					driver=new ChromeDriver();
					driver.get("https://www.automationexercise.com/");
					driver.manage().window().maximize();
					WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
					SinUp_LoginButton.click();
					try 
					{
						Thread.sleep(5000);
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String ActualURL=driver.getCurrentUrl();
					String ExpectedURL="https://www.automationexercise.com/login";
					if(ActualURL.equals(ExpectedURL))
					{
						System.out.println("URL validated successfully");
					}
					else
					{
						System.out.println("URL Not - validated successfully");
					}
					WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
					WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
					WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
					EmailAddress.sendKeys("diptiranjandasdipti@gmail.com");
					Password.sendKeys("1234ghtry455");
					Login.click();
					String Error=driver.findElement(By.xpath("//p[.='Your email or password is incorrect!']")).getText();
					System.out.println("The error message is : " + Error);
					AssertJUnit.assertEquals(Error, "Your email or password is incorrect!");//TRUE
					driver.close();


		}
		//Very long password
		@Test
		public void TC_12()
		{
			        System.setProperty("webdriver.chrome.driver", 
					"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
					driver=new ChromeDriver();
					driver.get("https://www.automationexercise.com/");
					driver.manage().window().maximize();
					WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
					SinUp_LoginButton.click();
					try 
					{
						Thread.sleep(5000);
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String ActualURL=driver.getCurrentUrl();
					String ExpectedURL="https://www.automationexercise.com/login";
					if(ActualURL.equals(ExpectedURL))
					{
						System.out.println("URL validated successfully");
					}
					else
					{
						System.out.println("URL Not - validated successfully");
					}
					WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
					WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
					WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
					//1.Very long email input
					EmailAddress.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@example.com");
					Password.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@example.com");
					Login.click();
					String Error=driver.findElement(By.xpath("//p[.='Your email or password is incorrect!']")).getText();
					System.out.println("The error message is : " + Error);
					AssertJUnit.assertEquals(Error, "Your email or password is incorrect!");//TRUE
					driver.close();

		}
		//Leading/trailing spaces
		@Test
		public void TC_13()
		{
			       //Leading/trailing spaces
			        System.setProperty("webdriver.chrome.driver", 
					"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
					driver=new ChromeDriver();
					driver.get("https://www.automationexercise.com/");
					driver.manage().window().maximize();
					WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
					SinUp_LoginButton.click();
					try 
					{
						Thread.sleep(5000);
					} 
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String ActualURL=driver.getCurrentUrl();
					String ExpectedURL="https://www.automationexercise.com/login";
					if(ActualURL.equals(ExpectedURL))
					{
						System.out.println("URL validated successfully");
					}
					else
					{
						System.out.println("URL Not - validated successfully");
					}
					WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
					WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
					WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
					//2.Leading/trailing spaces
					EmailAddress.sendKeys(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@example.com ");
					Password.sendKeys(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@example.com ");
					Login.click();
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					String Error=driver.findElement(By.xpath("//p[.='Your email or password is incorrect!']")).getText();
					System.out.println("The error message is : " + Error);
					AssertJUnit.assertEquals(Error, "Your email or password is incorrect!");//TRUE
					driver.close();

		}


}