import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

public class class1 {

    @DataProvider(name = "dp")
    public static Object[][] getData() {
        return new Object[][]{
                {"test", "test"},
                {1,2},
                {"three","four"},
                {true, false}

        };
    }
    @Test(enabled = false)
    public static boolean el1(Object o1, Object o2)
    {
        if (o1 == "test" || o2 == "test") {
            return true;
        }else {return false;}
    }

    @Test(enabled = false)
    public static void el2(Object o1, Object o2) {
        System.out.println("Test data: "+o1+" " +o2);
    }
    @BeforeSuite
    public void BeforeSuite() {System.out.println("BeforeSuite");}

    @BeforeClass
    public void BeforeClass() {System.out.println("BeforeClass");}

    @Test
    public void el3() {System.out.println("Test");}

    @Test(dataProvider = "dp")
    public void el4(Object o1, Object o2) {
        boolean dp = el1(o1, o2);
        if (dp == false) {el3();el2(o1,o2);}
    }

    @AfterMethod
    public void AfterMethod() {System.out.println("AfterMethod");}

}

