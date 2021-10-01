package pages

import geb.Page

class NoInstane extends Page{

    static at ={
        waitFor { title == "Portal DEV Live" }

        }
    static content ={
        titnam(to: LoginPage){$(".login-logout-navigation .flex-auto")}

    }
void name()
{
    println("hallo in name method")
    //titnam.click()

}
}
