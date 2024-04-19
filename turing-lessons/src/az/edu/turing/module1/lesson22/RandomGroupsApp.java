package az.edu.turing.module1.lesson22;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomGroupsApp {
    public static void main(String[] args) {

        int [] nums = new int[10];
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new Random().nextInt(20);
        }
        for (int i = 0; i < nums.length; i++) {
            counts.put(nums[i], 1);
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    counts.put(nums[i], counts.get(nums[i]));
                }
            }
        }
    }
}
