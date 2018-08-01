package warmup2;

class String2GetSandwish {
    String getSandwish(String str) {

        int begin = str.indexOf("bread");
        int end = str.lastIndexOf("bread");
        if ((begin != end) && (end != -1)) {

            return str.substring(begin + 5, end);
        }
        return "";
    }
}


//        int begin = 0;
//        int end = 0;
//
//        for (int i = 0; i < str.length() - 5; i++) {
//            if (str.substring(i, i + 5).equals("bread")) {
//                begin = i;
//                break;
//            }
//        }
//
//        for (int i = str.length() - 5; i >= 0; i--) {
//            if (str.substring(i, i + 5).equals("bread")) {
//                end = i;
//                break;
//            }
//        }
//
//        if (begin != end)
//            return str.substring(begin + 5, end);
//
//        return "";
//    }
//}
