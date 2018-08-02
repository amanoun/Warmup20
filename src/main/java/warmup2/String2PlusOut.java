package warmup2;

class String2PlusOut {
    String plusOut(String str, String word) {
//        String result = "";
//        for (int i = 0; i < str.length();  ) {
//            if (str.substring(i).startsWith(word)) {
//                result = result + word;
//                i = i + word.length();
//            } else {
//                result = result + "+";
//                i = i + 1;
//            }
//        }
//        return result;
//
        String result = "";
        int i = 0;
        while (i<str.length()){
            if (str.substring(i).startsWith(word)) {
                result = result + word;
                i = i + word.length();

            }else {
                result = result + "+";
                i = i +1;
            }
        }
        return result;
    }

}




