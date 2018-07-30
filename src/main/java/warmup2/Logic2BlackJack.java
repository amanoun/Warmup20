package warmup2;

public class Logic2BlackJack {

    public int blackjack(int a, int b) {
        int aNear = 21 - a;
        int bNear = 21 - b;
        boolean aCloser = a <= 21;
        boolean bCloser = b <= 21;

        if (aNear < 0 && bNear < 0) {
            return 0;

        } else if (aCloser && !bCloser) {

            return a;

        } else if (aCloser && bCloser && aNear < bNear) {
            return a;

        }
        return b;
    }
}
