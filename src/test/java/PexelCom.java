import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PexelCom {
    @Test
            public void pixelLuanch(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.pexels.com/");
        WebElement searching = driver.findElement(By.id("search"));searching.sendKeys("nature");
        driver.findElement(By.xpath("//button[@class='SearchInput_button__dQPLk']//*[name()='svg']")).click();
        System.out.println("tab is  " + searching.getText());

    }
    @Test
    public void clickOnTabs(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.pexels.com/");
        //driver.findElement(By.xpath("//div[@class='Navbar_right__EAgLc']")).click();
        //driver.findElement(By.xpath("Navbar_logo__GbI9v Link_link__mTUkz clickable_clickable__Klxi1 spacing_noMargin__Q_PsJ")).click();

        driver.findElement(By.xpath("//button[@class='Button_button__L4pRn spacing_noMargin__Q_PsJ spacing_margin-left-4__1nmza spacing_padding-right-20__Q3ufi spacing_padding-left-20__GcW24 DisplayNone_mobile-tablet__6iQd1 Navbar_hamIcon__Pp3MY Navbar_transparentButton__IWQoz Button_iconSolo__OLMF8 Button_noBorder__r8_Es Button_clickable__WBdod Button_white__snM9f Button_colorOverrideWhite__AwtmI']//span//*[name()='svg']")).click();
       /* driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).click();*/


    }



}
