package warmup2;

class String2RepeatFront {

    String repeatFront(String str, int n) {

//        String result = str.substring(0, n);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {


            builder = builder.append(str.substring(0,n - i)) ;
        }


        return builder.toString();
    }
}

