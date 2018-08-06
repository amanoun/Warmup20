package warmup2;

public class Array2No14 {

    public boolean no14(int[] nums) {
        int ones = 0;
        int fours = 0;

        for (int i : nums) {
            if (i == 1) {

                ones++;

            } else if (i == 4) {
                fours++;
            }


        }
        return (ones == 0 || fours == 0);
    }
}
