package warmup2;


class Array2CountEvens {
    int countEvens(int[] nums) {
        int count = 0;

        for (int i : nums) {
            if (i % 2 == 0) {
                count++;

            }
        }
        return count;
    }

}

