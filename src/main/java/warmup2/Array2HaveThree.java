package warmup2;

class Array2HaveThree {

    boolean haveThree(int[] nums) {

        int threse = 0;
//        for (int i = 0; i < nums.length; i++){
//            if (nums[i]==3)
//                threse++;
//            i++;
//        }
//
//            return threse == 3;
//    }


        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == 3 & nums[i+1] == 3) return false;
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 3)
                threse++;
        }

        return threse == 3;
    }
}