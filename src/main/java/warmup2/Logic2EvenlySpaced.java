package warmup2;

public class Logic2EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int difAb = Math.abs(a - b);
        int difBc = Math.abs(b - c);
        int difCa = Math.abs(c - a);

        if ((a == b || a == c) && b != c) {
            return false;

        } else if (difAb == difBc || difBc == (2 * difCa) || difCa == difBc) {
            return true;

        } else if (difAb != difBc && difCa != difBc) {
            return false;
        }

        return false;

    }
}
