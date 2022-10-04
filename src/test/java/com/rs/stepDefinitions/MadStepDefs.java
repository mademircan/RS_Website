package com.rs.stepDefinitions;

import com.rs.pages.MadPage;
import com.rs.utilities.BrowserUtils;
import com.rs.utilities.ConfigurationReader;
import com.rs.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MadStepDefs {

    MadPage madPage = new MadPage();

    @Given("User is on homepage")
    public void user_is_on_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        madPage.cookiesAcceptButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    @When("User enters {string} on search box")
    public void user_enters_on_search_box(String string) {
        madPage.searchBar.sendKeys(string);
    }

    @When("User clicks search icon")
    public void user_clicks_search_icon() {
        madPage.searchSubmitButton.click();
    }

    @When("User clicks on {string} category")
    public void user_clicks_on_category(String productCategory) {
        madPage.searchResultCategory(productCategory);



    }

    @When("User selects {string} filter category and clicks {string} filter")
    public void userSelectsFilterCategoryAndClicksFilter(String filterCategory, String filter) {
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        madPage.filterSelection(filterCategory, filter);

    }

    @And("User clicks {string} button")
    public void userClicksButton(String buttonText) {
        madPage.buttonSelect(buttonText);


    }

    @When("User selects {string} product from result list")
    public void userSelectsProductFromResultList(String productName) {

        madPage.selectProduct(productName);

    }

    @And("User sees and clicks on {string} button")
    public void userSeesAndClicksOnButton(String buttonText) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button/span[.='"+buttonText+"']")));
        madPage.buttonSelect(buttonText);

    }

    @When("User clicks on No thanks button")
    public void userClicksOnNoThanksButton() {
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        madPage.popUp.click();
    }
}
