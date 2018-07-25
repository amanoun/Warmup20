package warmup2;

public class ArrayFix23 {
    public int[] fix23(int[] nums) {
        int last = nums[2];
        int first = nums[0];
        int middle = nums[1];
        if ((first == 2 && middle == 3)) {
            return new int[]{first, 0, last};

        } else if ((middle == 2 && last == 3)) {
            return new int[]{first, middle, 0};
        }
        return new int[]{first, middle, last};
    }
}
