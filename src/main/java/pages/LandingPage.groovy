package pages
import geb.Page
import modules.Login
import pages.FeedPage
import org.openqa.selenium.By
import modules.CreateWallpostModule

class LandingPage extends Page{

    static at = {
        waitFor {$(".button .flex > .feather-x")}
        $(".button .flex > .feather-x").click()
       // waitFor { title == "Portal DEV Live" }
        //assert driver.getCurrentUrl() == "https://portal-dev.my-portal.io/site/register/?user=demo&password=portal"
       // driver.manage().window().maximize()
        //$(".login-logout-navigation .flex-auto").click()
        //you can write id, name of the frame
        // withFrame($("")){testya{$("")}}

    }

    static content = {
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