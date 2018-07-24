package warmup2;

public class LogicSumLimit {
    public int sumLimit(int a, int b) {



        String aDigits = String.valueOf(a);
        String sumLength = String.valueOf(a+b);

        if (aDigits.length()<sumLength.length() )
            return a;

        return a+b;

    }


}

