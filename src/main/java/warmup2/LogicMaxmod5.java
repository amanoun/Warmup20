package warmup2;

public class LogicMaxmod5 {
    public int maxMod5(int a, int b) {

        if(a==b){
            return 0;
        }
        int modA = a % 5;
        int modB = b % 5;

        if (modA == modB && a > b) {
            return b;
        } else if (modA == modB && a < b){
            return a;
        } else if (a > b) {
            return a;

        } else
            return b;
    }
}