package Runner

import geb.spock.GebReportingSpec
import org.testng.annotations.Test
import pages.LoginPage

class accessvariables extends GebReportingSpec{

    @Test
    def "access variable from config"()
    {
        given:
        System.out.println("in class")
        to LoginPage


        //if we do not want to verify the at in a page, you can access it in below way
        //page(NoInstane)
        //at(NoInstane, {assert title})
        name()
        //clicks the element & then verifies that the user is at LoginPage
        //$("").click(LoginPage)


    }
}
