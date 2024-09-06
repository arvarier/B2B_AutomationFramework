package WebApp.GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class WebActionUtils {

    public void maximize(WebDriver driver)
    {
        driver.manage().window().maximize();
    }

    public void minimize(WebDriver driver)
    {
        driver.manage().window().minimize();
    }

    public void implicitWait(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void explicitWaitForVisibilityOfElement(WebDriver driver, WebElement element, int time)
    {
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void explicitWaitFor(WebDriver driver,WebElement element,int time)
    {
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void selectDropdownElementWithIndex(WebElement element,int index)
    {
        Select s=new Select(element);
        s.selectByIndex(index);
    }

    public void selectDropdownElementWithVisibleText(WebElement element,String text)
    {
        Select s=new Select(element);
        s.selectByVisibleText(text);
    }

    public void selectDropdownElementWithGetOptions(WebElement element)
    {
        Select s=new Select(element);
        List<WebElement> options = s.getOptions();
        for(WebElement option : options)
        {
            String text = option.getText();
            System.out.println(text);
        }
    }

    public void mouseHoverAction(WebDriver driver, WebElement element)
    {
        Actions a=new Actions(driver);
        a.moveToElement(element).perform();
    }

    public void mouseActionDoubleClick(WebDriver driver,WebElement element)
    {
        Actions a=new Actions(driver);
        a.doubleClick(element).perform();
    }

    public void mouseActionRightClick(WebDriver driver,WebElement element)
    {
        Actions a=new Actions(driver);
        a.contextClick(element).perform();
    }




}
