package crowdstreet.stepdefinition_ui;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacadeWait;
import net.thucydides.core.annotations.Step;

public class UserRegistrationPage extends PageObject {

	@Step
	public void clickRegisterPage() {

		WebElementFacade registerbtn = $(
				By.xpath(("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/a[2]")));
		registerbtn.waitUntilClickable();
		registerbtn.waitUntilVisible();
		registerbtn.click();

	}

	@Step
	public void userInfo() throws InterruptedException {
		$(By.id("create_account_email")).typeAndTab("Samnewtester@test.com");
		$(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/input[1]")).typeAndTab("Sam");
		$(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/input[1]")).typeAndTab("NewTester");
		$(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/input[1]")).typeAndTab("Test@123");
		$(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[3]/div[1]/input[1]")).typeAndTab("Test@123");
		$(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/input[1]")).type("1234567879");
		$(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[9]/div[1]/input[1]")).typeAndTab("123 Alaska road");
		$(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[10]/div[1]/input[1]")).typeAndTab("lakes");
		
		
	
		$(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[11]/div[2]/div[1]/input[1]")).type("99824");
		WebElementFacade radioBtn=$(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/label[2]/div[1]"));
		radioBtn.click();
	}

	@Step
	public void registerBtn() {

		$(By.xpath("//button[contains(text(),'Sign Up')]")).click();

	}

	@Step
	public void termsAndConditions() {
		WebElementFacade terms1=$(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/label[1]/div[1]"));
		terms1.waitUntilClickable();
		terms1.click();
		WebElementFacade terms2=$(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/label[1]/div[1]"));
		terms2.waitUntilClickable();
		terms2.click();
	}

	@Step
	public void verifyLoggedUser()  {
	WebElementFacade userNameText=$(By.xpath("//body/div[2]/div[1]/div[2]/section[1]/div[2]/div[1]/h2[1]"));
	userNameText.waitUntilEnabled();
	String usernName=userNameText.getText();
	String actualText="Congrats, Sam";
	Assert.assertEquals(usernName, actualText);
	}
	@Step
	public void dropdown(String stateName){
		
		List<WebElementFacade> stateElements = $$(By.xpath("//form[@class='ui form']/child::div[11]/div[1]/div[1]/div/div/div"));
		System.out.println(stateElements.size());
		for(int i = 0; i < stateElements.size(); i++) {
			
			if(($(By.xpath("(//form[@class='ui form']/child::div[11]/div[1]/div[1]/div/div/div)["+(i+1)+"]")).getText().equalsIgnoreCase(stateName))) {
				$(By.xpath("(//form[@class='ui form']/child::div[11]/div[1]/div[1]/div/div/div)["+(i+1)+"]")).click();
				break;
			}
		}
	}
	
}
