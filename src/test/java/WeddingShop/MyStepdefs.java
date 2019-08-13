package WeddingShop;

import WeddingShop.ShopCandles;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    ShopCandles shopCandles = new ShopCandles();
    VerificationPage verificationPage = new VerificationPage();


    @Given("I want candles in the £{int}-£{int} price range")
    public void iWantCandlesInThe££PriceRange(int arg0, int arg1) {
     System.out.println("gone");

    }
    @When("I search for “candles” and filter by price")
    public void i_search_for_candles_and_filter_by_price() {
        shopCandles.userAbleToSearchProduct();

    }


    @Then("I should see some candles priced between £{int}-£{int}")
    public void iShouldSeeSomeCandlesPricedBetween££(int min, int max) {
        verificationPage.userCanSeeAllCandlesBetweenSelectedPriceRange(min,max);
    }
}

