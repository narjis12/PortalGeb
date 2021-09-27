package modules
import geb.Module
import org.openqa.selenium.Keys

class Login extends Module{
    static content ={
        Loginbutton{$(".login-logout-navigation .flex-auto")}
        email{$("#login-email")}
        password{$("#login-password")}
        submit{$("button.btn")}
        demo{$("#show-user")}
        pwd{$("#show-password")}

    }
     void loginwindow()
    {
        //Loginbutton.click()
        email.value("cmptest4@nf.cmp-df.net")
        password.value("Najju@2017")
        submit.click()
    }

    void demowindow()
    {
        demo.value("demo")
        pwd.value("portal")<< Keys.ENTER
    }
}