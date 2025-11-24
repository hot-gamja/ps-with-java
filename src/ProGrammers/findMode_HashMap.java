package ProGrammers;

import java.util.HashMap;
import java.util.Map;

public class findMode_HashMap {

}

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mode = -1;
        int countMax = 0;

        for (int key : map.keySet()) {
            int vlaue = map.get(key);

            if (vlaue > maxCount) {
                maxCount = vlaue;
                mode = key;
                countMax = 1;
            } else if (vlaue == maxCount) {
                countMax++;
            }
        }
        if (countMax > 1)
            return -1;
        return mode;
    }
}