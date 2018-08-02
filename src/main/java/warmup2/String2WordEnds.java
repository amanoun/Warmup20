package warmup2;

public class String2WordEnds {
    public String wordEnds(String str, String word) {

//        StringBuilder result = new StringBuilder();
//        int i = 0;
//
//        if (str.length() > word.length() && str.substring(0).startsWith(word)) {
//
//            i = word.length() - 1;
//            result.append(str.charAt(i + 1));
//        }
//
//        while (i < str.length() - word.length()) {
//            if (str.substring(i + 1, i + 1 + word.length()).equals(word)) {
//                result.append(str.charAt(i));
//                i = i + word.length();
//                if (i < str.length() - 1) {
//                    result.append(str.charAt(i + 1));
//                }
//            } else {
//
//                i++;
//            }
//        }
//
//        return result.toString();

        String result = "";
        int i = str.indexOf(word);

        while (!(i == -1)) {

            if (!(i == 0)) {
                result = result + str.charAt(i - 1);
            }

            if (i + word.length() == str.length()) {
                break;
            }
            result = result + str.charAt(i + word.length());
            i = str.indexOf(word, i + 1);
        }
        return result;
    }
}

