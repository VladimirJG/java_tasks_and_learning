package other_task_leet_code.easy;

//28. Find the Index of the First Occurrence in a String

//Given two strings needle and haystack, return the index of the
// first occurrence of needle in haystack, or -1 if needle is not part of haystack.

//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.

//Example 2:
//
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.
public class Task28 {
    public static void main(String[] args) {
        String haystack = "coleetdeleet";
        String needle = "leet";
        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        int index = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                index = i;
                break;
            } else {
                index = -1;
            }
        }
        return index;
    }
}

