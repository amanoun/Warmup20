package warmup2;

public class Logic2MakeBricks {
    public boolean makeBricks(int small, int big, int goal) {
        int realbig = 5 * big;
        if (goal % 5 > small && !(goal % 5 == 0) || small+realbig<goal ) {
            return false;
        }
        return true;
    }
}
