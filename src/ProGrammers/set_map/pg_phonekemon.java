package ProGrammers.set_map;

import java.util.HashSet;

public class pg_phonekemon {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums)
            set.add(x);

        int pick = nums.length / 2;
        return Math.min(set.size(), pick);
    }
}
