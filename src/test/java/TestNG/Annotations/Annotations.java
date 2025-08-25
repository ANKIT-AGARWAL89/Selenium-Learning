package TestNG.Annotations;

import org.testng.annotations.*;

// BeforeTest annotation will work only before the Test block in the xml
// if a Test block containing class which doesn't contain BeforeTest method then it won't be applicable for that.

public class Annotations {
    @BeforeTest
    void BeforeTest() {
        System.out.println("This is a before Test method");
    }

    @AfterTest
    void AfterTest() {
        System.out.println("This is a After Test method");
    }

    @BeforeClass
    void setup() {
        System.out.println("This is a before class method");
    }

    @AfterClass
    void exit() {
        System.out.println("This is a After class method");
    }

    @BeforeMethod
    void login() {
        System.out.println("This is a before method");
    }

    @AfterMethod
    void logout() {
        System.out.println("This is a after method");
    }

    @Test
    void search() {
        System.out.println("This is a normal method");
    }
}
