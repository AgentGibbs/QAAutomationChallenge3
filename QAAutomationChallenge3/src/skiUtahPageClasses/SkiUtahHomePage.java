package skiUtahPageClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import supportUtils.WebDriverHelper;

public class SkiUtahHomePage extends SkiUtahWebPage {
//member variables
	private WebDriver browserDriver;

	public List<WebElement> mainMenuWebElements;
	public List<WebElement> subMenuWebElements;
	

	private WebDriverHelper helper;
	private ArrayList<String> currentSubMenus;
	
	
	
//constructors
	
	public SkiUtahHomePage(WebDriver driver) {
		setPageURL("https://www.skiutah.com/");
		this.browserDriver = driver;
		browserDriver.navigate().to(getPageURL());
		currentSubMenus = new ArrayList();
		this.helper = new WebDriverHelper();
		helper.setBrowserDriver(driver);
		
	}
	
	
//member methods
	/** 
	 * 
	 */
	private void findMenuItems() {
		
		mainMenuWebElements = browserDriver.findElements(By.className("SuperfishMegaMenu-topLink"));
		subMenuWebElements = browserDriver.findElements(By.className("SuperfishMegaMenu-subLink"));
		
	}
	
	public void hoverOnMainMenuItem(int index) {
		findMenuItems();
		WebElement mainMenuItem = mainMenuWebElements.get(index);
		helper.mouseHover(mainMenuItem, 1000);	

		for(int i = 0; i< subMenuWebElements.size(); i++)
		{
			WebElement visibleSubMenuItem = subMenuWebElements.get(i);
			helper.mouseHover(mainMenuItem, 1000);
			
			if(visibleSubMenuItem.isDisplayed()==true && visibleSubMenuItem.getAttribute("class")!= "SuperfishMegaMenu-subLink SuperfishMegaMenu-subLink--columnHead")
			{
				helper.mouseHover(visibleSubMenuItem, 500);
				System.out.println(visibleSubMenuItem.getText());
				//clickLink(visibleMenuItem);
				//It keeps trying to click on one of the column headers, which causes ajor problems. I don't know how to exclude those from the list of menu items that need to be clicked on.

			}

		}
		clickLink(mainMenuItem);
	}

	@Override
	public void clickLink(WebElement linkedElement) {
		if(linkedElement.isDisplayed())
		{
			linkedElement.click();
		}
			String url = browserDriver.getCurrentUrl();
			String homeURL = getPageURL();
			if(homeURL != url)
			{
				browserDriver.get(homeURL);				
			}
				

	}


}
