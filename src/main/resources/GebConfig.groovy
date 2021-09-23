import org.openqa.selenium.firefox.FirefoxDriver
System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe")
driver = { new FirefoxDriver() }

baseUrl = "https://portal-dev.my-portal.io/site/register/?user=demo&password=portal"
reportsDir = "target/geb-reports"


