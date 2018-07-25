package warmup2;

import java.util.Arrays;

public class ArrayReverse3 {

    public int[] reverse3(int[] nums) {

        int last = nums[2];
        int first = nums[0];
        int middle = nums[1];
        return  new int[] {last, middle , first};
        }

    }

