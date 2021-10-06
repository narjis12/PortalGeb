package pages

import geb.Page
import modules.Login
import org.openqa.selenium.By


class LoginPage extends Page{
    static at ={
        waitFor { title == "Portal DEV Live" }
        driver.manage().window().maximize()
        waitFor {  $(".login-logout-navigation .flex-auto")}

    }
    static content ={
        Loginbuttonclick{$(".login-logout-navigation .flex-auto")}
        logincredentials{module(Login)}
        //asaa{$(By.id(""))}

    }

}
