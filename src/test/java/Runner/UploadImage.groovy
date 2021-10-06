package Runner

import geb.module.TextInput
import geb.spock.GebReportingSpec
import org.openqa.selenium.Keys
import org.testng.annotations.AfterClass
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import pages.LandingPage
import pages.LoginPage

class UploadImage extends GebReportingSpec{
    @Test(priority = 0)
    def "Login Setup"() {
        given:
        to LoginPage
        Loginbuttonclick.click()
        and:
        System.out.println("in login page")
        waitFor(10) {
            withWindow({ $(".header__title").text() == "Log In" })
                    {
                        System.out.println("inside window page")
                        logincredentials.loginwindow()
                        logincredentials.demowindow()
                        Thread.sleep(4000)

                    }
        }
    }
    @Test(priority = 1)

    def "Upload image in wallpost"()
    {
        given: "user is on Landing page"
        to LandingPage
        System.out.println("in landing page")
        videodisplay.click()
        and: "user saves image in file"
        File uploadedFile= new File("src/main/resources/sebastian-knoll-sdqNXWlvkDY-unsplash.jpg")
        println(uploadedFile.absolutePath)
        //close setup window
        expect: "user uploads the image"
        waitFor {$(".input--textarea")}
        $("input[type=file][name='wallPostImageUpload']")<<"C:\\Users\\Narjis Fathima\\IdeaProjects\\PortalGeb\\src\\main\\resources\\sebastian-knoll-sdqNXWlvkDY-unsplash.jpg"
        Thread.sleep(3000)
        //$("input[type=file][name='wallPostImageUpload']")<< Keys.chord(Keys.CONTROL, "c")

    }
}