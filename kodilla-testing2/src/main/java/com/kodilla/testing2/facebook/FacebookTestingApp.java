package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAYCOMBO = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[1]";
    public static final String XPATH_MONTHCOMBO = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[2]";
    public static final String XPATH_YAERCOMBO = "//div[contains(@class, \"_58mq _5dbb\")]/div/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement dayOfDate = driver.findElement(By.xpath(XPATH_DAYCOMBO));
        Select selectDay = new Select(dayOfDate);
        selectDay.selectByIndex(19);

        WebElement monthOfDate = driver.findElement(By.xpath(XPATH_MONTHCOMBO));
        Select selectOfMonth = new Select(monthOfDate);
        selectOfMonth.selectByIndex(5);

        WebElement yearOfDate = driver.findElement(By.xpath(XPATH_YAERCOMBO));
        Select selectOfYear = new Select(yearOfDate);
        selectOfYear.selectByIndex(35);
    }
}
