package steps;

import pages.DashboardPage;
import pages.LoginPage;

public class PageInitializers {
    public static LoginPage loginPage;
    public static DashboardPage dash;


    //    initalize all the page objects
    public static void initializePageObjects() {
        loginPage = new LoginPage();
        dash=new DashboardPage();
    }
}