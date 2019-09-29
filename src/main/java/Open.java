import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Open {
//    public void openUrl (String url){
//        try {
//            Desktop d=Desktop.getDesktop();
//
//            d.browse(new URI(url));
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        } catch (URISyntaxException use) {
//            use.printStackTrace();
//        }
//    }

    public void testSelentium(String url2) throws InterruptedException {
        Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF);
        System.setProperty("webdriver.chrome.driver","/Users/max/Desktop/Wrike/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url2);

        Thread.sleep(5000);
        driver.findElement(By.className("wg-header__free-trial-button.wg-btn.wg-btn--green")).click(); // Я день эксперементировал с этой строчкой, ну не работает.....

        Alert alert = driver.switchTo().alert();

        GenerateWord generateWord = new GenerateWord();
        StringBuilder a = generateWord.getString();
        alert.sendKeys( a + "wpt@wriketask.qaa");

        driver.findElement(By.className("wg-btn wg-btn--blue.modal-form-trial__submit")).click();

        List<WebElement> button = driver.findElements(By.cssSelector("radio"));
        button.get(new Random().nextInt(button.size())).click();

        List<WebElement> button2 = driver.findElements(By.cssSelector("radio"));
        button2.get(new Random().nextInt(button2.size())).click();

        List<WebElement> button3 = driver.findElements(By.cssSelector("radio"));
        button3.get(new Random().nextInt(button3.size())).click();

        driver.findElement(By.className("submit wg-btn wg-btn--navy js-survey-submit")).click();

        Boolean isPresent = driver.findElements(By.className("Twitter")).size() > 0;
        if(isPresent = true){
            driver.findElement(By.className("Twitter")).click();
        }
        else {
            System.out.println("Кнопки нет");
        }

    }
}
