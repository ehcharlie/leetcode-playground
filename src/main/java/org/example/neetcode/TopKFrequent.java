package org.example.neetcode;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequent {

    public static int[] example(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            arr.add(new int[] {m.getValue(), m.getKey()});
        }

        arr.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1];
        }

        return res;
    }

    public static int[] example_two(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Map<Integer, Integer> fm = map.entrySet().stream()
                .filter(e -> e.getValue() >= k).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return fm.keySet().stream().mapToInt(Integer::intValue).toArray();
    }
}