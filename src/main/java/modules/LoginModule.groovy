package modules

import geb.Module

class Login extends Module{
    static content ={

Loginbutton{$(".login-logout-navigation .flex-auto")}

        email{$("#login-email")}

        password{$("#login-password")}
        submit{$("button.btn")}
        //submit.click()

        // $("#show-user").value("demo")
        //$("#show-password").value("portal")
        //Thread.sleep(4000)
    }
     void input()
    {
        Thread.sleep(4000)
        //Loginbutton.click()
        email.value("cmptest4@nf.cmp-df.net")
        password.value("Najju@2017")
        submit.click()
    }
}