import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

class CallbackPozitiveTest {
    private WebDriver driver;
    @BeforeAll
    static void setUpAll() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
    }
    @BeforeEach
    void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
    }
    @AfterEach
    void tearDown() {
        driver.quit();
        driver = null;
    }

    // позитивные сценарии
    @Test
    void test1() {
        driver.get("http://localhost:7777/");
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Маша");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+79995554466");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button_theme_alfa-on-white")).click();
        String expected = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test2() {
        driver.get("http://localhost:7777/");
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Маша ела кашу");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+83336662255");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button_theme_alfa-on-white")).click();
        String expected = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test3() {
        driver.get("http://localhost:7777/");
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Маша-ела-кашу");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+53336662255");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button_theme_alfa-on-white")).click();
        String expected = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test4() {
        driver.get("http://localhost:7777/");
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Маша не ела-кашу");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+03336662255");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button_theme_alfa-on-white")).click();
        String expected = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test5() {
        driver.get("http://localhost:7777/");
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("МАША");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+73336662255");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button_theme_alfa-on-white")).click();
        String expected = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test6() {
        driver.get("http://localhost:7777/");
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("маша");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+00000000000");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button_theme_alfa-on-white")).click();
        String expected = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test7() {
        driver.get("http://localhost:7777/");
        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("маша-ела кашу");
        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+00000000000");
        driver.findElement(By.cssSelector("[data-test-id=agreement]")).click();
        driver.findElement(By.className("button_theme_alfa-on-white")).click();
        String expected = "  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.";
        String actual = driver.findElement(By.cssSelector("[data-test-id=order-success]")).getText();
        Assertions.assertEquals(expected, actual);
    }


}