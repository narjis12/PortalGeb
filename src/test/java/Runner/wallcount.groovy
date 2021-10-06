package Runner
import geb.spock.GebReportingSpec
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import pages.LoginPage
import pages.LandingPage
import pages.FeedPage

class wallcount extends GebReportingSpec{
    @Test
    def "Login Setup"() {
        given:
        to LoginPage
        Loginbuttonclick.click()
        and:
        System.out.println("in login page")
        waitFor(5) {
            withWindow({ $(".header__title").text() == "Log In" })
                    {
                        System.out.println("inside window page")
                        logincredentials.loginwindow()
                        logincredentials.demowindow()
                        Thread.sleep(4000)
                    }
        }
    }
    @Test
    def "counting"()
    {
        given:
        to LandingPage
        videodisplay.click()
        and:
        page(FeedPage)
        int beforecount = createWallpost.createwallpost()
        createWallpost.submitWallpost(beforecount)
        //assert if the attribute is focused or not
        //assert focused().attr("name") == "description"
    }
}