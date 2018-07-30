package warmup2;

public class String2EndOther {
    public boolean endOther(String a, String b) {

        return (a.toLowerCase().endsWith(b.toLowerCase())
                || b.toLowerCase().endsWith(a.toLowerCase()));

    }
}
