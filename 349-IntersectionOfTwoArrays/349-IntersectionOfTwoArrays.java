// Last updated: 6/4/2026, 7:24:44 PM
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int n : nums2) {
            if (set1.contains(n)) {
                set2.add(n);
            }
        }

        int[] result = new int[set2.size()];
        int index = 0;
        for (int n : set2) {
            result[index++] = n;
        }

        return result;
    }
}