package SeleniumRunner;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Console;
import skiUtahPageClasses.SkiUtahHomePage;
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.json.*;
import javax.json.stream.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class SeleniumLauncher {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Christian Gibbs\\Java Libraries\\selenium-2.53.0\\chromedriver.exe");

		WebDriver chromey = new ChromeDriver();
		chromey.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		SkiUtahHomePage page = new SkiUtahHomePage(chromey);
	
			
				
				for(int i = 0; i<=5; i++)
				{

					page.hoverOnMainMenuItem(i);
				}
	}
	
	
	
	
	
	private static String[] BuildMenu1()
	{
		ArrayList<String> S = new ArrayList();
		S.add("Activities");
		S.add("Food + Drink");
		S.add("Lodging");
		S.add("Retail + Rental");
		S.add("Reservation Experts");
		S.add("Ski Resorts");
		S.add("Ski School");
		S.add("Transportation");
		S.add("Utah Events");
		S.add("Photos");
		S.add("Videos");
		S.add("Stories");
		S.add("Compare Resorts");
		
		String[] submenus = (String[]) S.toArray();
		return submenus;

	}
}

	
	
