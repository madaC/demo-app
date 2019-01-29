package com.microfocus.demoapp.tests.ui;/**
 * Created by belozovs on 2/24/2015
 */

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TestC_Selenium_JUnit {

    static private TestData testData;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        testData = TestData.generate();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        testData.getDriver().quit();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testUIcaseE() {
        System.out.println("Proudly running test " + Thread.currentThread().getStackTrace()[1]);
        WebElement query;
        if (testData.isMusicApp()) {
            query = testData.getDriver().findElement(By.id("bandsList"));
            Assert.assertEquals(query.getTagName(), "div");
        }
        else {
            query = testData.getDriver().findElement(By.id("jenkins"));
            Assert.assertEquals(query.getTagName(), "body");
        }
        Assert.assertEquals(query.isDisplayed(), true);
    }

    @Category(SpecialTests.class)
    @Test
    public void testUIcaseF() {
        System.out.println("Proudly  running test " + Thread.currentThread().getStackTrace()[1]);
        WebElement query;
        if (testData.isMusicApp()) {
            query = testData.getDriver().findElement(By.id("totalVotes"));
            Assert.assertEquals(query.getTagName(), "div");
        }
        else {
            query = testData.getDriver().findElement(By.id("jenkins"));
            Assert.assertEquals(query.getTagName(), "body");
        }
        Assert.assertEquals(query.isDisplayed(), true);
    }

    @Test
    public void testUIcaseAlwaysPass() {
        System.out.println("Proudly running test " + Thread.currentThread().getStackTrace()[1]);
        Assert.assertTrue(true);
    }

}
