import org.example.BubbleSortAlgorithm;
import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.xml.XmlTest;

import java.lang.reflect.Method;

public class UseTestNGAttributeTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - set env to initial state");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Clean env after suite");
    }

    @BeforeTest
    public void beforeTest(XmlTest xmlTest) {
        System.out.printf("Before Test %s %s", getClass().getSimpleName(), xmlTest.getName());
    }

    @AfterTest
    public void afterTest(XmlTest xmlTest) {
        System.out.printf("After Test %s %s", getClass().getSimpleName(), xmlTest.getName());
    }


    @BeforeGroups(groups = {"perftest", "first-group", "second-group", "functest"})
    public void beforeGroups() {
        System.out.println("\tBeforeGroups");
    }


    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod(Method method) {
        System.out.printf("\t\tBeforeMethod %s %s\n", getClass().getSimpleName(), method.getName());
    }

    @AfterMethod
    public void afterMethod(Method method) {
        System.out.printf("\t\tAfterMethod %s %s\n", getClass().getSimpleName(), method.getName());
    }
    @Test(groups = {"perftest", "first-group"}, dataProvider = "testDataTime", priority = 1, threadPoolSize = 2, invocationCount = 5, timeOut = 10000)
    public void testArr1000Perf(int arr_size, int x, int expected_time) {
        BubbleSortAlgorithm bsa = new BubbleSortAlgorithm();
        int[] arr = new int[arr_size + 1];
        for (int z = 0; z <= arr_size; z++) {
            arr[z] = z;
        }
        long start = System.nanoTime();
        bsa.bubbleSort(arr, x);
        long end = System.nanoTime();
        long diff = end - start;
        System.out.println("\t\t\tResult: " + start + " " + end + " " + diff);
        Assert.assertTrue(diff < expected_time, "diff lower than expected");
    }

}
