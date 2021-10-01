package pages

import geb.Page
import modules.Login
import org.openqa.selenium.By


class LoginPage extends Page{
    static at ={
        waitFor { title == "Portal DEV Live" }
        driver.manage().window().maximize()
        $(".login-logout-navigation .flex-auto").click()
    }
    static content ={
        logincredentials{module(Login)}
        //asaa{$(By.id(""))}

    }

}
