package warmup2;

import java.util.regex.Pattern;

class String2BobThere {
    boolean bobThere(String str) {

        Pattern p = Pattern.compile("b.b");   // the pattern to search for
        return p.matcher(str).find();

        }
    }


//        for (int i = 0; i < length - 1; i++) {
//
//            if ("b".equals(Character.toString(str.charAt(i))) && i + 2 < length &&
//                    "b".equals(Character.toString(str.charAt(i + 2)))) {
//
//                return true;
//            }
//
//
//        }
//        return false;
//    }

