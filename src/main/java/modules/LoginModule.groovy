package modules
import geb.Module
import org.openqa.selenium.Keys
class Login extends Module{
    static content ={
        Loginbutton{$(".login-logout-navigation .flex-auto")}
        email{$("#login-email")}
        password{$("#login-password")}
        submit{$("button.btn")}
        demo{$("input#show-user.form-control")}
        pwd{$("input#show-password.form-control")}
        //def checkbox = $(name: "flag")
       // checkbox[0].click()

    }
     void loginwindow()
    {
        //Loginbutton.click()
        email.value("cmptest4@nf.cmp-df.net")
        password.value("Najju@2017")
        submit.click()
        //checkbox.check()
    }
    void demowindow()
    {
        demo.value("demo")
        pwd.value("portal")<< Keys.ENTER
    }
}