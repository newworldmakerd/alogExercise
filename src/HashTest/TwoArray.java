package HashTest;

import java.lang.reflect.Array;
import java.util.*;

public class TwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap();
        Set<Integer> rel = new HashSet<>();
        int count=0;
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i],1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                rel.add(nums2[i]);
            }
        }
        Object[] objects = rel.toArray();
        int [] arr = new int[objects.length];
        for (int i = 0; i < objects.length; i++) {
            arr[i] = (int) objects[i];
        }
        return arr;
    }
}
