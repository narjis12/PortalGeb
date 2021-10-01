package modules
import geb.Module
import geb.module.TextInput
import org.junit.Assert

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

        Thread.sleep(4000)
        System.out.println("before count"+ beforewallpostCount)
        return beforewallpostCount
    }
    void submitWallpost(int beforecount)
    {
        submitbutton.click()
        Thread.sleep(2000)
        int x = Totalcount.size()
       // Assert.assertNotEquals(beforecount, x)
        System.out.println("count after creating wallpost"+ x)

    }
}
