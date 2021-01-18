package crowdstreet.stepdefinition_ui;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class HomePage extends PageObject {

	@Step
	public void openApplication() {
		open();
		
	}
}