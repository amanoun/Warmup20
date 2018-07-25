package warmup2;

public class ArrayFront11 {
    public int[] front11(int[] a, int[] b) {

        if (a.length < 1 && b.length<1) {
            return new int[]{};
        }
        if (a.length < 1) {
            return new int[]{b[0]};
        }
        if (b.length < 1) {
            return new int[]{a[0]};
        }
        int firstInA = a[0];
        int firstinB = b[0];

        int c[] = {firstInA, firstinB};
        return c;

    }

}
