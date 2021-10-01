package Runner

import geb.spock.GebReportingSpec
import org.apache.tools.ant.taskdefs.Local
import org.testng.annotations.Test
import pages.LandingPage
import pages.LoginPage
import pages.NoInstane

class accessvariables extends GebReportingSpec{

    @Test
    def "access variable from config"()
    {
        given:
        System.out.println("in class")
        to LoginPage
        //if we do not want to verify the at in a page, you can access it in below way
        //page(NoInstane)


        at(NoInstane, {assert title})
        name()

    }
}
