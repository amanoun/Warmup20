package warmup2;

class String2RepeatFront {

    String repeatFront(String str, int n) {

//        String result = str.substring(0, n);
 String result = "";
        for (int i = 0; i < n; i++) {


            result = result + str.substring(0, n - i);
        }


        return result;
    }
}

