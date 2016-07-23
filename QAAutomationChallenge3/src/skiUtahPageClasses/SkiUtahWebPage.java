package skiUtahPageClasses;

import java.util.List;

import org.json.simple.*;
import org.json.simple.parser.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SkiUtahWebPage {
	private String pageName;
	private String pageURL;
	private String pageTitle;
	private String expectedURL;
	private String expectedTitle;
	private String topMenuClassName;
	private String subMenuClassName;
	private WebDriver browserDriver;
	private String actualTitle;
	private String actualURL;
	public List<WebElement> mainMenuWebElements;
	public List<WebElement> subMenuWebElements;
	public List< JSONObject > mainMenuExpected;
	public List< JSONObject > subMenuExpected;

	public List<WebElement> pageElements;

	public String getExpectedURL() {
		return expectedURL;
	}

	public void setExpectedURL(String expectedURL) {
		this.expectedURL = expectedURL;
	}

	public String getPageTitle() {
		return pageTitle;
	}

	public void setPageTitle(String newTitle) {
		this.pageTitle = newTitle;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageURL() {
		return pageURL;
	}

	public void setPageURL(String pageURL) {
		this.pageURL = pageURL;
	}

	public void clickElement(WebElement clickableControl) {

	}

	public void clickLink(WebElement linkedElement) {
		linkedElement.click();
	}
}
