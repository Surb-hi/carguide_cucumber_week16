package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public Homepage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buyandsell;

    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement serchcar;

    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement used;

    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement findadealer;

    public void clickonFindADealer(){
        clickOnElement(findadealer);
    }
    public void ClickOnbuysell(){
        mouseHoverToElement(buyandsell);
        log.info("mousehover on buy and sell "+ buyandsell.toString()+ "<br>");
    }

    public void ClickOnSerchCar(){
        clickOnElement(serchcar);
        log.info("Clicking on serch car"+ serchcar.toString()+ "<br>");
    }

    public void ClickOnUsed(){
        clickOnElement(used);
        log.info("Clicking on used"+ used.toString()+ "<br>");
    }

}
