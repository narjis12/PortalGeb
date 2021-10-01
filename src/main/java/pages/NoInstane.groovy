package pages

import geb.Page

class NoInstane extends Page{

    static at ={
        waitFor { title == "Portal DEV Live" }

        }
    static content ={
        titnam(to: LoginPage){$(".login-logout-navigation .flex-auto")}
        //$(name: "description").click()
        //assert $(".a").text() == "a"
       //assert $(".a").tag() == "p"
       // assert $(".a").@title == "a"
            //here it will wait until it is not only available in DOM but alsi until it is displayed
        //dynamicallyShown(waitCondition: { it.displayed }) { $("p.dynamic") }
//to specify that the page changing action is performed when the content is clicked & then we can assert that
        //asyncPageLoadButton(to: AsyncPage) { $("button#load-content") }
        //asyncPageLoadButton.click()
        //assert page instanceof AsyncPage

    }
void name()
{
    println("hallo in name method")
    //titnam.click()
    //titnam.isDisplayed()

}
}
