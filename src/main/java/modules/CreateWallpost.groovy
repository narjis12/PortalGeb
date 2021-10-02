package modules
import geb.Module
class CreateWallpostModule extends Module{
    static content ={
        wallpostArea{$(".input--textarea")}
        submitbutton{$(".button-primary > .flex-row-reverse > .flex-auto")}
        Totalcount{$("div[role='listitem']")}

    }
    int createwallpost()
    {
        int beforewallpostCount = Totalcount.size()
        wallpostArea.value("Hello")
        System.out.println("before count"+ beforewallpostCount)
        return beforewallpostCount
    }
    void submitWallpost(int beforecount)
    {
        submitbutton.click()
        waitFor(5) {beforecount++}
        int x = Totalcount.size()
       // Assert.assertNotEquals(beforecount, x)
        System.out.println("count after creating wallpost"+ x)

    }
}
