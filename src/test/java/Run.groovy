import geb.spock.GebReportingSpec
import org.openqa.selenium.Keys
import org.testng.annotations.Test
import pages.LandingPage
import pages.LoginPage

class Run extends GebReportingSpec{
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
       // go "https://www.google.com"
        //currentUrl.contains("google")


           // assert currentUrl =="https://www.google.com/"


        and:
        to(LoginPage)
       //to LoginPage
        myna()
        at LoginPage

    }

}