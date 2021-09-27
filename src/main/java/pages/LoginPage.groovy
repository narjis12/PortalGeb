package pages

import geb.Page
import modules.Login


class LoginPage extends Page{
    static at ={
        waitFor { title == "Portal DEV Live" }
        driver.manage().window().maximize()
        $(".login-logout-navigation .flex-auto").click()
    }


    static content ={
        logincredentials{module(Login)}

    }





}
