package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DealsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DealsPage.class.getName());

    public DealsPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='dealerListing--name']//a")
    List<WebElement> dealername;

    public String gettext(String text) {
        for (WebElement data : dealername) {
            String str = data.getText();
            if (str.equalsIgnoreCase(text)) {
                return str;
            }
        }
        return null;
    }
    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement nextbutton;

    public void clickonnext(){
        clickOnElement(nextbutton);
    }
}
