package Runner
import geb.spock.GebReportingSpec
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import pages.FeedPage
import pages.LandingPage
import pages.LoginPage

class wallcount extends GebReportingSpec{
    @BeforeTest
    def "Login Setup"() {
        given:
        to LoginPage
        and:
        System.out.println("in login page")
        waitFor(10) {
            withWindow({ $(".header__title").text() == "Log In" })
                    {
                        System.out.println("inside window page")
                        logincredentials.loginwindow()
                        Thread.sleep(2000)
                        logincredentials.demowindow()
                    }
        }
    }



    @Test

    def "counting"()
    {


        given:
        to LandingPage
        and:
        to FeedPage
        value()
    }
}
