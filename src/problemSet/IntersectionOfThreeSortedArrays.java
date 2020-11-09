package problemSet;

import java.util.*;

/**
 * 双周赛10
 * 5079. 三个有序数组的交集
 * Easy
 *
 * https://leetcode-cn.com/contest/biweekly-contest-10/problems/intersection-of-three-sorted-arrays/
 *
 * https://leetcode-cn.com/submissions/detail/32307848/
 *
 * 使用map遍历，找出value为3的解
 */

public class IntersectionOfThreeSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,5,7,9};
        int[] arr3 = new int[]{1,3,4,5,8};

        new IntersectionOfThreeSortedArrays(arr1,arr2,arr3);
    }

    public IntersectionOfThreeSortedArrays(int[] arr1, int[] arr2, int[] arr3) {
        System.out.println(arraysIntersection(arr1, arr2, arr3));
    }

    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        Map<Integer,Integer> countMapping = new HashMap<>();
        for (int value : arr1) {
            countMapping.put(value, 1);
        }

        for (int value : arr2) {
            if (countMapping.containsKey(value)) {
                int valueCount = countMapping.get(value);
                countMapping.put(value, ++valueCount);
            }
        }

        for (int value : arr3) {
            if (countMapping.containsKey(value)) {
                int valueCount = countMapping.get(value);
                countMapping.put(value, ++valueCount);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Integer key : countMapping.keySet()){
            Integer count = countMapping.get(key);
            if (count == 3) {
                result.add(key);
            }
        }
        Collections.sort(result);
        return result;
    }
}
