import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebsitesLaunch {
    @Test
    public void herokuapp_Login() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("tomsmith");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        WebElement loginBtn = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginBtn.click();
        WebElement singout = driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']"));
        singout.click();
        System.out.println("********** herokuapp_Login() *************");
        driver.quit();

    }

    @Test
    public void herokuapp_emptyName() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        System.out.println("********** herokuapp_emptyName() *************");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // System.out.println(username.getText() + password.getText());

        WebElement loginBtn = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginBtn.click();
        //driver.findElement(By.xpath("//div[@id='flash']")).click();
        driver.quit();

    }

    @Test
    public void herokuapp_digitalName() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("555");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        System.out.println("********** herokuapp_digitalName() **********");

        WebElement loginBtn = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginBtn.click();
        driver.quit();

    }

    @Test
    public void herokuapp_specialName() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("$$$$");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");
        System.out.println("************** herokuapp_specialName()************");

        WebElement loginBtn = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginBtn.click();
        driver.quit();

    }

    @Test
    public void herokuapp_wrongPassword() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword");
        System.out.println("************** herokuapp_wrongPassword()***************");

        WebElement loginBtn = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginBtn.click();
        driver.quit();

    }

    @Test
    public void herokuapp_digitalPassword() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword1");
        System.out.println("************** herokuapp_digitalPassword()***************");

        WebElement loginBtn = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginBtn.click();

        driver.quit();

    }

    @Test
    public void herokuapp_emptyPassword() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("");
        System.out.println("************** herokuapp_emptyPassword()***************");


        WebElement loginBtn = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginBtn.click();
        driver.quit();

    }

    @Test
    public void herokuapp_specialPassword() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword$");
        System.out.println("************** herokuapp_wrongPassword()***************");


        WebElement loginBtn = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
        loginBtn.click();
        driver.quit();

    }
}

