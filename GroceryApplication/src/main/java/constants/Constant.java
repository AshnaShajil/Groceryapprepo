package constants;

public class Constant {
public static final String TESTDATAFILE=System.getProperty("user.dir")+"\\src\\test\\resources\\TestData.xlsx";
public static final String CONSTANTIMAGE=System.getProperty("user.dir")+"\\src\\test\\resources\\fernando-andrade-nAOZCYcLND8-unsplash.jpg";

public static final String CONGIGFILE=System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";

public static final String  LOGINWITHINVALIDPASSWORD   ="homepage is loaded  with incorrect password";
public static final String LOGINWITHVALIDPASSWORDVALIDUSERNAME="homepage is not loaded with valid credentials";
public static final String LOGINWITHINVALIDUSERNAME="homepage is loaded with incorrect username";
public static final String LOGINWITHINVALIDUSERNAMEANDINVALIDPASSWORD="homepage is loaded with invalid credentials";
public static final String LOGOUT="loginpage not loaded when logout";
public static final String ADMINUSERSPAGE="new admin is not created,";
public static final String MANAGECATEGORY="user is not able to create new category";
public static final String MANAGECONTACT="user is not able to update the managecontact";
public static final String MANAGEFOOTER="user is not able to update managefooter";
public static final String MANAGENEWS="user is not able to create new news in managenewspage";
}
