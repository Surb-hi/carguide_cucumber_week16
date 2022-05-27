package com.carsguide.steps;

import com.carsguide.pages.DealsPage;
import com.carsguide.pages.Homepage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class Cardealer {

    @And("^I click 'Find a Dealer' link$")
    public void iClickFindADealerLink() {
new Homepage().clickonFindADealer();
    }

    @Then("^I see the dealer lists$")
    public void iSeeTheDealerLists(DataTable dataTable) {
        List<String>list=dataTable.asList(String.class);
        for (String data:list){
            while (new DealsPage().gettext(data)==null){
                new  DealsPage().clickonnext();
            }
            Assert.assertEquals("dealer name is not found",data,new DealsPage().gettext(data));
        }
    }
}
