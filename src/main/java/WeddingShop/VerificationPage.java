package WeddingShop;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import java.util.ArrayList;
import java.util.List;

public class VerificationPage extends Utils {

    public void userCanSeeAllCandlesBetweenSelectedPriceRange(int min, int max){


        ArrayList<Float> priceList = new ArrayList<Float> ();
        List<WebElement> Activelist = driver.findElements(By.className("product__price"));
        for (WebElement element : Activelist) {

            String str = element.getText();
            str = str.replaceAll("[^\\d.]", "");
            priceList.add(Float.valueOf(str));


           if(min >=20 && max <=39){
               //System.out.println(priceList);
           }
           //System.out.println(priceList);

        }               System.out.println(priceList);

    }
}

