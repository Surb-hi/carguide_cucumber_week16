package com.carsguide.steps;

import com.carsguide.pages.Carsguide;
import com.carsguide.pages.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SerachCar {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new Homepage().ClickOnbuysell();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new Homepage().ClickOnSerchCar();
    }


    @Then("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String text) {
        Assert.assertEquals("",text,new Carsguide().VerifyNewUsedCarSearch());
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String maketext) throws InterruptedException {
        Thread.sleep(2000);
        new Carsguide().selectAnyMake(maketext);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String modelText)  {
        new Carsguide().selectmodels(modelText);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String locationtext){
        new Carsguide().selectLocations(locationtext);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String pricetext){
        new Carsguide().selectPrice(pricetext);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new Carsguide().ClickOnFindMyCart();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String text2){
        Assert.assertTrue("",new Carsguide().VerifyMakesMessage().contains(text2));
    }


    @And("^I click Used link$")
    public void iClickUsedLink() {
    new Homepage().ClickOnUsed();
    }
}




