package warmup2;

public class String2EndOther {
    public boolean endOther(String a, String b) {

        if (a.toLowerCase().endsWith(b.toLowerCase())
                || b.toLowerCase().endsWith(a.toLowerCase())) {

            return true;

        }
        return false;

    }
}
