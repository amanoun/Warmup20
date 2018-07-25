package warmup2;

public class ArrayMaxTrible {

    public int maxTriple(int[] nums) {

        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        if (first > middle && first > last) {
            return first;
        } else if (middle > first && middle > last) {
            return middle;
        }
        return last;
    }
}
