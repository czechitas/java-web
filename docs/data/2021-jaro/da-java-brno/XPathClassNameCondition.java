package cz.czechitas.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XPathClassNameCondition {

    WebDriver prohlizec;

    @BeforeEach
    public void setUp() {
//      System.setProperty("webdriver.gecko.driver", System.getProperty("user.home") + "/Java-Training/Selenium/geckodriver");
        System.setProperty("webdriver.gecko.driver", "C:\\Java-Training\\Selenium\\geckodriver.exe");
        prohlizec = new FirefoxDriver();
        prohlizec.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @Test
    public void poStiskuPridejKockuMusiBytSpravnyPocetObrazkuKocek() {
        prohlizec.navigate().to("https://automation3.shinekamil.repl.co/adding.html");
        for (int i = 1; i <= 10; i++) {
            WebElement tlacitkoPridejKocku = prohlizec.findElement(By.id("addItem"));
            tlacitkoPridejKocku.click();
            List<WebElement> obdelnikyKocek = prohlizec.findElements(By.xpath("//div[" + className("cat") + "]"));
//            List<WebElement> obdelnikyKocek = prohlizec.findElements(By.xpath("//div[@class = 'card cat']"));
            WebElement spanPocetKocek = prohlizec.findElement(By.id("counter"));
            Assertions.assertEquals(i, obdelnikyKocek.size());
            Assertions.assertEquals(i, Integer.parseInt(spanPocetKocek.getText()));
        }
    }

    public static String className(String htmlClass) {
        return "contains(concat(' ', normalize-space(@class), ' '), ' " + htmlClass + " ')";
    }

}
