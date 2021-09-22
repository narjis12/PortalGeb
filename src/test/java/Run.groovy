import geb.spock.GebReportingSpec
import org.openqa.selenium.Keys
import org.testng.annotations.Test
import pages.LandingPage

class Run extends GebReportingSpec{
//this is spoc integration we are using
    def "On landingpage"()
{
    given:
    to LandingPage



    waitFor {withWindow({$(".header__title").text()=="Log In"})
            {

                manualsMenu.email.value("cmp")
               pass1.value("cmppp")
                Thread.sleep(4000)
                //manualsMenu.input()
go "https://www.google.com"
               // $("#show-user").value("demo")
                //$("#show-password").value("portal")
                //Thread.sleep(4000)
            }}
    go "https://www.google.com"
    currentUrl.contains("google")
    assert currentUrl =="https://www.google.com/"
}

}
