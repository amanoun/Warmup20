package warmup2;

class String2BobThere {

    boolean bobThere(String str) {

        int length = str.length();

        if (length <= 2) {
            return false;
        }


        for (int i = 0; i < length - 1; i++) {

            if ("b".equals(Character.toString(str.charAt(i))) && i + 2 < length &&
                    "b".equals(Character.toString(str.charAt(i + 2)))) {

                return true;
            }


        }
        return false;
    }
}
