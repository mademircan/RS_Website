package com.rs.pages;

import com.rs.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {PageFactory.initElements(Driver.getDriver(), this);}

    public void getLink (String link){

        Driver.getDriver().findElement(By.partialLinkText(link)).click();
    }












}
