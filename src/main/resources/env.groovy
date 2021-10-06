import org.openqa.selenium.OutputType
import org.openqa.selenium.WebDriverException
import geb.Browser
import geb.binding.BindingUpdater
def bindingUpdater
def theBrowser
Before{ scenario ->
    if(!binding.hasVariable('browser')) {
        theBrowser = new Browser()
        bindingUpdater = new BindingUpdater(binding, theBrowser)
        bindingUpdater.initialize()
        System.out.println("in catch block")
    } else {
        // save for later screenshot taking
        theBrowser = browser
    }
}

After { scenario ->
    bindingUpdater.browser.clearCookies()

    // embed screenshot into cucumber report
    if(scenario.failed) {
        try {
            scenario.embed(theBrowser.driver.getScreenshotAs(OutputType.BYTES), "image/png")
        } catch(WebDriverException e) {
            System.out.println("in catch block")
            // sometime firefox runs out of memory trying to take a screenshot, not a big deal so ignore
        } catch(MissingMethodException e) {
            // HTMLUnit doesn't support screenshots
        }
    }

}