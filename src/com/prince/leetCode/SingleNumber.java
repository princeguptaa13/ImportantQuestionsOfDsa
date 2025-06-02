package com.prince.leetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    static int printingSingleNumber(int[] nums, Map<Integer, Integer> freq) {
        for (int i : nums) {
            if (!freq.containsKey(i)) {
                freq.put(i, 1);
            } else {
                freq.put(i, freq.get(i) + 1);
            }
        }

        for (var e : freq.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println(e.getKey());
                return e.getKey();
            }
        }
        return -1; // Return a default value if no single number is found
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 2};
        Map<Integer, Integer> freq = new HashMap<>();

        // Calling the static method and printing the result
        System.out.println(printingSingleNumber(nums, freq));
    }
}
