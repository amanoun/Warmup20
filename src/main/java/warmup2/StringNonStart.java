package warmup2;

public class StringNonStart {
    public String nonStart(String a, String b) {
        String updatedA = a.substring(1);
        String updatedB = b.substring(1);
        return updatedA+updatedB;
    }

}
