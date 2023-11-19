import org.example.BubbleSortAlgorithm;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BubbleSortAlgorithmTest {


    @DataProvider(name="testDataTime")
    public Object[][] TimeData(){
        return new Object[][] {
                {10,10,10000},
                {20,20,30},
                {20000,20000,20000},
                {200000,200000,200000},
                {1000000,1000000,1000000},
                {10000000,1000,1000},
                {100000000,1000,1000},
                {1000000000,1000,1000},
        };
    }


    @Test(groups = {"perftest", "checkintest"}, dataProvider = "testDataTime")
    public void testArr1000Perf(int arr_size, int x, int expected_time) {
        int[] arr = new int[arr_size + 1];
        for (int z = 0; z <= arr_size; z++) {
            arr[z] = z;
        }
        long start = System.nanoTime();
        BubbleSortAlgorithm.bubbleSort(arr, arr_size);
        long end = System.nanoTime();
        long diff = end - start;
        System.out.println(start + " " + end + " " + diff);
       // Assert.assertTrue(diff < expected_time, "diff lower than expected");
    }

}