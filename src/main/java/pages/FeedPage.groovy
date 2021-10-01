package pages
import geb.Page
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import modules.CreateWallpostModule
class FeedPage extends Page{

     void feedpage(WebDriver driver) throws IOException {
        this.driver = driver
    }
    By postarea = By.cssSelector(".input--textarea")
    static at ={
        title=="Portal DEV Live"
        waitFor {$(".input--textarea")}
    }
    static content ={
        wallcountsize {
            (driver.findElements(By.xpath("//div[@id='app']/div[1]/div[1]/section/div[2]/div/section/div/div/section/div/div[3]/div[1]/div")))
        }
        //halo{$(By.id(""))}
        createWallpost{module(CreateWallpostModule)}
    }

    void value()
    {
      //  int y =driver.findElements(By.xpath("//div[@id='app']/div[1]/div[1]/section/div[2]/div/section/div/div/section/div/div[3]/div[1]/div")).size()

        //System.out.println("totalcount"+ wallcountsize.size())
        //driver.findElement(postarea).sendKeys("hallo")
        //$(By.id(""))

    }
}
