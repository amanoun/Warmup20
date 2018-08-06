package warmup2;

public class Array2Sum28 {
    public boolean sum28(int[] nums) {

        int count = 0;

        for (int i : nums) {
            if (i == 2) {
                count = count + i;

            }

        }
        return (count == 8);
    }
}
