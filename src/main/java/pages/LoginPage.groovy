package pages

import geb.Page
import modules.Login


class LoginPage extends Page{
   public static String a="bjb";
    static at={
        System.out.println("at")
    }
    static content ={
        logcre{module(Login)}

    }



}
