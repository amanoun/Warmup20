package warmup2;

public class String2BobThere {

    public boolean bobThere(String str) {

        int length = str.length();
        
        if (length<=2){
            return false;
        }



        for (int i = 0; i < length - 1; i++) {

            if (str.charAt(i)=='b' && i+2<length && str.charAt(i+2)=='b') {

                return true;
            }


        }
        return false;
    }
}
