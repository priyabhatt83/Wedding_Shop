package WeddingShop;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ShopCandles extends Utils {

  // private By _product = By.xpath("//nav[@id='navFloat']");
   private By _searchBox = By.xpath("//span[@id='icon-nav-search']");
   private By _ProductName = By.xpath("//input[@id='search-query']");
   private By _candles = By.xpath("//b[contains(text(),'Candles')]");
   private By _sortPrice = By.xpath("//label[contains(text(),'£20 - £39')]");

public void userAbleToSearchProduct(){

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //click on search button
    clickElementBy(_searchBox);

    //type candles and enter
    enterText(_ProductName,"candles");
    clickElementBy(_ProductName);

    //select category candles and diffusers
    clickElementBy(_candles);

    //select price range from £20-£39
    clickElementBy(_sortPrice);


    //add all price to array list
    //if (20>=,<=39)
}}
