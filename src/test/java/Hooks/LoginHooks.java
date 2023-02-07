package Hooks;

import cucumber.api.java.*;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginHooks {

    @Before()
    public void initialSetup1()
    {
      //  WebDriverManager.chromedriver().setup();
        System.out.println("@BeforeHook");
    }

    @After()
    public void tearOut2() {
        System.out.println("@AfterHook");
    }
   /* @BeforeStep()
    public void Setup()
    {
        System.out.println("@BeforeStep");
    }
    @AfterStep
    public void tearOut3()
    {
        System.out.println("@AfterStep");
    }
    @BeforeAll()
            public void hello()
    {
        System.out.println("Hello");
    }*/
/*
    @Before(order = 1)
    public void initialSetup1()
    {
        System.out.println("@BeforeHook... order   1");
    }
    @Before(order=2)
    public void Setup2()
    {
        System.out.println("@BeforeHook... order 2");
    }
    @After(order=1)
    public void tearOut()
    {
        System.out.println("@AfterHook.... order 1");
    }
    @After(order=2)
    public void tearOut2() {
        System.out.println("@AfterHook.... order 2");

    }
    @BeforeStep()
    public void Setup()
    {
        System.out.println("@BeforeStep");
    }
    @AfterStep
    public void tearOut3()
    {
        System.out.println("@AfterStep");
    }*/
}
