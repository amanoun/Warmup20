package warmup2;

class Array2ShiftLeft {

    int[] shiftLeft(int[] nums) {
//        if (nums.length < 2) {
//            return nums;
//        }
//        int temp = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            temp = nums[i];
//            nums[i] = nums[i + 1];
//            nums[i + 1] = temp;
//
//        }
//
//        return nums;
//    }
        if (nums.length > 1) {
            int first = nums[0];
            for (int i = 0; i < nums.length - 1; i++)
                nums[i] = nums[i + 1];
            nums[nums.length - 1] = first;
        }
        return nums;
    }

}



