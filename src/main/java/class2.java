import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class2 extends class1{

    @BeforeClass
    public void BeforeClass() {System.out.println("BeforeClass");}

    @Test(priority = 1)
    public void el11() {System.out.println("Test");}

    @Test(dataProvider = "dp", priority = 2)
    public void el12(Object o1, Object o2) {
        boolean el13 = class1.el1(o1, o2);
        if (el13 == false) {el11(); class1.el2(o1,o2);}
        else {AfterMethod();}
    }

    @AfterMethod(enabled = false)
    public void AfterMethod() {System.out.println("AfterMethod");}

    @AfterClass
    public void AfterClass() {System.out.println("AfterClass");}

}
