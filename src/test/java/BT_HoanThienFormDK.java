import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BT_HoanThienFormDK {
    //Khởi tạo browser với Chrome
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Mở trang https://demoqa.com/text-box
        driver.get("https://demoqa.com/automation-practice-form");

//Nhập input
        String InputData = "//input[@id='%s']";
        String Xpath1 = String.format(InputData , "firstName");
        String Xpath2 = String.format(InputData , "lastName");
        String Xpath3 = String.format(InputData , "userEmail");
        String Xpath4= String.format(InputData , "userNumber");
        String Xpath5= String.format(InputData , "dateOfBirthInput");
        String Xpath6= String.format(InputData , "subjectsInput");
        String Xpath7= String.format(InputData , "react-select-3-input");
        String Xpath8= String.format(InputData , "react-select-4-input");

        driver.findElement(By.xpath(Xpath1)).click();
        driver.findElement(By.xpath(Xpath1)).sendKeys("Duy");

        driver.findElement(By.xpath(Xpath2)).click();
        driver.findElement(By.xpath(Xpath2)).sendKeys("Dinh Dang");

        driver.findElement(By.xpath(Xpath3)).click();
        driver.findElement(By.xpath(Xpath3)).sendKeys("DinhDuy@gmail.com");

        driver.findElement(By.xpath(Xpath4)).click();
        driver.findElement(By.xpath(Xpath4)).sendKeys("09658991515");

        driver.findElement(By.xpath(Xpath5)).click();
        driver.findElement(By.xpath(Xpath5)).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.xpath(Xpath5)).sendKeys("20 Nov 2001");
        driver.findElement(By.xpath(Xpath5)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(Xpath6)).sendKeys(Keys.CONTROL,"a");
        driver.findElement(By.xpath(Xpath6)).sendKeys("Chemistry");
        driver.findElement(By.xpath(Xpath6)).sendKeys(Keys.ENTER);


        driver.findElement(By.xpath(Xpath7)).sendKeys("NCR");
        driver.findElement(By.xpath(Xpath7)).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(Xpath8)).sendKeys("Noida");
        driver.findElement(By.xpath(Xpath8)).sendKeys(Keys.ENTER);

//Nhập input Current Address
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).click();
        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Da Nang");
//Chọn option
        String ChooseOption  = "//label[@for='%s']";
        String Gender_Male = String.format(ChooseOption , "gender-radio-1");
        String Sport = String.format(ChooseOption , "hobbies-checkbox-1");

        driver.findElement(By.xpath(Gender_Male)).click();
        driver.findElement(By.xpath(Sport)).click();

//CHọn ảnh
        driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\NITRO 5\\Desktop\\ĐỒ ÁN TỐT NGHIỆP\\Ảnh\\OIP.jpg");
//        driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys(System.getProperty("user.dir") + "\\src\\test\\Resources\\TestDataField\\OIP.jpg");

//Submid
        driver.findElement(By.xpath("//form[@id='userForm']")).submit();

    }
}
