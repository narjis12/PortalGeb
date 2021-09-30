package setup

import gherkin.lexer.Pa
import modules.Login
import geb.Page
import jxl.Sheet
import jxl.Workbook
import jxl.read.biff.BiffException
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.annotations.Test

class Base extends Page {
    static Login l
    public static Map<String, String> data
    public static int dataIndex = 0

    static void getTestData(String testName) throws BiffException, IOException, InterruptedException {
        data = new HashMap<String, String>()
        Sheet dataSheet = Workbook.getWorkbook(new File(("src/main/resources/TestData.xls"))).getSheet("testsheet")
        dataIndex = dataSheet.findCell(testName).getRow()
        for (int i = 1; i < dataSheet.getColumns(); i++) {
            for (int j = dataIndex - 1; j < dataSheet.getRows(); j++) {
                String key = dataSheet.getCell(i, j).getContents()
                String value = dataSheet.getCell(i, dataIndex).getContents()
                data.put(key, value)
            }
        }
    }
}
