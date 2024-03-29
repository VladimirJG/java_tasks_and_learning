package other_task_leet_code.easy;
//Example 1:
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
//Example 2:
//
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.



//Constraints:
//
//nums1.length == m
//nums2.length == n
//0 <= m <= 1000
//0 <= n <= 1000
//1 <= m + n <= 2000

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[] arr1 = {3, 4};
        double output = (sum(arr) + sum(arr1)) / (arr.length + arr1.length);
        System.out.println(output);
    }

    public static double sum(int[] arr) {
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
