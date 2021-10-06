package pages
import geb.Page
import modules.Login
import pages.FeedPage
import org.openqa.selenium.By
import modules.CreateWallpostModule

class LandingPage extends Page{

    static at = {

       // waitFor { title == "Portal DEV Live" }
        //assert driver.getCurrentUrl() == "https://portal-dev.my-portal.io/site/register/?user=demo&password=portal"
       // driver.manage().window().maximize()
        //$(".login-logout-navigation .flex-auto").click()
        //you can write id, name of the frame
        // withFrame($("")){testya{$("")}}
        //if we do not want to verify the at in a page, you can access it in below way
        //page(NoInstane)
        //at(NoInstane, {assert title})

        //clicks the element & then verifies that the user is at LoginPage
        //$("").click(LoginPage)

    }

    static content = {
        videodisplay{$(".button .flex > .feather-x")}
        pass1 { $("#login-password")}
        //Password(wait:true){pass1.find("")}
        // password{$("#login-password")}
        // submit{$("button.btn")}
        manualsMenu { module(Login) }

    }
    void send()
    {
        pass1.value("Najju@2017")

    }

}