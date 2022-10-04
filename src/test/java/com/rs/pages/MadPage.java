package com.rs.pages;

import com.rs.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MadPage {

    public MadPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[contains(text(),'No, thanks')]")
    public WebElement popUp;

    @FindBy (xpath = "//button[@id='ensCloseBanner']")
    public WebElement cookiesAcceptButton;

    @FindBy(id="searchBarTextInput")
    public WebElement searchBar;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchSubmitButton;

    public void searchResultCategory(String productCategory ){

        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement productCategoryElement = Driver.getDriver().findElement(By.xpath("//div/div/a/content/span[.='"+productCategory+"']"));
        productCategoryElement.click();
    }

    public void filterSelection(String filterCategory, String filter){

        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement filterCategoryElement = Driver.getDriver().findElement(By.xpath("//span[.='"+filterCategory+"']"));
        filterCategoryElement.click();
        WebElement filterElement = Driver.getDriver().findElement(By.xpath("//div[@class='simplebar-content']/div/p[contains(text(), '"+filter+"')]"));
        filterElement.click();
    }

    public void buttonSelect (String buttonText){

        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement buttonElement = Driver.getDriver().findElement(By.xpath("//button/span[.='"+buttonText+"']"));
        buttonElement.click();

    }

    public void selectProduct (String productName){

        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement productElement = Driver.getDriver().findElement(By.xpath("//div[contains(text(), '"+productName+"')]"));
        productElement.click();

    }





}
