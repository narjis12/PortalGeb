package Runner
import geb.spock.GebReportingSpec
import org.junit.BeforeClass
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import pages.LandingPage
import pages.LoginPage

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

class Run extends GebReportingSpec{

   @BeforeClass

    void cleandir()
    {
        cleanReportGroupDir()
        println("askasaks")
    }
    @Test
//this is spoc integration we are using
    def "On landingpage"()
    {
        given:
        to LandingPage

        waitFor {withWindow({$(".header__title").text()=="Log In"})
                {
                    //manualsMenu.input()
                    manualsMenu.email.value("cmptest4@nf.cmp-df.net")
                    send()
                    manualsMenu.submit.click()
                    //pass1.value("cmppp")

                    //go "https://www.google.com"
                        $("#show-user").value("demo")
                    $("#show-password").value("portal")<<Keys.ENTER
                    Thread.sleep(4000)

                }}

        waitFor {$(".button .flex > .feather-x")}
        File uploadedFile= new File("src/main/resources/sebastian-knoll-sdqNXWlvkDY-unsplash.jpg")
        println(uploadedFile.absolutePath)
        $(".button .flex > .feather-x").click()
        waitFor {$(".input--textarea")}
$("input[type=file][name='wallPostImageUpload']")<<"C:\\Users\\Narjis Fathima\\IdeaProjects\\PortalGeb\\src\\main\\resources\\sebastian-knoll-sdqNXWlvkDY-unsplash.jpg"

        Thread.sleep(3000)

        JavascriptExecutor js = (JavascriptExecutor)driver
        js.executeScript("window.scrollBy(0,1000)")
        Thread.sleep(3000)
        // pass additonal arguments in the url
        //to LandingPage, "0.93", "index.html"
        //assert currentUrl= "Lanidngpageurl/0.93/index.html"

        /*
        WebElement fileElement=driver.findElement(By.xpath("//*[@id='imageControl']"));
        fileElement .click();
        String file = new File("C:\\Users\\Narjis Fathima\\IdeaProjects\\PortalGeb\\src\\main\\resources\\sebastian-knoll-sdqNXWlvkDY-unsplash.jpg").getAbsolutePath();
        StringSelection ss = new StringSelection(file);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        */

       // go "https://www.google.com"
        //currentUrl.contains("google")

           // assert currentUrl =="https://www.google.com/"
       // and:
       // to(LoginPage)
       //to LoginPage
        //myna()
        //at LoginPage
        //report("hallo")

    }

}