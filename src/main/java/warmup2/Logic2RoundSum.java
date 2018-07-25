package warmup2;

public class Logic2RoundSum {
    public int roundSum(int a, int b, int c) {
        int roundA = a % 10;
        int roundB = b % 10;
        int roundC = c % 10;

        if (roundA >= 5) {
            int leftA = 10 - roundA;
            roundA = a + leftA;
        } else roundA = a - roundA;

        if (roundB >= 5) {
            int leftB = 10 - roundB;
            roundB = b + leftB;
        } else roundB = b - roundB;

        if (roundC >= 5) {
            int leftC = 10 - roundC;
            roundC = c + leftC;
        } else roundC = c - roundC;


        return roundA + roundB + roundC;
    }

}
