import org.testng.annotations.*;

public class class3 {

    @Test
    public void el33() {
        System.out.println("Test");
    }

    @AfterClass
    public void AfterClass() {System.out.println("AfterClass");}

    @AfterTest
    public void AfterTest() {System.out.println("AfterTest");}
}
