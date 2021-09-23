package pages
import geb.Page
import modules.Login
import org.openqa.selenium.By

class LandingPage extends Page{

    static at = {
        waitFor { title == "Portal DEV Live" }
        assert driver.getCurrentUrl() == "https://portal-dev.my-portal.io/site/register/?user=demo&password=portal"
        $(".login-logout-navigation .flex-auto").click()
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