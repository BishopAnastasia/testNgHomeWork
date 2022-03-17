import org.testng.annotations.*;

public class class4 {
    @BeforeTest
    public void BeforeTest() {System.out.println("BeforeTest");}

    @Test
    public void el44() {
        System.out.println("Test");
    }
    @AfterMethod
    public void AfterMethod() {System.out.println("AfterMethod");}

    @AfterTest
    public void AfterTest() {System.out.println("AfterTest");}

    @AfterSuite
    public void AfterSuite() {System.out.println("AfterSuite");}
}
